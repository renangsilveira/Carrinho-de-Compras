

public class Produto {

	private String nome;
	private double preco;
        private int id;
        private int quant;
        
        
	public Produto(String nome, double preco, int id, int quant) {
		this.nome = nome;
		this.preco = preco;
                this.id=  id;
                this.quant = quant;
	}

	public double getPreco() {
		return preco;
	}
        
        public void setPreco(float preco) {
		this.preco = preco;
	}
        
        public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
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
        public boolean equals(Object obj) {
		Produto p = (Produto) obj;
		return nome.equals(p.nome);
	}
        
        

}
