package nasledjivanjeZadaci3_override;

public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentOsnovnih jovica = new StudentOsnovnih("Jovica", "Petrov", "198/63", 1);
		jovica.stampajInfoStudenta();
		
		System.out.println("////////////////");
		
		StudentMaster ana = new StudentMaster("Ana", "Petrovic", "08/96", 4);
		ana.stampajInfoStudenta();
		
	}

}
