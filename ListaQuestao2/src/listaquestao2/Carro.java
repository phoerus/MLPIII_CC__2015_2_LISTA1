package listaquestao2;

public class Carro {

	private String cor;
	private String modelo;
	private int velocidadeAtual;
	private int velocidadeMaxima;
	private boolean ligado = false;

	public Carro() {
	}

	public Carro(String cor, String modelo, int velocidadeAtual,
			int velocidadeMaxima) {
		this.cor = cor;
		this.modelo = modelo;
		this.velocidadeAtual = velocidadeAtual;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public void ligar() {
		ligado = true;
	}

	public void acelerar(int acelerar) {
		if (ligado == true) {
			this.velocidadeAtual = this.velocidadeAtual + acelerar;
			System.out.println("A velocidade atual é: " + this.velocidadeAtual);
			System.out.println("A velocidade Máxima é: "
					+ this.velocidadeMaxima);

			if (this.velocidadeAtual > this.velocidadeMaxima) {
				System.out.println("Perigo: A velocidade máxima foi exedida!");
			} else {
				System.out.println("A velocidade máxima está dentro do permitido!");
			}
		}else{
			System.out.println("O carro está desligado");
		}

	}

}
