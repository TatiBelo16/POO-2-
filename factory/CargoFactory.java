package factory;

public class CargoFactory {

	public ICargo criarFuncionario(String tipo) {
		ICargo cargo = null;
		if(tipo.equals("cfo"))
			cargo= new Cfo();
		else if (tipo.equals("cto"))
			cargo = new Cto();
		else if(tipo.equals("ceo"))
			cargo = new Ceo();
		return cargo;
	}
}
