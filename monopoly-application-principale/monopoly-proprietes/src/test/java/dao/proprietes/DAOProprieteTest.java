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
			HashMap<Integer, String[]> hashMapPropriete = getterPropriete.getListProprietes();
			for(String[] test : hashMapPropriete.values()){
				if(test[1].equals("gares") == false && test[1].equals("compagnies") == false){
					String[] split = test[4].split("\\."); 
					System.out.println(split[0]);
				}
				
			}
			assertNotNull(getterPropriete.getListProprietes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
