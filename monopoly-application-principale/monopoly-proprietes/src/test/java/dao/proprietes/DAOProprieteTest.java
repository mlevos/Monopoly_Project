package dao.proprietes;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;

import org.junit.Test;

import dao.DAOFactory;
import dao.propriete.DAOPropriete;

public class DAOProprieteTest{

	@Test
	public void getProprieteTest() throws URISyntaxException{
		DAOPropriete getterPropriete = DAOFactory.getDAOPropriete(); 
		try {
			assertNotNull(getterPropriete.getListProprietes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
