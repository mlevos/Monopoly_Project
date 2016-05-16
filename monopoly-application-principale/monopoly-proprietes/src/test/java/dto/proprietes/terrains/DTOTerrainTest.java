package dto.proprietes.terrains;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import org.junit.Test;

import dto.DTOFactory;

public class DTOTerrainTest {
	@Test
	public void getListTerrain() throws IOException, URISyntaxException{
		List<DTOTerrain> ListTerrains = DTOFactory.getLisDTOTerrains(); 
		assertNotNull(ListTerrains);
		
	}

}
