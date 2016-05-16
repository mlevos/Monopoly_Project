package dto;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import dao.DAOFactory;
import dao.cartes.cc.DAOCaisseDeCommuaute;
import dao.cartes.chance.DAOChance;
import dto.cartes.cc.DTOCCAller;
import dto.cartes.cc.DTOCCCadeau;
import dto.cartes.cc.DTOCCChoix;
import dto.cartes.cc.DTOCCDepense;
import dto.cartes.cc.DTOCCPrison;
import dto.cartes.cc.DTOCCRecette;
import dto.cartes.cc.DTOCCRevenir;
import dto.cartes.cc.DTOCaisseDeCommunaute;
import dto.cartes.chance.DTOChance;
import dto.cartes.chance.DTOChanceAller;
import dto.cartes.chance.DTOChanceBonus;
import dto.cartes.chance.DTOChanceDepense;
import dto.cartes.chance.DTOChanceDeplacementRelatif;
import dto.cartes.chance.DTOChanceFraisImmo;
import dto.cartes.chance.DTOChancePrison;
import dto.cartes.chance.DTOChanceRecette;

public class DTOFactory {
	
	/**
	 * Méthode de création de cartes chance 
	 * @param evenement  
	 * @param intitule 
	 * @param parameters
	 */
	public static DTOChance getDTOChance(String evenement, String intitule, String parameters){
		if(evenement.equals("aller")){
			return new DTOChanceAller(intitule, parameters);
		}
		else if(evenement.equals("bonus")){
			return new DTOChanceBonus(intitule, parameters);
		}
		else if(evenement.equals("depense")){
			return new DTOChanceDepense(intitule, parameters);
		}
		else if(evenement.equals("deplacement relatif")){
			return new DTOChanceDeplacementRelatif(intitule, parameters);
		}
		else if(evenement.equals("frais immo")){
			return new DTOChanceFraisImmo(intitule, parameters);
		}
		else if(evenement.equals("prison")){
			return new DTOChancePrison(intitule, parameters);
		}
		else if(evenement.equals("recette")){
			return new DTOChanceRecette(intitule, parameters);
		}
		else{
			return null;
		}	
	}
	
	
	/**
	 * Méthode de listage des différentes cartes chances
	 * @return listCartesChances
	 * @throws IOException
	 * @throws URISyntaxException
	 */
	public static List<DTOChance> getListDTOChance() throws IOException, URISyntaxException{
		List<DTOChance> listCartesChances = new ArrayList<DTOChance>();
		DAOChance dao = DAOFactory.getDAOChance(); 
		HashMap<Integer, String[]> hashMapCartesChance = dao.getListCartesChances();
		for(String[] value : hashMapCartesChance.values()){
			String intitule = value[1];
			String evenement = value[2];
			String parameters = value[3];
			DTOChance chance = getDTOChance(evenement, intitule, parameters);
			listCartesChances.add(chance); 
		}
		return listCartesChances; 
	}
	
	/**
	 * 
	 * Méthode de création des différentes carte de caisse de comunauté
	 * @param evenement
	 * @param intitule
	 * @param parameters
	 * @return 
	 */
	public static DTOCaisseDeCommunaute getDTOCaisseDeCommunaute(String evenement, String intitule, String parameters){
		if(evenement.equals("aller")){
			return new DTOCCAller(intitule, parameters);
		}
		else if(evenement.equals("bonus")){
			return new DTOCCAller(intitule, parameters);
		}
		else if(evenement.equals("cadeau")){
			return new DTOCCCadeau(intitule, parameters);
		}
		else if(evenement.equals("choix")){
			return new DTOCCChoix(intitule, parameters);
		}
		else if(evenement.equals("depense")){
			return new DTOCCDepense(intitule, parameters);
		}
		else if(evenement.equals("prison")){
			return new DTOCCPrison(intitule, parameters);
		}
		else if(evenement.equals("recette")){
			return new DTOCCRecette(intitule, parameters);
		}
		else if(evenement.equals("recette")){
			return new DTOCCRevenir(intitule, parameters);
		}
		else{
			return null;
		}	
	}
	
	
	/**
	 * Méthode de listage des cartes Caisse communauté
	 * @return
	 * @throws IOException
	 * @throws URISyntaxException
	 */
	public static List<DTOCaisseDeCommunaute> getListDTOCaisseDeCommunaute() throws IOException, URISyntaxException{
		List<DTOCaisseDeCommunaute> listCartesCC = new ArrayList<DTOCaisseDeCommunaute>();
		DAOCaisseDeCommuaute dao = DAOFactory.getDAOCaisseDeCommuaute(); 
		HashMap<Integer, String[]> hashMapCartesCC = dao.getListCartesCC();
		for(String[] value : hashMapCartesCC.values()){
			String intitule = value[1];
			String evenement = value[2];
			String parameters = value[3];
			DTOCaisseDeCommunaute cc = getDTOCaisseDeCommunaute(evenement, intitule, parameters);
			listCartesCC.add(cc); 
		}
		return listCartesCC; 
	}
}
