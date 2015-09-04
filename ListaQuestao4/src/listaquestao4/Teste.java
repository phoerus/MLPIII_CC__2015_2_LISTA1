package listaquestao4;

public class Teste {
	
	public static void main(String[] args) {
		String entrada = "123abc123";
		RecuperaSalario recuperaSalario = new RecuperaSalario(entrada);
				
		System.out.println(recuperaSalario.recuperaCustosSalarios());
						
		entrada = "asd2675asdasdasda1887qeffgtshfsdfhfdsfg565dfdsçklLOOOOL900xD99";
		recuperaSalario = new RecuperaSalario(entrada);
				
		System.out.println(recuperaSalario.recuperaCustosSalarios());
		
	
	}

}
