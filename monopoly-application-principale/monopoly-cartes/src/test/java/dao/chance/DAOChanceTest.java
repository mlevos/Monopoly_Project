package dao.chance;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.Test;

import dao.DAOFactory;


public class DAOChanceTest {
	
	@Test
	public void getCartesChanceTest() throws URISyntaxException{
		DAOChance getterChance = DAOFactory.getDAOChance(); 
		try {
			assertNotNull(getterChance.getListCartesChances());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
