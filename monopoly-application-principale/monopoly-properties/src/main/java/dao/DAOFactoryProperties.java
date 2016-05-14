package dao;

public class DAOFactoryProperties {
	/***
	 * Classe de description des �th des fichier ressources
	 * utilis�s dans les autres DAOFactory
	 */
	private static final String RESOURCES_INFO = "/csv/info.csv";
	private static final String RESOURCES_CARTES = "/csv/carte_chance_cc.csv";
	
	public static String getResourcesInfo() {
		return RESOURCES_INFO;
	}
	
	public static String getResourcesCarte() {
		return RESOURCES_CARTES;
	}

}
