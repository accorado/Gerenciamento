import static org.junit.Assert.assertEquals;

public class VendedorTest {
	
	@org.junit.Test
	public void testarVendedor() {
		Vendedor v = new Vendedor("Pedro Andrade", "445034323", "6232243434", "teste@mail.com", "Rua 40", "123456br", "6900", "759078");
		assertEquals("6900", v.getSalario());
	}
	
	@org.junit.Test
	public void testarProduto() {
		Produto p = new Produto("Bolacha", "Bolacha Água e Sal", "1", 23, 456);
		assertEquals("Bolacha Água e Sal", p.getDescri());
	}
}