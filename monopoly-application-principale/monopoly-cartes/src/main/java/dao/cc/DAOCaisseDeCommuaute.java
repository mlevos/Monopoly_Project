package dao.cc;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;

public interface DAOCaisseDeCommuaute {
	HashMap<Integer, String[]> getListCartesChances() throws IOException, URISyntaxException;
}
