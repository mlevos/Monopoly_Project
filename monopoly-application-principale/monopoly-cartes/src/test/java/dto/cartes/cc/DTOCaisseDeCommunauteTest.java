package dto.cartes.cc;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import org.junit.Test;

import dto.DTOFactory;

public class DTOCaisseDeCommunauteTest {
	@Test
	public void getListChance() throws IOException, URISyntaxException{
		List<DTOCaisseDeCommunaute> ListCC = DTOFactory.getListDTOCaisseDeCommunaute(); 
		assertNotNull(ListCC);
	}
}
