package br.edu.infnet.appvenda.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name="TPerfume")
public class Perfume extends Produto {
	@Min(value = 1, message = "Um perfume deve ter um minimo de 1 ml")
	@Max(value = 1000, message = "Um perfume deve ter um minimo de 1000 ml")
	private Integer mililitros;
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
