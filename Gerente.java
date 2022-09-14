import java.util.ArrayList;

public class Gerente extends Vendedor {
	
	private ArrayList<Vendedor> vendedores = new ArrayList<>();
	private ArrayList<Produto> produtos = new ArrayList<>();
	
	public Gerente(String nome, String cpf, String tel, String email, String ender, String senha, String salario, String ID) {
		super(nome, cpf, tel, email, ender, senha, salario, ID);
	}
	
	public void addVendedor(String nome, String cpf, String tel, String email, String ender, String senha, String salario, String id){
		Vendedor v = new Vendedor(nome,cpf,tel,email,ender,senha,salario,id);
		vendedores.add(v);
	}
	
	public void addProduto(String nome, String desc, String cod, double valor, int estoque){
		Produto p = new Produto(nome,desc,cod,valor,estoque);
		produtos.add(p);
	}
	
	@Override
	public String getID() { return super.getID(); }
	
	public ArrayList<Vendedor> getVendedores() {
		return vendedores;
	}
	
	public ArrayList<Produto> getProdutos(){
		return produtos;
	}
	
	public void setVendedores(ArrayList<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}
	
	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
}
