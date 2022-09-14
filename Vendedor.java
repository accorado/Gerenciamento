import java.util.ArrayList;
public class Vendedor extends Pessoa {
	
	ArrayList clientes = new ArrayList();
	private String salario;
	private String ID;
	private String senha;
	
	public Vendedor(String nome, String cpf, String tel, String email, String ender, String senha, String salario, String ID) {
		super(nome, cpf, tel, email, ender);
		this.senha = senha;
		this.salario = salario;
		this.ID = ID;
	}
	
	public void addCliente(String nome, String cpf, String tel, String email, String ender){
		Cliente c = new Cliente(nome,cpf,tel,email,ender);
		clientes.add(c);
	}
	
	public int atualizaEstoque(int qtd, Produto p){
		p.setEstoque(p.getEstoque()-qtd);
		
		return p.getEstoque()-qtd;
	}
	
	public String getID() { return ID; }
	
	public ArrayList getClientes() {
		return clientes;
	}
	
	public void setClientes(ArrayList clientes) {
		this.clientes = clientes;
	}
	
	public String getSalario() {
		return salario;
	}
	
	public void setSalario(String salario) {
		this.salario = salario;
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
}