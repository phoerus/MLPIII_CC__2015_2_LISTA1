package listaquestao7;

public class Teste {
	
	public static void main(String[] args) {
		
	Veiculo v1 = new Veiculo(3.50 , 0 , 100);
	
	System.out.println("O valor da locação é: R$" + v1.getCalculoLocacao());
	
	//testando herança
	VeiculoDeCarga vdc1 = new VeiculoDeCarga();
	vdc1.getPlaca();
	
	
		
	
	}
}
