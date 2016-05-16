package dto;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import dao.DAOFactory;
import dao.propriete.DAOPropriete;
import dto.proprietes.monopoles.DTOCompagnie;
import dto.proprietes.monopoles.DTOGare;
import dto.proprietes.monopoles.DTOMonopole;
import dto.proprietes.terrains.DTOTerrain;
import dto.proprietes.terrains.DTOTerrainBleuCiel;
import dto.proprietes.terrains.DTOTerrainBleuRoi;
import dto.proprietes.terrains.DTOTerrainJaune;
import dto.proprietes.terrains.DTOTerrainOrange;
import dto.proprietes.terrains.DTOTerrainRouge;
import dto.proprietes.terrains.DTOTerrainVert;
import dto.proprietes.terrains.DTOTerrainsMauve;
import dto.proprietes.terrains.DTOTerrainsViolet;

public class DTOFactory {
	
	private static List<String> arrayGroupeTerrain = Arrays.asList(
			"mauve", "rouge", "jaune", "orange","bleu roi","bleu ciel", "vert","violet");
	private static List<String> arrayGroupeMonopole = Arrays.asList("gares", "compagnies");
	private static final String regexLoyersTerrains = "\\."; 
	
	
	public static DTOTerrain getDTOTerrain(String groupe, String[] parametres){
		/*
		 * Méthode qui construit des terrains en fonction du groupe
		 * @param groupe Groupe du terrain
		 * @param parametres les parametres du terrain
		 */
		String nom = parametres[0]; 
		int achat = Integer.parseInt(parametres[2]);
		int coutImmobilier = Integer.parseInt(parametres[3]);
		String[] loyers = parametres[4].split(regexLoyersTerrains);
		int loyer_1 = Integer.parseInt(loyers[0]);
		int loyer_2 = Integer.parseInt(loyers[1]);
		int loyer_3 = Integer.parseInt(loyers[2]);
		int loyer_4 = Integer.parseInt(loyers[3]);
		int loyer_5 = Integer.parseInt(loyers[4]);
		int loyer_6 = Integer.parseInt(loyers[5]);
		
		if(groupe.equals("rouge")){
			return new DTOTerrainRouge(nom, achat, coutImmobilier, 
					loyer_1, loyer_2, loyer_3, loyer_4, loyer_5, loyer_6);
		}
		else if(groupe.equals("mauve")){
			return new DTOTerrainsMauve(nom, achat, coutImmobilier, 
					loyer_1, loyer_2, loyer_3, loyer_4, loyer_5, loyer_6);
		}
		else if(groupe.equals("jaune")){
			return new DTOTerrainJaune(nom, achat, coutImmobilier, 
					loyer_1, loyer_2, loyer_3, loyer_4, loyer_5, loyer_6);
		}
		else if(groupe.equals("orange")){
			return new DTOTerrainOrange(nom, achat, coutImmobilier, 
					loyer_1, loyer_2, loyer_3, loyer_4, loyer_5, loyer_6);
		}
		else if(groupe.equals("bleu roi")){
			return new DTOTerrainBleuRoi(nom, achat, coutImmobilier, 
					loyer_1, loyer_2, loyer_3, loyer_4, loyer_5, loyer_6);
		}
		else if(groupe.equals("bleu ciel")){
			return new DTOTerrainBleuCiel(nom, achat, coutImmobilier, 
					loyer_1, loyer_2, loyer_3, loyer_4, loyer_5, loyer_6);
		}
		else if(groupe.equals("vert")){
			return new DTOTerrainVert(nom, achat, coutImmobilier, 
					loyer_1, loyer_2, loyer_3, loyer_4, loyer_5, loyer_6);
		}
		else if(groupe.equals("violet")){
			return new DTOTerrainsViolet(nom, achat, coutImmobilier, 
					loyer_1, loyer_2, loyer_3, loyer_4, loyer_5, loyer_6);
		}
		else{
			//pas de groupe
			return null;
		}
	}
	
	public static List<DTOTerrain> getLisDTOTerrains() throws IOException, URISyntaxException{
		/*
		 * Méthode sortant la liste de tous les terrains présente dans le fichier info.csv
		 */
		
		//Création du producteur 
		DAOPropriete dao = DAOFactory.getDAOPropriete();
		
		//Création de la liste resultante
		List<DTOTerrain> listTerrains = new ArrayList<DTOTerrain>();
		
		//récupération des informations du fichier csv
		HashMap<Integer, String[]> hashMapPropriete = dao.getListProprietes();
		
		//Consctruction de chaque terrain par groupe 
		for(String[] values : hashMapPropriete.values()){
	        String groupe = values[1];
	        String[] parametres = values;
	        if(arrayGroupeTerrain.contains(groupe)){
	        	DTOTerrain terrain = getDTOTerrain(groupe , parametres); 
        		listTerrains.add(terrain);
	        }     	 
	    }		
		return listTerrains;	
	}
	
	public static DTOMonopole getDTOMonopole(String groupe, String[] parametres){
		/*
		 * Méthode qui construit des terrains en fonction du groupe
		 * @param groupe Groupe du terrain
		 * @param parametres les parametres du terrain
		 */
		String nom = parametres[0]; 
		int achat = Integer.parseInt(parametres[2]);
		int loyer = 0; 
		if(!(parametres[4].isEmpty())) // Mes compagnie n'ont pas de loyer fixe au départ
			loyer = Integer.parseInt(parametres[4]);

		
		if(groupe.equals("gares")){
			return new DTOGare(nom, achat, loyer);
		}
		else if(groupe.equals("mauve")){
			return new DTOCompagnie(nom, achat, loyer);
		}
		else{
			//pas de groupe
			return null;
		}
	}
	public static List<DTOMonopole> getLisDTOMonopoles() throws IOException, URISyntaxException{
		/*
		 * Méthode sortant la liste de tous les terrains présente dans le fichier info.csv
		 */
		
		//Création du producteur 
		DAOPropriete dao = DAOFactory.getDAOPropriete();
		
		//Création de la liste resultante
		List<DTOMonopole> listMonopoles = new ArrayList<DTOMonopole>();
		
		//récupération des informations du fichier csv
		HashMap<Integer, String[]> hashMapPropriete = dao.getListProprietes();
		
		//Consctruction de chaque terrain par groupe 
		for(String[] values : hashMapPropriete.values()){
	        String groupe = values[1];
	        String[] parametres = values; 
	        if(arrayGroupeMonopole.contains(groupe)){
	        	DTOMonopole monopoles = getDTOMonopole(groupe , parametres); 
        		listMonopoles.add(monopoles);
	        }     	 
	    }		
		return listMonopoles;	
	}
}
