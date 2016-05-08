package dao.propriete;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;

public interface DAOPropriete {

	HashMap<Integer, String[]> getListProprietes() throws IOException, URISyntaxException;
	public String getPath_csv_info();

}
