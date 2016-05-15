package dao.proprietes;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.Test;

import dao.DAOFactory;
import dao.propriete.DAOPropriete;

public class DAOProprieteTest{
	public static final String RESOURCES_INFO = "/csv/info.csv"; 
	
	@Test
	public void getProprieteTest() throws URISyntaxException{
		DAOPropriete getterPropriete = DAOFactory.getDAOPropriete(); 
		try {
			assertNotNull("oui", getterPropriete.getListProprietes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
