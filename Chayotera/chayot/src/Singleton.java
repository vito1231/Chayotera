import Estructuras.*;

public class Singleton {
	
	private static Singleton singleArbol;
	private Mata_Chayote arbol;
	
	private Singleton(){
		arbol=new Mata_Chayote();
	}
	
	public static Singleton getInstance(){
		if(singleArbol==null){
			singleArbol= new Singleton();
		}
		return singleArbol;
	}

	public Mata_Chayote getArbol() {
		return arbol;
	}

	public void setArbol(Mata_Chayote arbol) {
		this.arbol = arbol;
	}
	
	
	
	
}
