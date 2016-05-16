package dao.cartes.cc;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;
import java.util.HashMap;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class DAOCaisseDeCommuauteImpl implements DAOCaisseDeCommuaute{
	
	private String path_csv_carte;
	
	public DAOCaisseDeCommuauteImpl(String path) {
		path_csv_carte = path;
	}

	public HashMap<Integer, String[]> getListCartesCC() throws IOException, URISyntaxException {
		/*
		 * M�thode de r�cup�ration des cartes de caisse de caummunaute 
		 */
		HashMap<Integer, String[]> hashMapCases = new  HashMap<Integer, String[]>(); 
		Reader fileInfo = new FileReader(path_csv_carte);
		Iterable<CSVRecord> records = CSVFormat.EXCEL.withHeader().parse(fileInfo);
		for (CSVRecord record : records) {
			if(record.get("GROUPE") == "CC"){
				int id = Integer.parseInt(record.get("NUMERO"));
				String groupe = record.get("GROUPE"); 
				String intitule = record.get("EVENEMENT"); 
				String parametres = record.get("PARAMETRES"); 
				hashMapCases.put(id , (new String[]{groupe, intitule, parametres}));
			}
		}
		return hashMapCases;
	}
}
