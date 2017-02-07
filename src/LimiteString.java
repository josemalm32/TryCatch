
public class LimiteString {
	public static void main(String[] args) {
	LimiteString instacia = new LimiteString();
	
	instacia.ProvocaExcepcion();
	
	}
	
	
	public void ProvocaExcepcion() {
		String cadena = new String();
		cadena = "Hiee";
		
		
		try {
			cadena = "HOLAA";
			System.out.println("Oeee");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
}
