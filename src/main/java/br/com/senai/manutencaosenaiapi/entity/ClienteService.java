package br.com.senai.manutencaosenaiapi.entity;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import com.google.common.base.Preconditions;

@Service
@Validated
public class ClienteService {

	final int IDADE_MINIMA = 12;

	public Cliente inserir(
			@Valid
			@NotNull(message = "O cliente não pode ser nulo")
			Cliente novoCliente) {
		Preconditions.checkArgument(novoCliente.getIdade()
				> IDADE_MINIMA, "O cliente deve possuir mais de 12 anos");
		Cliente clienteSalvo = novoCliente;
		return clienteSalvo;
	}

public Cliente alterar(
		@Valid
		@NotNull (message = "O cliente não pode ser nulo")
		Cliente clienteSalvo) {
	this.validarIdadeDo(clienteSalvo);
	Cliente clienteAtualizado = clienteSalvo; 
	return clienteAtualizado;
	
}

public List<Cliente> listarPor(
		@NotEmpty(message = "O nome para a busca é obrigatório")
		@NotBlank(message = "O nome da busca não deve conter espaço em branco")
		String nome) {
	return new ArrayList<Cliente>();
}

public void removerPor(
		@NotNull(message = "O id para remoção não pode ser nulo")
		@Min(value = 1, message = "O id deve ser maior que 0")
		Integer id) {
	
}

private void validarIdadeDo(Cliente cliente) {
	Preconditions.checkArgument(cliente.getIdade() > IDADE_MINIMA,
			"O cliente deve possuir mais de 12 anos");

}

}