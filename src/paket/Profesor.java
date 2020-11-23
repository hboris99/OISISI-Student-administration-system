package paket;

public class Profesor {
	String prezime;
	String ime;
	String datum_rodjenja;
	String adresa_stanovanja;
	String telefon;
	String email;
	String adresa_kancelarije;
	int broj_lk;
	String titula;
	String zvanje;
	Predmet[] predmeti_radi;
	 
	Profesor(String prezime, String ime, String datum_rodjenja,	String adresa_stanovanja,String telefon,String email,String adresa_kancelarije,
				int broj_lk,String titula,String zvanje,Predmet[] predmeti_radi)
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
	
}
