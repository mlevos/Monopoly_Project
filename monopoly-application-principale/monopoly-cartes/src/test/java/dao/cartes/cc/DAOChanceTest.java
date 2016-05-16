package dao.cartes.cc;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.Test;

import dao.DAOFactory;
import dao.cartes.chance.DAOChance;


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
