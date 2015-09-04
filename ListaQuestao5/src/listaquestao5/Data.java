package listaquestao5;

public class Data {
	
	private int dia;
	private int mes;
	private int ano = -1;
	
	public Data() {
		
	}

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getDia() {
		return dia;
	}

	private boolean verificaDia(int dia) {
		if(dia > 0 && dia <= 31)
			return true;
		
		return false;
	}
	
	public void setDia(int dia) {
		if(verificaDia(dia))
			this.dia = dia;
	}
	
	private boolean verificaMes(int mes){
		if(mes > 0 && mes <= 12)
			return true;
		return false;
	}
	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if(verificaMes(mes))
			this.mes = mes;
	}
	
	private boolean verificaAno(int ano){
		if(ano >= 0)
			return true;
		return false;
	}
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if(verificaAno(ano))
			this.ano = ano;
	}
	
	public String toString(){
		if (verificaDia(dia) && verificaMes(mes) && verificaAno(ano))
			return dia + "/" + mes + "/" + ano;
		
		return "Data inválida";
	
	}
	
}
