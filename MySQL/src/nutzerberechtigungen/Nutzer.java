package nutzerberechtigungen;

public class Nutzer {

	public static String ADMIN = "admin";
	public static String USER = "user";
	
	private String userName = "";
	private String passwort = "";
	private String rechte = "";
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPasswort() {
		return passwort;
	}
	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}
	public String getRechte() {
		return rechte;
	}
	public void setRechte(String rechte) {
		this.rechte = rechte;
	}
	
}
