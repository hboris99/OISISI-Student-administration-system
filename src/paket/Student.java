package paket;

enum enumStatus{B,S}

public class Student {

	String prezime;
	String ime;
	String datum_rodjenja;
	String adresa_stanovanja;
	String telefon;
	String email;
	String broj_indeksa;
	int godina_upisa;
	int godina_studija;
	enumStatus status;
	float prosecna_ocena;
	Ocena[] polozeni;
	Ocena[] nepolozeni;
	
	
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
	
	
	
}
