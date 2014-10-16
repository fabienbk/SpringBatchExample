package demo;

public class Message {	
    	
	private String Identifiant_Stable_PDL;
    private String Matricule_Compteur;

    public Message() {
    }

	public String getIdentifiant_Stable_PDL() {
		return Identifiant_Stable_PDL;
	}

	public void setIdentifiant_Stable_PDL(String identifiant_Stable_PDL) {
		Identifiant_Stable_PDL = identifiant_Stable_PDL;
	}

	public String getMatricule_Compteur() {
		return Matricule_Compteur;
	}

	public void setMatricule_Compteur(String matricule_Compteur) {
		Matricule_Compteur = matricule_Compteur;
	}

	@Override
	public String toString() {
		return "Message [Identifiant_Stable_PDL=" + Identifiant_Stable_PDL
				+ ", Matricule_Compteur=" + Matricule_Compteur + "]";
	}

}