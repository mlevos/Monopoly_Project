package dto.proprietes.terrains;

import dto.proprietes.DTOPropriete;

/**
 * 
 * @author TiTiaso
 * @version 0.1
 *
 */

public abstract class DTOTerrain extends DTOPropriete{
	protected int coutImmobilier;
	protected int loyer_1;
	protected int loyer_2; 
	protected int loyer_3; 
	protected int loyer_4; 
	protected int loyer_5; 
	protected int loyer_6;
	
	public DTOTerrain(String nom, int achat, int coutImmobilier,
			int loyer_1, int loyer_2,int loyer_3, int loyer_4, 
			int loyer_5, int loyer_6) {
		
		this.nom = nom; 
		this.achat = achat; 
		this.coutImmobilier = coutImmobilier; 
		this.loyer_1 = loyer_1; 
		this.loyer_2 = loyer_2;
		this.loyer_3 = loyer_3; 
		this.loyer_4 = loyer_4; 
		this.loyer_5 = loyer_5; 
		this.loyer_6 = loyer_6; 
	}
	public int getCoutImmobilier() {
		return coutImmobilier;
	}
	public void setCoutImmobilier(int coutImmobilier) {
		this.coutImmobilier = coutImmobilier;
	}
	public int getLoyer_1() {
		return loyer_1;
	}
	public void setLoyer_1(int loyer_1) {
		this.loyer_1 = loyer_1;
	}
	public int getLoyer_2() {
		return loyer_2;
	}
	public void setLoyer_2(int loyer_2) {
		this.loyer_2 = loyer_2;
	}
	public int getLoyer_3() {
		return loyer_3;
	}
	public void setLoyer_3(int loyer_3) {
		this.loyer_3 = loyer_3;
	}
	public int getLoyer_4() {
		return loyer_4;
	}
	public void setLoyer_4(int loyer_4) {
		this.loyer_4 = loyer_4;
	}
	public int getLoyer_5() {
		return loyer_5;
	}
	public void setLoyer_5(int loyer_5) {
		this.loyer_5 = loyer_5;
	}
	public int getLoyer_6() {
		return loyer_6;
	}
	public void setLoyer_6(int loyer_6) {
		this.loyer_6 = loyer_6;
	} 
	
	public void setLoyer(){
		/*
		 * Méthode setter du loyer actif en fonction du joueur 
		 * 
		 */ 
	}
	
}
