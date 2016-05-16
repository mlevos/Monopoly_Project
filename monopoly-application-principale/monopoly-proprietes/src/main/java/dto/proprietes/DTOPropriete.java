package dto.proprietes;

public abstract class DTOPropriete {
	protected String nom = new String(); 
	protected int achat;
	protected int loyer; 
	
	public DTOPropriete() {
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAchat() {
		return achat;
	}

	public void setAchat(int achat) {
		this.achat = achat;
	}
	
	public abstract void setLoyer(); 

}
