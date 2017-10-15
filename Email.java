package builder2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Email {
	
	private String remetente;
	private List<String> destinatarios;
	private String assunto;
	private String mensagem;
	private List<File> anexos = new ArrayList<File>();
	
	public Email(String remetente, String destinatario) {
		destinatarios = new ArrayList<String>();
		destinatarios.add(destinatario);
		this.remetente = remetente;
		
	}
	
	public String getRemetente() {
		return remetente;
	}
	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}
	
	
	public List<String> getDestinatarios() {
		return destinatarios;
	}
	
	
	public void addDestinatario(String destinatario) {
		destinatarios.add(destinatario);
	}
	
	public String getAssunto() {
		return assunto;
	}
	
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public List<File> getAnexos() {
		return anexos;
	}
	
	public void addAnexo(File anexo) {
		this.anexos.add(anexo);
	}
	@Override
	public String toString() {
		return "Email [remetente=" + remetente + ", destinatarios=" + destinatarios + ", assunto=" + assunto
				+ ", mensagem=" + mensagem + ", anexos=" + anexos + "]";
	}
	
	
	

}
