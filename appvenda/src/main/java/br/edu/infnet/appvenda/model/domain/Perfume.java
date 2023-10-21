package br.edu.infnet.appvenda.model.domain;

public class Perfume extends Produto {
	private int mililitros;
	private PType tipo;
	
	@Override
	public String toString() {
		return String.format("%s - %d - %s", super.toString(), mililitros, tipo);
	}
	
	public Perfume(int codigo, String descricao, float preco, boolean estoque, int mililitros, PType tipo) {
		super(codigo, descricao, preco, estoque);
		this.mililitros = mililitros;
		this.tipo = tipo;
	}

	public Perfume() {
		super();
	}

	public int getMililitros() {
		return mililitros;
	}

	public void setMililitros(int mililitros) {
		this.mililitros = mililitros;
	}

	public PType getTipo() {
		return tipo;
	}

	public void setTipo(PType tipo) {
		this.tipo = tipo;
	}
	
	public enum PType {
		AguaDeColonia,
		EauDeToilette,
		EauDeParfum,
		Perfume
	}
}
