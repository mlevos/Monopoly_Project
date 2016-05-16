package dto.cartes;

public abstract class DTOCartes {
	protected String intitule = new String(); 
	protected String parametres = new String(); 
	
	public DTOCartes(String intitule, String parametres) {
		this.intitule = intitule; 
		this.parametres = parametres; 
	}
	public abstract void evenement(String parametres); 
}
