package model;

import java.io.Serializable;
import java.util.Arrays;

public class Profesor implements Serializable{

	private static final long serialVersionUID = 1L;

	public static enum Titula {BSC, MSC,MR,DR,PRDR}
	public static enum Zvanje {SUN, AS, ASD, DOC, VPROF, REDPROF, PROFEM }
	
	String prezime;
	String ime;
	String datum_rodjenja;
	String adresa_stanovanja;
	String telefon;
	String email;
	String adresa_kancelarije;
	String broj_lk;
	Titula titula;
	Zvanje zvanje;
	Predmet[] predmeti_radi;
	 
	Profesor(String prezime, String ime, String datum_rodjenja,	String adresa_stanovanja,String telefon,String email,String adresa_kancelarije,
				String broj_lk,Titula titula,Zvanje zvanje,Predmet[] predmeti_radi)
		{
			super();
			this.prezime = prezime;
			this.ime = ime;
			this.datum_rodjenja = datum_rodjenja;
			this.adresa_stanovanja = adresa_stanovanja;
			this.telefon = telefon;
			this.email = email;
			this.adresa_kancelarije = adresa_kancelarije;
			this.broj_lk = broj_lk;
			this.titula = titula;
			this.zvanje = zvanje;
			this.predmeti_radi = predmeti_radi;
			
			
			
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

	public String getAdresa_kancelarije() {
		return adresa_kancelarije;
	}

	public void setAdresa_kancelarije(String adresa_kancelarije) {
		this.adresa_kancelarije = adresa_kancelarije;
	}

	public String getBroj_lk() {
		return broj_lk;
	}

	public void setBroj_lk(String broj_lk) {
		this.broj_lk = broj_lk;
	}

	public Titula getTitula() {
		return titula;
	}

	public void setTitula(Titula titula) {
		this.titula = titula;
	}

	public Zvanje getZvanje() {
		return zvanje;
	}

	public void setZvanje(Zvanje zvanje) {
		this.zvanje = zvanje;
	}

	public Predmet[] getPredmeti_radi() {
		return predmeti_radi;
	}

	public void setPredmeti_radi(Predmet[] predmeti_radi) {
		this.predmeti_radi = predmeti_radi;
	}
	

	@Override
	public String toString() {
		return "Profesor [prezime=" + prezime + ", ime=" + ime + ", datum_rodjenja=" + datum_rodjenja
				+ ", adresa_stanovanja=" + adresa_stanovanja + ", telefon=" + telefon + ", email=" + email
				+ ", adresa_kancelarije=" + adresa_kancelarije + ", broj_lk=" + broj_lk + ", titula=" + titula
				+ ", zvanje=" + zvanje + ", predmeti_radi=" + Arrays.toString(predmeti_radi) + "]";
	}

	public Profesor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
