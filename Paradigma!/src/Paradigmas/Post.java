package Paradigmas;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import Paradigmas.Comentario;

public class Post {

	//Campos
		private List<Comentario> comentarios = new ArrayList<Comentario>();
		private int puntos;
		private String name;
		
	//Accesors
	public int getPuntos() {
			return puntos;
		}

		public void setPuntos(int puntos) {
			this.puntos = puntos;
		}

	public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	public List<Comentario> getComentarios() {
			return comentarios;
		}

		public void setComentarios(List<Comentario> comentarios) {
			this.comentarios = comentarios;
		}
		
		public void addComentario(Comentario uncomentario){
			this.comentarios.add(uncomentario);
		}

	//Constructores
		public Post(){}
		
		public Post(String nameP){
			this();
			name = nameP;
			puntos = 0;
		}
		
	//Metodos
	
	public Comentario comentar(){
		String auxi;
		Scanner scn = new Scanner(System.in);
		System.out.print("Ingrese comentario:");
		auxi = scn.nextLine();
		Comentario c = new Comentario(auxi);
		comentarios.add(c);
		return c;
	}
	
	public void verComentarios(){
		int i = 0;
		for (Comentario c: comentarios){
			System.out.print("Comentario["+i+"]: ");
			i++;
			System.out.println(c.getTexto());
		}
	}
	
	public int agregarPuntaje(){
		int puntaje;
		Scanner scn = new Scanner(System.in);
		System.out.print("Ingresar puntos:");
		puntaje = scn.nextInt();
		return puntos = puntos + puntaje;
	}
	
	public int valor(){
		return puntos + (comentarios.size());
	}
	
	public Boolean sinComentarios(){
		return(comentarios.size() == 0);
	}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
