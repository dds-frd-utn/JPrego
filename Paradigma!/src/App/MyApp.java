package App;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

import Help.Help;
import Paradigmas.Post;
import Paradigmas.Usuario;
import Paradigmas.Comentario;

import java.util.HashMap;

public class MyApp {
	
	private static List<Usuario> users = new ArrayList<Usuario>();

	public static void main(String[] args) {
		
		Map<String, Post> systemPost = new HashMap<String, Post>();
		int estado;
		Scanner scn = new Scanner(System.in);
		Scanner scn2 = new Scanner(System.in);
		Usuario thisUsuario = new Usuario();
	
		//Menu
		System.out.println("BIENVENIDO A LA PAGINA");
		
		do{
		System.out.println("0) Salir.");	
		System.out.println("1) Agregar nuevo usuario.");
		System.out.println("2) Agregar nuevo post.");
		System.out.println("3) Cambiar de usuario.");
		System.out.println("4) Comentar post.");
		System.out.println("5) Eliminar post.");
		System.out.println("6) Ayuda.");
		System.out.println("7) Limpiar la pantalla.");
		System.out.print("Seleccione una opcion: ");
		estado = scn.nextInt();
		
		switch(estado){
			
			case 1: 
				users.add(new Usuario());
				break;
			
			case 2:
				for (int i=0; i< (users.size()); i++ ){
					System.out.println(i+ users.get(i).getNombre());
				}
				System.out.print("Ingrese numero usuario: ");
				users.get(scn.nextInt()).Postear();
				break;
				
			case 3: {
				thisUsuario = null;
				thisUsuario = change();
			}
				break;
				
			case 4: comPost(thisUsuario, systemPost); 
				break;
				
			case 5: deletePost(thisUsuario,systemPost);
			break;
								
			case 6:
				showHelp();
				break;
			
			case 7: 
				clearConsole();
				break;
						
		}
		}while(estado != 0);
		System.out.print("Hasta la vista, Baby!");
		
	}
		
	public static void comPost(Usuario usr , Map<String, Post> systemPost){
		try{		
			Exception no_existe = new Exception();
			Scanner s = new Scanner(System.in);
			System.out.print("Nombre de post a comentar : ");
			
			Post pst = systemPost.get(s.nextLine());
			if(pst == null) throw new Exception();
			Comentario com = new Comentario();
				if(com.comentarioNull()) return;	
			pst.addComentario(com);
			
		}catch(Exception e){
			System.out.println("Error al comentar post");
		}
	}
	
	public static void deletePost(Usuario usr , Map<String, Post> systemPost){
		
		try{		
			
			Scanner s = new Scanner(System.in);
			System.out.print("Nombre de post a eliminar : ");
			Post pst = systemPost.get(s.nextLine());
			System.out.println("Post eliminado ...");
			
		}catch(Exception e){
			System.out.println("No se pudo borrar el post");
		}
	}
	
	public static Usuario change(){
		Usuario u = new Usuario();
		return u;
	}
	
	public static void clearConsole(){
		for(int i = 0; i < 50; i++) {
			System.out.println();
		}
		
	}
	private static void showHelp() {
		Help h = new Help();
		h = null;
	}

}