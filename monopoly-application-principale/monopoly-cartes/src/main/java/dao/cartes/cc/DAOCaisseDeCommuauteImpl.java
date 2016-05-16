package dao.cartes.cc;

import java.io.File;
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
	
	/**
	 * @author TiTiaso
	 * @return 
	 */
	public HashMap<Integer, String[]> getListCartesCC() throws IOException, URISyntaxException {
		HashMap<Integer, String[]> hashMapCases = new  HashMap<Integer, String[]>();
		File file = new File(DAOCaisseDeCommuauteImpl.class.getResource(path_csv_carte).toURI()); 
		Reader fileInfo = new FileReader(file);
		Iterable<CSVRecord> records = CSVFormat.EXCEL.withHeader().parse(fileInfo);
		for (CSVRecord record : records) {
			if(record.get("GROUPE") == "CC"){
				int id = Integer.parseInt(record.get("NUMERO"));
				String intitule = record.get("INTITULE");
				String evenement = record.get("EVENEMENT");
				String parametres = record.get("PARAMETRES"); 
				hashMapCases.put(id , (new String[]{intitule,evenement, parametres}));
			}
		}
		return hashMapCases;
	}
}
