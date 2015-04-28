package Paradigmas;

public class Comentario {

	//Campos
	private String texto;
	
	
	//Accesors
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	//Constructo
	public Comentario(){}
	
	public Comentario(String txt){
		this();
		texto = txt;
	}

	public Boolean comentarioNull(){
		if( this.getTexto().equals("N") ) return true ; else return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
