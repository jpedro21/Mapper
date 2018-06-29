package com.app.mapper;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

public class TesteMapper {
	
	public static void main(String[] args) {
		
		List<PessoaEntidade> listPessoaEntidade = new ArrayList<>();
		listPessoaEntidade.add(new PessoaEntidade("Jose", "40504347845", 20));
		listPessoaEntidade.add(new PessoaEntidade("Maria", "24356712345", 30));
		listPessoaEntidade.add(new PessoaEntidade("Pedro", "24356712345", 30));
		
		ModelMapper mapper = new ModelMapper();
		
		Type listType = new TypeToken<List<PessoaDto>>() {}.getType();
		List<PessoaDto> listPessoaDto = mapper.map(listPessoaEntidade, listType);
		
		listPessoaDto.stream().map(PessoaDto::getNome).forEach(System.out::println);;
		
	}

}
