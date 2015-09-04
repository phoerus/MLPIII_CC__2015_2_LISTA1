package listaquestao1;

public class Fatura {
	
	private String numero;
	private String descricao;
	private int quantidade;
	private double preco;
	
	public Fatura() {
	}

	public Fatura(String numero, String descricao, int quantidade, double preco) {
		this.numero = numero;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if(preco <= 0){
			this.preco = 0.0;
		}else{
			this.preco = preco;
		}
		
	}
	
	public double getValorFatura(){
		double valorFatura;
		valorFatura = this.quantidade * this.preco;
		if(valorFatura < 0){
			valorFatura = 0;
		}return valorFatura;
	}
	
	
}
