package dao;

import dao.cases.DAOCase;
import dao.cases.DAOCaseImpl;

public class DAOFactory {
	
	public static DAOCase getDAOCases(){
		return new DAOCaseImpl(DAOFactoryProperties.getResourcesInfo()); 
	}
}
