package dao;

import dao.cc.DAOCaisseDeCommuaute;
import dao.cc.DAOCaisseDeCommuauteImpl;
import dao.chance.DAOChance;
import dao.chance.DAOChanceImpl;

public class DAOFactory {
	public static DAOChance getDAOChance(){
		return new DAOChanceImpl(DAOFactoryProperties.getResourcesCarte()); 
	}
	
	public static DAOCaisseDeCommuaute getDAOCaisseDeCommuaute(){
		return new DAOCaisseDeCommuauteImpl(DAOFactoryProperties.getResourcesCarte()); 
	}

}
