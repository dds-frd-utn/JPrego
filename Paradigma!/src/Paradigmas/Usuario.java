package Paradigmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario {

	//Campos
	
	private List<Post> posts = new ArrayList<Post>();
	private String nombre;
	
	//Accesors

	public List<Post> getPosts() {
			return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Constructores
	
	public Usuario(){
		Scanner auxi = new Scanner(System.in);
		System.out.print("Nombre de Usuario: ");
		this.nombre = auxi.nextLine();
	}
	
	
	//Metodos
	
	public Post Postear(){
		String auxi;
		Scanner scn = new Scanner(System.in);
		System.out.print("Ingrese nombre del post:");
		auxi = scn.nextLine();
		Post p = new Post(auxi);
		posts.add(p);
		return p;
	}
	
	public void verPosts(){
		for (int i=0; i< (posts.size()); i++ ){
			System.out.println(i+ posts.get(i).getName());
		}
		Scanner scn = new Scanner(System.in);
		System.out.println("Ingrese numero de post: ");
		posts.get(scn.nextInt()).comentar();
	}
	
	public int puntajeTotalPost(){
		int ptotal = 0;
		for (Post p: posts){
			ptotal = p.valor() + ptotal;
		}
		System.out.print("El puntaje total es: " + ptotal);
		return ptotal;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario p = new Usuario();
		p.Postear();
		p.Postear();
		p.puntajeTotalPost();
		p.verPosts();
		

	}
}