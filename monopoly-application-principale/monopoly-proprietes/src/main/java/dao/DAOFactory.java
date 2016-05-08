package dao;

import dao.propriete.DAOPropriete;
import dao.propriete.DAOProprieteImpl;

public class DAOFactory {
	public static DAOPropriete getDAOPropriete(){
		return new DAOProprieteImpl(DAOFactoryProperties.getResourcesInfo()); 
	}

}
