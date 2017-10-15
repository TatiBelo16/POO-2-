package factory;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CargoFactory cf = new CargoFactory();
		ICargo cargo = cf.criarFuncionario("cfo");
		System.out.println(cargo.getCargo());
		
	}

}
