package org.Generation.LojaGames.model;

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
	
	
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
	
	private @NotNull boolean game;
	
	private @NotNull boolean figureaction;
	
	private @NotNull boolean console;
	
	private @NotNull boolean dispositivos;
	
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;
	

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isGame() {
		return game;
	}

	public void setGame(boolean game) {
		this.game = game;
	}

	public boolean isFigureaction() {
		return figureaction;
	}

	public void setFigureaction(boolean figureaction) {
		this.figureaction = figureaction;
	}

	public boolean isConsole() {
		return console;
	}

	public void setConsole(boolean console) {
		this.console = console;
	}

	public boolean isDispositivos() {
		return dispositivos;
	}

	public void setDispositivos(boolean dispositivos) {
		this.dispositivos = dispositivos;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	
	
}
