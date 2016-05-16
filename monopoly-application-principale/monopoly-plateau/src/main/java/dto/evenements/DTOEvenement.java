package dto.evenements;

public abstract class DTOEvenement {
	protected String parametre;
	
	public DTOEvenement(String parametre) {
		this.parametre = parametre; 
	}
	public abstract void actionEvenement(); 

}
