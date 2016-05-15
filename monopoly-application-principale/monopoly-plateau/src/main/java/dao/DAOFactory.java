package dao;

import dao.cases.DAOCases;
import dao.cases.DAOCasesImpl;

public class DAOFactory {
	
	public static DAOCases getDAOCases(){
		return new DAOCasesImpl(DAOFactoryProperties.getResourcesInfo()); 
	}

}
