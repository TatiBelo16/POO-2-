package builder2;

import java.io.File;

public class Tester {

	public static void main(String[] args) {
		
		
		Email email = new Email("crfranco@fameg.edu.br", "viana@fameg.edu.br");
		
		EmailBuilder eb = new EmailBuilder(email);
		
		eb.assunto("reprovação na disciplina")
			.mensagem("a casa caiu, Viana")
			.destinatario("namoradadoviana@gmail.com")
			.destinatario("cachorrodoviana@gmail.com")
			.anexo(new File("notas.xls"));
		
		System.out.println(email);
		

	}

}
