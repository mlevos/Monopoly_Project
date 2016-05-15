package dao.cases;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;
import java.util.HashMap;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class DAOCasesImpl implements DAOCases{
	private String path_csv_info;
	
	public DAOCasesImpl(String path) {
		path_csv_info = path; 	
	}
	

	public HashMap<Integer, String[]> getCases() throws IOException, URISyntaxException {
		/*
		 * Méthode de récupération des cases du jeu
		 */
		HashMap<Integer, String[]> hashMapCases = new  HashMap<Integer, String[]>(); 
		Reader fileInfo = new FileReader(path_csv_info);
		Iterable<CSVRecord> records = CSVFormat.EXCEL.withHeader().parse(fileInfo);
		for (CSVRecord record : records) {
			int numero = Integer.parseInt(record.get("NUMERO"));
			String nom = record.get("NOM");
			String evenement = new String(); 
			if((evenement = record.get("EVENEMENT")) == null){evenement="NONE";}
			String groupe = new String(); 
			if((groupe = record.get("GROUPE")) == null){groupe="NONE";}
			String achat = new String(); 
			if((achat = record.get("ACHAT")) == null){achat="NONE";}
			hashMapCases.put(numero , (new String[]{nom, evenement, groupe, achat}));
		}
		return hashMapCases;
	}
	
}
