package Estructuras;

public class Nodo<T> extends Thread{
																					
	private Nodo<T> hijo1;
	private Nodo<T> hijo2;
	private Nodo<T> hijo3;
	private Nodo<T> hijo4;
	private Nodo<T> hijo5;
	private Nodo<T> hijo6;
	private Tipo tipo;
	private T Valor;
	private static double porcentaje;
	private static int time;
	private static int total;
	private static int cantChayotes;
					
	
					
	public Nodo() {
		super();
		hijo1=null;
		hijo2=null;
		hijo3=null;
		hijo4=null;
		hijo5=null;
		hijo6=null;
		setTipo();
		run();
		
		
		
		
	}
	public Nodo(Tipo x,double porc, double cant, int time) {
		super();
		hijo1=null;
		hijo2=null;
		hijo3=null;
		hijo4=null;
		hijo5=null;
		hijo6=null;
		setPorcentaje(porc);
		setCantChayotes((int) cant);
		setTime(time);
		setTipo(x);
		
	}
									

	@SuppressWarnings("deprecation")
	@Override
	public void run() {
		
		try {
			sleep(time);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		if(getTipo()== Tipo.COGOLLO){
			setCantidadhijos(random());
		}
		else{
			total++;
			if(total==cantChayotes){
				System.out.println("Listo");
				stop();
			}
			else{
				System.out.println("AWWWWW");
			}
		}
		super.run();
		
	}
	
	public Nodo<T> getHijo1() {
		return hijo1;
	}




	public void setHijo1(Nodo<T> hijo1) {
		this.hijo1 = hijo1;
	}




	public Nodo<T> getHijo2() {
		return hijo2;
	}




	public void setHijo2(Nodo<T> hijo2) {
		this.hijo2 = hijo2;
	}




	public Nodo<T> getHijo3() {
		return hijo3;
	}




	public void setHijo3(Nodo<T> hijo3) {
		this.hijo3 = hijo3;
	}




	public Nodo<T> getHijo4() {
		return hijo4;
	}




	public void setHijo4(Nodo<T> hijo4) {
		this.hijo4 = hijo4;
	}




	public Nodo<T> getHijo5() {
		return hijo5;
	}




	public void setHijo5(Nodo<T> hijo5) {
		this.hijo5 = hijo5;
	}




	public Nodo<T> getHijo6() {
		return hijo6;
	}




	public void setHijo6(Nodo<T> hijo6) {
		this.hijo6 = hijo6;
	}




	public static double getPorcentaje() {
		return porcentaje;
	}
	public static void setPorcentaje(double porcentaje) {
		Nodo.porcentaje = porcentaje;
	}
	public static int getTime() {
		return time;
	}
	public static void setTime(int time) {
		Nodo.time = time;
	}
	public static int getCantChayotes() {
		return cantChayotes;
	}
	public static void setCantChayotes(int cantChayotes) {
		Nodo.cantChayotes = cantChayotes;
	}
	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo){
		this.tipo=tipo;
	}



	public void setTipo() {
		double random= 0+(Math.random()*((100-0)+1));
		if (random<=porcentaje)
			tipo=Tipo.CHAYOTE;
		else{
			tipo=Tipo.COGOLLO;
		}
	}




	public T getValor() {
		return Valor;
	}




	public void setValor(T valor) {
		Valor = valor;
	}




	public void setCantidadhijos(double cant){
		setHijo1(new Nodo());
		setHijo2(new Nodo());
		if (cant==3){
			setHijo3(new Nodo());
		}
		else if (cant==4){
			setHijo4(new Nodo());
			setHijo3(new Nodo());
		}
		else if (cant==5){
			setHijo4(new Nodo());
			setHijo3(new Nodo());
			setHijo5(new Nodo());
			
		}
		else if (cant==6){
			setHijo4(new Nodo());
			setHijo3(new Nodo());
			setHijo5(new Nodo());
			setHijo6(new Nodo());
		}
			
		
	}
	
	public double random(){
		double random=  (2 +(Math.random() * ((6-2)+1)));
		return random;
	}
}
