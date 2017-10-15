package builder2;

import java.io.File;

public class EmailBuilder {
	
	private Email email;
	
	public EmailBuilder(Email email) {
		this.email = email;
	}
	
	
	public EmailBuilder assunto (String assunto) {
		email.setAssunto(assunto);
		return this;
	}
	
	public EmailBuilder destinatario(String destinatario) {
		email.addDestinatario(destinatario);
		return this;
	}
	
	public EmailBuilder mensagem (String mensagem) {
		email.setMensagem(mensagem);
		return this;
	}
	
	public EmailBuilder anexo (File file) {
		email.addAnexo(file);
		return this;
	}

}
