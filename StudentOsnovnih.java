package nasledjivanjeZadaci3_override;

public class StudentOsnovnih extends Student {

	public StudentOsnovnih(String ime, String prezime, String brojIndeksa, int godinaStudija) {
		super(ime, prezime, brojIndeksa, godinaStudija);
	}
	
	public double cenaSkolarine() {
		if(budzet() == true) {
			return 0;
		}
		return 90000;
	}
	
	public boolean budzet() {
		if(super.getGodinaStudija() < 5) {
			return true;
		} else {
			return false;
		}
	}
	
	public void stampajInfoStudenta() {
		System.out.println("Student osnovnih studija " + this.getIme() + " " + this.getPrezime() + ", sa brojem indeksa " + 
	this.getBrojIndeksa() + ", koji/a je na " + this.getGodinaStudija() + ". godini studija, placa skolarinu " + this.cenaSkolarine() + " dinara.");
		System.out.println("Student je na budzetu: " + this.budzet());
	}
	
}
//Kreirati klasu StudentOsnovnih koja nasledjuje klasu Student i koja ima:
//•	koja za cenu skolarine vraca 90000
//•	za metodu da li je na budzetu vraca true ako je student ispod 5 godine studija
//•	Dodati metodu koja stampa info o studentu

