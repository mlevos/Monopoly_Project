package dao.propriete;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;
import java.util.HashMap;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class DAOProprieteImpl implements DAOPropriete{
	/*
	 * Classe de récupération des propriétés 
	 * 
	 */
	private String path_csv_info;
	
	public DAOProprieteImpl(String path) {
		path_csv_info = path; 
	}
	
	public HashMap<Integer, String[]> getListProprietes() throws IOException, URISyntaxException {
		/*
		 * Méthode de récupération des propriété
		 */
		HashMap<Integer, String[]> hashMapPropriete = new  HashMap<Integer, String[]>();
		File file = new File(DAOProprieteImpl.class.getResource(path_csv_info).toURI()); 
		Reader fileInfo = new FileReader(file);
		Iterable<CSVRecord> records = CSVFormat.EXCEL.withHeader().parse(fileInfo);
		for (CSVRecord record : records) {
			String groupe = new String(); 
			if((groupe = record.get("GROUPE")) != null){
				// Selection des propriétés
				int id = Integer.parseInt(record.get("NUMERO")); 
				String nom = record.get("NOM");
				String achat = record.get("ACHAT");
				String coutImmobilier = new String(); 
				if((coutImmobilier = record.get("COUT IMMOBILIER")) == null){
					// dans le cas où la propriété n'a pas de cout immobilier ( exempel gars )
					coutImmobilier = "NONE"; 
				}
				String loyers = new String();
				if((loyers = record.get("LOYERS")) == null){
					// dans le cas où la propriété n'a pas de loyers ( exempel gars )
					loyers = "NONE"; 
				}
				 hashMapPropriete.put(id , (new String[]{nom, groupe, achat,coutImmobilier,loyers})); 
			}
		}
		return hashMapPropriete;
	}
	public String getPath_csv_info() {
		return path_csv_info;
	}
	public void setPath_csv_info(String path_csv_info) {
		this.path_csv_info = path_csv_info;
	}
	
	
}
