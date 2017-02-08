
public class ExcepcionArimetrico {

	public static void main(String[] args) {
		ExcepcionArimetrico instancia = new ExcepcionArimetrico();
		
		instancia.ArrojaExcepcion();
	
	}
	
	public void ArrojaExcepcion() {
		
		int a =0, b = 2;
		
		try {
		int c = 0/0;
		System.out.println("IE");
		} catch (Exception e) {

		
		}
		
	}
}



