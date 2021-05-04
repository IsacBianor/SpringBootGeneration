package org.Generation.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_categoria;


	@NotNull
	private boolean cosmeticos=false;
	
	@NotNull
	private boolean medicacao=false;
	
	@NotNull
	private boolean prontossocorros=false;

	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("tema")
	private List<Produto> produto;
	
	
	public Long getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(Long id_categoria) {
		this.id_categoria = id_categoria;
	}

	public boolean isCosmeticos() {
		return cosmeticos;
	}

	public void setCosmeticos(boolean cosmeticos) {
		this.cosmeticos = cosmeticos;
	}

	public boolean isMedicacao() {
		return medicacao;
	}

	public void setMedicacao(boolean medicacao) {
		this.medicacao = medicacao;
	}

	public boolean isProntossocorros() {
		return prontossocorros;
	}

	public void setProntossocorros(boolean prontossocorros) {
		this.prontossocorros = prontossocorros;
	}

	
}
