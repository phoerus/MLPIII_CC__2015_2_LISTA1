package listaquestao7;

public class Teste {
	
	public static void main(String[] args) {
		
	Veiculo v1 = new Veiculo(3.50 , 0 , 100);
	
	System.out.println("O valor da loca��o �: R$" + v1.getCalculoLocacao());
	
	//testando heran�a
	VeiculoDeCarga vdc1 = new VeiculoDeCarga();
	vdc1.getPlaca();
	
	
		
	
	}
}
