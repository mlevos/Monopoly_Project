package dao.cases;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;

public interface DAOCase {
	HashMap<Integer, String[]> getCases() throws IOException, URISyntaxException;

}
