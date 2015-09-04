package listaquestao4;

public class RecuperaSalario {
	
	private String entrada;
	
	public RecuperaSalario (String entrada) {
		this.entrada = entrada;
	}
	
	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}
	
	public int recuperaCustosSalarios() {
		String strArray[] = entrada.split("\\D+");
		
		int total = 0;
		
		if(strArray.length > 0 && !strArray[0].equals("")) {
			total = total + Integer.parseInt(strArray[0]);
		}
		
		for (int i = 1; i < strArray.length; i++) {
			total = total + Integer.parseInt(strArray[i]); 
		}		
		
		return total;
	}
	

}
