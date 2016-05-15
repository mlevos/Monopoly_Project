package dao.cases;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.Test;

import dao.DAOFactory;

public class DAOCasesTest {
	
	@Test
	public void getProprieteTest() throws URISyntaxException{
		DAOCases getterCases = DAOFactory.getDAOCases(); 
		try {
			assertNotNull(getterCases.getCases());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
