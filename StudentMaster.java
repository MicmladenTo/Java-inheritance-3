package nasledjivanjeZadaci3_override;

public class StudentMaster extends Student {
	
	public StudentMaster(String ime, String prezime, String brojIndeksa, int godinaStudija) {
		super(ime, prezime, brojIndeksa, godinaStudija);
	}
	
	public double cenaSkolarine() {
		if(budzet() == true) {
			return 0;
		}
		return 100000;
	}
	
	public boolean budzet() {
		if(super.getGodinaStudija() < 2) {
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
//Kreirati klasu StudentMaster koja nasledjuje klasu Student i koja ima:
//•	koja za cenu skolarine vraca 100000
//•	za metodu da li je na budzetu vraca true ako je student ispod 2 godine studija
//	U glavnoj klasi kreirati studente i testirati funkciolanosti
//•	Dodati metodu koja stampa info o studentu

