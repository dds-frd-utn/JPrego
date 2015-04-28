package Help;

import Help.Help;
import Help.Pantalla;


public class Help {
	
	/*lo que sucede cuando se instancia*/
	public Help(){
		this.showHelp();
	}
	
	/*muestra la ayuda por pantalla*/
	public void showHelp(){
		
		Pantalla p = new Pantalla();
		p.showHeader("Ayuda de comandos");
			System.out.println(
				"\n"
					+"0) Salir.\n"
					+"1) Agregar un nuevo usuario al foro.\n"
					+"2) Agregar nuevo post a un foro de un usuario.\n"
					+"3) Cambiar de usuario si se desea.\n"
					+"4) Comentar post del foro de un usuario.\n"
					+"5) Eliminar post del foro de un usuario"
					+"6) Ayuda acerca de las opciones a elegir."
					+"7) Limpiar la pantalla para mayor comodidad."		
			);
		p.showFooter();
		
	}
	
	/*prueba de clase*/
	public static void main(String[] args){
		Help h = new Help();
	}
}
