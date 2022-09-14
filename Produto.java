public class Produto{
	private String cod;
	private String descri;
	private double valor;
	private String nome;
	private int estoque;
	
	public Produto(String nome, String descri, String cod, double valor, int estoque){
		this.nome = nome;
		this.descri = descri;
		this.valor = valor;
		this.cod = cod;
		this.estoque = estoque;
	}
	
	public int getEstoque() {return estoque; }
	
	public void setEstoque(int estoque) {this.estoque = estoque; }
	
	public String getCod() {
		return cod;
	}
	
	public void setCod(String cod) {
		this.cod = cod;
	}
	
	public String getDescri() {
		return descri;
	}
	
	public void setDescri(String descri) {
		this.descri = descri;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}