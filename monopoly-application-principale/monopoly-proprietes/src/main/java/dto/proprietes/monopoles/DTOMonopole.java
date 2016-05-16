package dto.proprietes.monopoles;

import dto.proprietes.DTOPropriete;

public abstract class DTOMonopole extends DTOPropriete{
	

	public DTOMonopole(String nom, int achat, int loyer) {
		this.nom = nom; 
		this.achat = achat; 
		this.loyer = loyer; 
		// TODO Auto-generated constructor stub
	}
	public abstract void setLoyer(int loyer, int parametre); 


}
