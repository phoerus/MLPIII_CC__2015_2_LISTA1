package listaquestao3;

public class Teste {

	public static void main(String[] args) {
		FabricaDeCarro unicaFabrica = FabricaDeCarro.getInstancia();
		FabricaDeCarro outraFabrica = FabricaDeCarro.getInstancia();
		System.out.println(unicaFabrica.equals(outraFabrica));
	}
	
	
}
