package Estructuras;

public class Mata_Chayote {
	private Nodo raiz;
	
	public Mata_Chayote(){
		
	}
	
	public void crear(double porc,double cant, int time){
		Nodo raiz=new Nodo(Tipo.RAIZ,porc,cant,time);
		raiz.setHijo1(new Nodo());
	}
	public void Agregar(){
		
	}
}
