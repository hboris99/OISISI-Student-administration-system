package model;

import java.util.Arrays;
public class Student {
	
	public static enum enumStatus{B,S}

	private String prezime;
	private String ime;
	private	String datum_rodjenja;
	private	String adresa_stanovanja;
	private	String telefon;
	private	String email;
	private	String broj_indeksa;
	private	int godina_upisa;
	private	int godina_studija;
	private	enumStatus status;
	private	float prosecna_ocena;
	private	Ocena[] polozeni;
	private	Ocena[] nepolozeni;
	
	public Student() {}
	
	public Student(String prezime, String ime, String datum_rodjenja, String adresa_stanovanja, String telefon,
			String email, String broj_indeksa, int godina_upisa, int godina_studija, enumStatus status,
			float prosecna_ocena, Ocena[] polozeni, Ocena[] nepolozeni) {
		super();
		this.prezime = prezime;
		this.ime = ime;
		this.datum_rodjenja = datum_rodjenja;
		this.adresa_stanovanja = adresa_stanovanja;
		this.telefon = telefon;
		this.email = email;
		this.broj_indeksa = broj_indeksa;
		this.godina_upisa = godina_upisa;
		this.godina_studija = godina_studija;
		this.status = status;
		this.prosecna_ocena = prosecna_ocena;
		this.polozeni = polozeni;
		this.nepolozeni = nepolozeni;
	}


	public String getPrezime() {
		return prezime;
	}


	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}


	public String getIme() {
		return ime;
	}


	public void setIme(String ime) {
		this.ime = ime;
	}


	public String getDatum_rodjenja() {
		return datum_rodjenja;
	}


	public void setDatum_rodjenja(String datum_rodjenja) {
		this.datum_rodjenja = datum_rodjenja;
	}


	public String getAdresa_stanovanja() {
		return adresa_stanovanja;
	}


	public void setAdresa_stanovanja(String adresa_stanovanja) {
		this.adresa_stanovanja = adresa_stanovanja;
	}


	public String getTelefon() {
		return telefon;
	}


	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getBroj_indeksa() {
		return broj_indeksa;
	}


	public void setBroj_indeksa(String broj_indeksa) {
		this.broj_indeksa = broj_indeksa;
	}


	public int getGodina_upisa() {
		return godina_upisa;
	}


	public void setGodina_upisa(int godina_upisa) {
		this.godina_upisa = godina_upisa;
	}


	public int getGodina_studija() {
		return godina_studija;
	}


	public void setGodina_studija(int godina_studija) {
		this.godina_studija = godina_studija;
	}


	public enumStatus getStatus() {
		return status;
	}


	public void setStatus(enumStatus status) {
		this.status = status;
	}


	public float getProsecna_ocena() {
		return prosecna_ocena;
	}


	public void setProsecna_ocena(float prosecna_ocena) {
		this.prosecna_ocena = prosecna_ocena;
	}


	public Ocena[] getPolozeni() {
		return polozeni;
	}


	public void setPolozeni(Ocena[] polozeni) {
		this.polozeni = polozeni;
	}


	public Ocena[] getNepolozeni() {
		return nepolozeni;
	}


	public void setNepolozeni(Ocena[] nepolozeni) {
		this.nepolozeni = nepolozeni;
	}
	

	@Override
	public String toString() {
		return "Student [prezime=" + prezime + ", ime=" + ime + ", datum_rodjenja=" + datum_rodjenja
				+ ", adresa_stanovanja=" + adresa_stanovanja + ", telefon=" + telefon + ", email=" + email
				+ ", broj_indeksa=" + broj_indeksa + ", godina_upisa=" + godina_upisa + ", godina_studija="
				+ godina_studija + ", status=" + status + ", prosecna_ocena=" + prosecna_ocena + ", polozeni="
				+ Arrays.toString(polozeni) + ", nepolozeni=" + Arrays.toString(nepolozeni) + "]";
	}
	
	
	
}
