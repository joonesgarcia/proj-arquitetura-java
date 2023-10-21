package br.edu.infnet.appvenda.model.domain;

public class Produto {

	private int codigo;
	private String descricao;
	private float preco;
	private boolean estoque;
	
	private Vendedor vendedor;
	
	@Override
	public String toString() {
		return String.format("%d - %s - %.2f - %s", codigo, descricao, preco, estoque);
	}
	
	public Produto() {
		
	}
	
	public Produto(int codigo, String descricao, float preco, boolean estoque) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
		this.estoque = estoque;
	}
	
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public int getCodigo() {
		return this.codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public boolean isEstoque() {
		return estoque;
	}
	public void setEstoque(boolean estoque) {
		this.estoque = estoque;
	}	
}
