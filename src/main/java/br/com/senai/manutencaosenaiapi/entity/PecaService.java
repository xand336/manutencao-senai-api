package br.com.senai.manutencaosenaiapi.entity;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class PecaService {

	public Peca inserir(@Valid
			@NotNull (message = "A peça não pode ser nula")
	Peca novaPeca) {

		Peca pecaSalva = novaPeca;
		return pecaSalva;
	}

	public Peca alterar(@Valid
			@NotNull(message = "A peça não pode ser nula")
			Peca pecaSalva) {

		Peca pecaAtualizada = pecaSalva;

		return pecaAtualizada;
	}

	public List<Peca> listarPor(
			@NotEmpty(message = "A descricão da busca é obrigatória")
			@NotBlank(message = "A descrição não pode ter espaço em branco")
			String descricao) {
		return new ArrayList<Peca>();
	}

}
