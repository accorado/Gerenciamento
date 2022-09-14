import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static javax.swing.JOptionPane.showMessageDialog;

public class JFrameInicial extends JFrame {
	
	private JMenuBar jmbBarraMenu;
	private JMenu jmGerente;
	private JMenu jmCadastrar;
	private JMenu jmAcessar;
	
	private JMenuItem jmiCadastrarG;
	private JMenuItem jmiAcessarG;
	
	private JMenuItem jmiVendedor;
	private JMenuItem jmiCliente;
	private JMenuItem jmiProduto;
	private JMenuItem jmiGerente;
	
	private JTextField jtfCampoNome;
	private JTextField jtfCampoCPF;
	private JTextField jtfCampoTelefone;
	private JTextField jtfCampoEmail;
	private JTextField jtfCampoEndereco;
	private JTextField jtfCampoSalario;
	private JTextField jtfCampoID;
	private JTextField jtfCampoSenha;
	private JTextArea jtfCampoDescr;
	private JTextField jtfCampoValor;
	private JTextField jtfCampoCod;
	private JTextField jtfCampoEstoque;
	
	private JButton bCadastrarCl;
	private JButton bCadastrarVen;
	private JButton bCadastrarPro;
	private JButton bCadastrarGerente;
	
	private String arquivoDadosClientes = "C:/Users/accor/Documents/Cliente.txt";
	private String arquivoDadosVendedor = "C:/Users/accor/Documents/Vendedor.txt";
	private String arquivoDadosProdutos = "C:/Users/accor/Documents/Produto.txt";
	private String arquivoDadosGerente = "C:/Users/accor/Documents/Gerente.txt";
	
	trataEvento1 trata = new trataEvento1();
	
	JFrameInicial(String titulo) {
		setTitle(titulo);
		setSize(900, 1200);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		jmbBarraMenu = new JMenuBar();
		setJMenuBar(jmbBarraMenu);
		
		jmCadastrar = new JMenu("cadastrar");
		jmbBarraMenu.add(jmCadastrar);
		
		jmiCliente = new JMenuItem("cliente");
		jmCadastrar.add(jmiCliente);
		jmiCliente.addActionListener(trata);
		jmiVendedor = new JMenuItem("vendedor");
		jmCadastrar.add(jmiVendedor);
		jmiVendedor.addActionListener(trata);
		jmiGerente = new JMenuItem("gerente");
		jmCadastrar.add(jmiGerente);
		jmiGerente.addActionListener(trata);
		jmiProduto = new JMenuItem("produto");
		jmCadastrar.add(jmiProduto);
		jmiProduto.addActionListener(trata);
		setVisible(true);
		
	}
	
	class trataEvento1 implements ActionListener {
		
		Container cont1 = new Container();
		Container cont2 = new Container();
		Container cont3 = new Container();
		
		Vendedor v;
		Gerente g;
		
		//Tratamento para Menu Cadastro e botão Cadastrar
		@Override
		public void actionPerformed(ActionEvent evento) {
			if (evento.getSource() == jmiCliente) {
				
				cont1.removeAll();
				cont2.removeAll();
				cont3.removeAll();
				
				cont1.setLayout(new FlowLayout(1, 10, 20));
				
				JLabel lb0 = new JLabel("Id Vendedor:");
				jtfCampoID = new JTextField(20);
				cont1.add(lb0);
				cont1.add(jtfCampoID);
				
				JLabel lb1 = new JLabel("Nome:");
				jtfCampoNome = new JTextField(25);
				cont1.add(lb1);
				cont1.add(jtfCampoNome);
				
				JLabel lb2 = new JLabel("CPF:");
				jtfCampoCPF = new JTextField(10);
				cont1.add(lb2);
				cont1.add(jtfCampoCPF);
				
				JLabel lb3 = new JLabel("Telefone:");
				jtfCampoTelefone = new JTextField(20);
				cont1.add(lb3);
				cont1.add(jtfCampoTelefone);
				
				JLabel lb4 = new JLabel("E-mail:");
				jtfCampoEmail = new JTextField(35);
				cont1.add(lb4);
				cont1.add(jtfCampoEmail);
				
				JLabel lb5 = new JLabel("Endereco:");
				jtfCampoEndereco = new JTextField(50);
				cont1.add(lb5);
				cont1.add(jtfCampoEndereco);
				
				bCadastrarCl = new JButton("Cadastrar");
				bCadastrarCl.addActionListener(trata);
				cont1.add(bCadastrarCl);
				
				validate();
				getContentPane().add(cont1);
				setVisible(true);
			} else {
				if (evento.getSource() == jmiVendedor) {
					
					cont2.removeAll();
					cont1.removeAll();
					cont3.removeAll();
					
					cont2.setLayout(new FlowLayout(1, 10, 20));
					
					JLabel lb1 = new JLabel("Nome:");
					jtfCampoNome = new JTextField(25);
					cont2.add(lb1);
					cont2.add(jtfCampoNome);
					
					JLabel lb2 = new JLabel("CPF:");
					jtfCampoCPF = new JTextField(10);
					cont2.add(lb2);
					cont2.add(jtfCampoCPF);
					
					JLabel lb3 = new JLabel("Telefone:");
					;
					jtfCampoTelefone = new JTextField(20);
					cont2.add(lb3);
					cont2.add(jtfCampoTelefone);
					
					JLabel lb4 = new JLabel("E-mail:");
					jtfCampoEmail = new JTextField(35);
					cont2.add(lb4);
					cont2.add(jtfCampoEmail);
					
					JLabel lb5 = new JLabel("Endereco:");
					jtfCampoEndereco = new JTextField(50);
					cont2.add(lb5);
					cont2.add(jtfCampoEndereco);
					
					JLabel lb6 = new JLabel("Salario:");
					jtfCampoSalario = new JTextField(22);
					cont2.add(lb6);
					cont2.add(jtfCampoSalario);
					
					JLabel lb7 = new JLabel("ID:");
					jtfCampoID = new JTextField(22);
					cont2.add(lb7);
					cont2.add(jtfCampoID);
					
					JLabel lb8 = new JLabel("Senha:");
					jtfCampoSenha = new JTextField(30);
					cont2.add(lb8);
					cont2.add(jtfCampoSenha);
					
					bCadastrarVen = new JButton("Cadastrar");
					bCadastrarVen.addActionListener(trata);
					cont2.add(bCadastrarVen);
					
					validate();
					getContentPane().add(cont2);
					setVisible(true);
				} else {
					if (evento.getSource() == jmiGerente) {
						
						cont2.removeAll();
						cont1.removeAll();
						cont3.removeAll();
						
						cont2.setLayout(new FlowLayout(1, 10, 20));
						
						JLabel lb1 = new JLabel("Nome:");
						jtfCampoNome = new JTextField(25);
						cont2.add(lb1);
						cont2.add(jtfCampoNome);
						
						JLabel lb2 = new JLabel("CPF:");
						jtfCampoCPF = new JTextField(10);
						cont2.add(lb2);
						cont2.add(jtfCampoCPF);
						
						JLabel lb3 = new JLabel("Telefone:");
						;
						jtfCampoTelefone = new JTextField(20);
						cont2.add(lb3);
						cont2.add(jtfCampoTelefone);
						
						JLabel lb4 = new JLabel("E-mail:");
						jtfCampoEmail = new JTextField(35);
						cont2.add(lb4);
						cont2.add(jtfCampoEmail);
						
						JLabel lb5 = new JLabel("Endereco:");
						jtfCampoEndereco = new JTextField(50);
						cont2.add(lb5);
						cont2.add(jtfCampoEndereco);
						
						JLabel lb6 = new JLabel("Salario:");
						jtfCampoSalario = new JTextField(22);
						cont2.add(lb6);
						cont2.add(jtfCampoSalario);
						
						JLabel lb7 = new JLabel("ID:");
						jtfCampoID = new JTextField(22);
						cont2.add(lb7);
						cont2.add(jtfCampoID);
						
						JLabel lb8 = new JLabel("Senha:");
						jtfCampoSenha = new JTextField(30);
						cont2.add(lb8);
						cont2.add(jtfCampoSenha);
						
						bCadastrarGerente = new JButton("Cadastrar");
						bCadastrarGerente.addActionListener(trata);
						cont2.add(bCadastrarGerente);
						
						validate();
						getContentPane().add(cont2);
						setVisible(true);
					} else {
						if (evento.getSource() == jmiProduto) {
							
							cont3.removeAll();
							cont2.removeAll();
							cont1.removeAll();
							
							cont3.setLayout(new FlowLayout(1, 10, 20));
							
							JLabel lb1 = new JLabel("Nome:");
							jtfCampoNome = new JTextField(30);
							cont3.add(lb1);
							cont3.add(jtfCampoNome);
							
							JLabel lb3 = new JLabel("Valor:");
							jtfCampoValor = new JTextField(10);
							cont3.add(lb3);
							cont3.add(jtfCampoValor);
							
							JLabel lb4 = new JLabel("Codigo:");
							jtfCampoCod = new JTextField(20);
							cont3.add(lb4);
							cont3.add(jtfCampoCod);
							
							JLabel lb5 = new JLabel("Estoque:");
							jtfCampoEstoque = new JTextField(10);
							cont3.add(lb5);
							cont3.add(jtfCampoEstoque);
							
							JLabel lb2 = new JLabel("Descricao:");
							jtfCampoDescr = new JTextArea("", 5, 30);
							JScrollPane sp = new JScrollPane(jtfCampoDescr,
									JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
									JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
							JPanel painel = new JPanel();
							painel.add(lb2);
							painel.add(sp);
							cont3.add(painel);
							
							bCadastrarPro = new JButton("Cadastrar");
							bCadastrarPro.addActionListener(trata);
							cont3.add(bCadastrarPro);
							
							validate();
							getContentPane().add(cont3);
							setVisible(true);
						} else {
							if (evento.getSource() == bCadastrarCl) {
								String idVendedor = jtfCampoID.getText();
								String nome = jtfCampoNome.getText();
								String cpf = jtfCampoCPF.getText();
								String telefone = jtfCampoTelefone.getText();
								
								String email = jtfCampoEmail.getText();
								String end = jtfCampoEndereco.getText();
								
								int n;
								Gerente g1 = new Gerente("Antonio", "04565678778", "62323454565", "gerente@teste.com",
								"Rua 450", "123456br", "6900", "345454");
								g1.addVendedor("gerald", "123", "123", "geral@mail.com", "rua 5", "123", "1000", "0");
								
								try {
									for (n = 0; n < g1.getVendedores().size() && g1.getVendedores().get(n).getID() == idVendedor; n++) {
										v = g1.getVendedores().get(n);
									}
									
								} catch (NullPointerException e) {
									showMessageDialog(null, "ID do vendedor não encontrado");
								}
								
								FileWriter fw = null;
								try {
									fw = new FileWriter(arquivoDadosClientes, true);
								} catch (IOException e) {
									e.printStackTrace();
								}
								
								BufferedWriter bw = new BufferedWriter(fw);
								try {
									bw.write("nome: " + nome + " cpf: " + cpf + " telefone: " + telefone + " email: " + email + " end: " + end);
									bw.newLine();
									bw.flush();
								} catch (IOException e) {
									e.printStackTrace();
								}
								
								v.addCliente(nome, cpf, telefone, email, end);
								showMessageDialog(null, "Cliente Cadastrado!");
							} else {
								if (evento.getSource() == bCadastrarVen) {
									String nome = jtfCampoNome.getText();
									String cpf = jtfCampoCPF.getText();
									String telefone = jtfCampoTelefone.getText();
									String email = jtfCampoEmail.getText();
									String end = jtfCampoEndereco.getText();
									String Salario = jtfCampoSalario.getText();
									String Id = jtfCampoID.getText();
									String senha = jtfCampoSenha.getText();
									
									FileWriter fw = null;
									try {
										fw = new FileWriter(arquivoDadosVendedor, true);
									} catch (IOException e) {
										e.printStackTrace();
									}
									
									BufferedWriter bw = new BufferedWriter(fw);
									try {
										bw.write("nome: " + nome + " cpf: " + cpf + " telefone: " + telefone + " email: " + email + " end: " + end + " salário: " + Salario + " id: " + Id + " Senha: " + senha);
										bw.newLine();
										bw.flush();
									} catch (IOException e) {
										e.printStackTrace();
									}
									
									g.addVendedor(nome, cpf, telefone, email, end, senha, Salario, Id);
									showMessageDialog(null, "Vendedor Cadastrado!");
								} else {
									if (evento.getSource() == bCadastrarPro) {
										String nome = jtfCampoNome.getText();
										String cod = jtfCampoCod.getText();
										String valor = jtfCampoValor.getText();
										String descri = jtfCampoDescr.getText();
										String estoque = jtfCampoEstoque.getText();
										
										FileWriter fw = null;
										try {
											fw = new FileWriter(arquivoDadosProdutos, true);
										} catch (IOException e) {
											e.printStackTrace();
										}
										
										BufferedWriter bw = new BufferedWriter(fw);
										try {
											bw.write("nome: " + nome + " cod: " + cod + " valor: " + valor + " descrição: " + descri + " estoque: " + estoque);
											bw.newLine();
											bw.flush();
										} catch (IOException e) {
											e.printStackTrace();
										}
									} else {
										if (evento.getSource() == bCadastrarVen) {
											String nome = jtfCampoNome.getText();
											String cpf = jtfCampoCPF.getText();
											String telefone = jtfCampoTelefone.getText();
											String email = jtfCampoEmail.getText();
											String end = jtfCampoEndereco.getText();
											String Salario = jtfCampoSalario.getText();
											String Id = jtfCampoID.getText();
											String senha = jtfCampoSenha.getText();
											
											FileWriter fw = null;
											try {
												fw = new FileWriter(arquivoDadosVendedor, true);
											} catch (IOException e) {
												e.printStackTrace();
											}
											
											BufferedWriter bw = new BufferedWriter(fw);
											try {
												bw.write("nome: " + nome + " cpf: " + cpf + " telefone: " + telefone + " email: " + email + " end: " + end + " salário: " + Salario + " id: " + Id + " Senha: " + senha);
												bw.newLine();
												bw.flush();
											} catch (IOException e) {
												e.printStackTrace();
											}
											
											g.addVendedor(nome, cpf, telefone, email, end, senha, Salario, Id);
											showMessageDialog(null, "Vendedor Cadastrado!");
										} else {
											if (evento.getSource() == bCadastrarGerente) {
												String nome = jtfCampoNome.getText();
												String cpf = jtfCampoCPF.getText();
												String telefone = jtfCampoTelefone.getText();
												String email = jtfCampoEmail.getText();
												String end = jtfCampoEndereco.getText();
												String Salario = jtfCampoSalario.getText();
												String Id = jtfCampoID.getText();
												String senha = jtfCampoSenha.getText();
												
												if(senha.length() < 4) {
													showMessageDialog(null, "A senha deve ter no mínimo 4 dígitos!");
													try {
														throw new SenhaMuitoPequenaException("A senha deve ter no mínimo 4 dígitos!");
													} catch (SenhaMuitoPequenaException e) {
														e.printStackTrace();
													}
												}
												
												FileWriter fw = null;
												try {
													fw = new FileWriter(arquivoDadosGerente, true);
												} catch (IOException e) {
													e.printStackTrace();
												}
												
												BufferedWriter bw = new BufferedWriter(fw);
												try {
													bw.write("nome: " + nome + " cpf: " + cpf + " telefone: " + telefone + " email: " + email + " end: " + end + " salário: " + Salario + " id: " + Id + " Senha: " + senha);
													bw.newLine();
													bw.flush();
												} catch (IOException e) {
													e.printStackTrace();
												}
												
												g.addVendedor(nome, cpf, telefone, email, end, senha, Salario, Id);
												showMessageDialog(null, "Gerente Cadastrado!");
											}
											
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
