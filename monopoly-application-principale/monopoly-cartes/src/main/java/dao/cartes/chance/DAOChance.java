package dao.cartes.chance;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;

public interface DAOChance {
	HashMap<Integer, String[]> getListCartesChances() throws IOException, URISyntaxException;
}
