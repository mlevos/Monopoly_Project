package dto.cartes.chance;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import org.junit.Test;

import dto.DTOFactory;

public class DTOChanceTest {
	@Test
	public void getListChance() throws IOException, URISyntaxException{
		List<DTOChance> ListChance = DTOFactory.getListDTOChance(); 
		assertNotNull(ListChance);
	}
}
