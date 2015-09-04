package listaquestao6;

public class Fita {

	private String titulo;
	private double preco;
	private String tipo;
	
	public Fita() {
	} 
	
	public Fita(String titulo , double preco , String tipo) {
		this.titulo = titulo;
		this.preco = preco;
		this.tipo = tipo;
	} 
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void getPrecoLocacao(){
		if(tipo == "lançamento"){
			this.preco = this.preco * 1.2;
			System.out.println("O preço de locação é: "+preco);
		}
		else{
			if(tipo == "infantil"){
				this.preco = this.preco * 1.4;
				System.out.println("O preço de locação é: "+preco);
			}
			else{
				System.out.println("As informações informadas estão erradas");
			}
		}
				
		}
		
	}
	

