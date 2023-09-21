package Programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import Entidades.Comentario;
import Entidades.Postagem;

public class Programa {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Comentario c1 = new Comentario("Have a nice trip! ");
		Comentario c2 = new Comentario("Wow that's awesome! ");
		Postagem p1 = new Postagem(
				sdf.parse("21/06/2018 13:05:44"),
				"Traveling to New Zealand" ,
				"I'm going to visit wonderful country! ",
				12);
		p1.adcionarComentario(c1);
		p1.adcionarComentario(c2);
		
		Comentario c3 = new Comentario("Good night ");
		Comentario c4 = new Comentario("May the Force be with you");
		Postagem p2 = new Postagem(
				sdf.parse("28/07/2018 23:14:19"),
				"Good night guys" ,
				"See you tomorrow",
				12);
		p1.adcionarComentario(c3);
		p1.adcionarComentario(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
