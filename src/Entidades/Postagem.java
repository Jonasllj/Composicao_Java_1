package Entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Postagem {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private String titulo;
	private String contente;
	private Integer likes;
	
	
	private List<Comentario> comentarios = new ArrayList<>();


	public Postagem() {
	}


	public Postagem(Date momento, String titulo, String contente, Integer likes) {
		this.momento = momento;
		this.titulo = titulo;
		this.contente = contente;
		this.likes = likes;
	}


	public Date getMomento() {
		return momento;
	}


	public void setMomento(Date momento) {
		this.momento = momento;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getContente() {
		return contente;
	}


	public void setContente(String contente) {
		this.contente = contente;
	}


	public Integer getLikes() {
		return likes;
	}


	public void setLikes(Integer likes) {
		this.likes = likes;
	}


	public List<Comentario> getComentarios() {
		return comentarios;
	}
	
	public void adcionarComentario(Comentario comentario) {
		comentarios.add(comentario);
	}
	
	public void removeComentario(Comentario comentario) {
		comentarios.remove(comentario);
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(titulo + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(momento)+ "\n");
		sb.append(contente + "\n");
		sb.append("Comments: \n");
		for(Comentario c : comentarios) {
			sb.append(c.getText());
		}
		return sb.toString();
	}
}

