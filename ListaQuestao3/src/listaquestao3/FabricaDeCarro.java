package listaquestao3;

public class FabricaDeCarro {

	private static FabricaDeCarro fabricaDeCarro;
	
	private FabricaDeCarro(){}
	
	public static synchronized FabricaDeCarro getInstancia() {
		if (fabricaDeCarro == null) {
			fabricaDeCarro = new FabricaDeCarro();
		}
		
		return fabricaDeCarro;		
	}
	
}
