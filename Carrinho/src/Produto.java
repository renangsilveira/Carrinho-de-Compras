

public class Produto {

	private String nome;
	private double preco;
        private int id;
        private int quant;
        
        
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}
        
	public boolean equals(Object obj) {
		Produto p = (Produto) obj;
		return nome.equals(p.nome);
	}
        
        public String getName() {
		return nome;
	}
	
	public void setName(String nome) {
		this.nome = nome;
	}
	
	public double getPrice() {
		return preco;
	}

	public void setPrice(float preco) {
		this.preco = preco;
	}
	
	public int getQuant() {
		return quant;
	}

	public void setQuant(int quantidade) {
		this.quant = quantidade;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", quantidade=" + quant + ", id="
				+ id + ", preco=" + preco + "]";
	}
        
        

}
