package dto.proprietes.terrains;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import org.junit.Test;

import dto.DTOFactory;
import dto.proprietes.monopoles.DTOMonopole;

public class DTOMonopolesTest {
	@Test
	public void getListTerrain() throws IOException, URISyntaxException{
		List<DTOMonopole> ListMonopoles = DTOFactory.getLisDTOMonopoles(); 
		assertNotNull(ListMonopoles);
		
	}

}
