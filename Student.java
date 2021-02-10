package nasledjivanjeZadaci3_override;

public class Student {
	private String ime;
	private String prezime;
	private String brojIndeksa;
	private int godinaStudija;
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getBrojIndeksa() {
		return brojIndeksa;
	}
	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}
	public int getGodinaStudija() {
		return godinaStudija;
	}
	public void setGodinaStudija(int godinaStudija) {
		this.godinaStudija = godinaStudija;
	}
	public Student(String ime, String prezime, String brojIndeksa, int godinaStudija) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.brojIndeksa = brojIndeksa;
		this.godinaStudija = godinaStudija;
	}
	
}
//Kreirati klasu Student koja ima:
//•	ime i prezime studenta
//•	broj indeksa
//•	godinu studija
//•	gettere, settere i konstruktore

