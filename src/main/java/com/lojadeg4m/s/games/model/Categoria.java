package com.lojadeg4m.s.games.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_categoria;
	
	
	@NotBlank (message = "O atributo nome é obrigatório!")
	@Size(min = 1, max = 50, message = "O atributo nome deve conter no mínimo 1 e no máximo 50 caracteres")
	private String nome;

	
	@NotBlank (message = "O atributo descrição é obrigatório!")
	@Size(min = 1, max = 250, message = "O atributo descrição deve conter no mínimo 1 e no máximo 250 caracteres")
	private String descricao;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;


	public long getId_categoria() {
		return id_categoria;
	}


	public void setId_categoria(long id_categoria) {
		this.id_categoria = id_categoria;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public List<Produto> getProduto() {
		return produto;
	}


	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
}
