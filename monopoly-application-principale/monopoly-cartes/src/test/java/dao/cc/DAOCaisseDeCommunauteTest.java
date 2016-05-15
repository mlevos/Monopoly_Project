package dao.cc;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.Test;

import dao.DAOFactory;

public class DAOCaisseDeCommunauteTest {
	
	@Test
	public void getCaisseDeCommunauteTest() throws URISyntaxException{
		DAOCaisseDeCommuaute getterCC = DAOFactory.getDAOCaisseDeCommuaute(); 
		try {
			assertNotNull(getterCC.getListCartesCC());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
