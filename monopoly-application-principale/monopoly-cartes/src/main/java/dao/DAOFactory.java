package dao;

import dao.cartes.cc.DAOCaisseDeCommuaute;
import dao.cartes.cc.DAOCaisseDeCommuauteImpl;
import dao.cartes.chance.DAOChance;
import dao.cartes.chance.DAOChanceImpl;

public class DAOFactory {
	public static DAOChance getDAOChance(){
		return new DAOChanceImpl(DAOFactoryProperties.getResourcesCarte()); 
	}
	
	public static DAOCaisseDeCommuaute getDAOCaisseDeCommuaute(){
		return new DAOCaisseDeCommuauteImpl(DAOFactoryProperties.getResourcesCarte()); 
	}

}
