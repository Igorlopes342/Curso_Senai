package com.Igorsenai;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Igorsenai.domain.Cidade;
import com.Igorsenai.domain.Cliente;
import com.Igorsenai.domain.Endereco;
import com.Igorsenai.domain.Estado;
import com.Igorsenai.domain.enuns.TipoCliente;
import com.Igorsenai.repositories.CidadeRepository;
import com.Igorsenai.repositories.ClienteRepository;
import com.Igorsenai.repositories.EnderecoRepository;
import com.Igorsenai.repositories.EstadoRepository;

@SpringBootApplication
public class CursoSenaiApplication implements CommandLineRunner {

	@Autowired
	private EstadoRepository estadoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private EnderecoRepository enderecoRepository;

	@Autowired
	private CidadeRepository cidadeRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursoSenaiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");
		estadoRepository.saveAll(Arrays.asList(est1, est2));

		Cidade c1 = new Cidade(null, "Uberlândia", est1);
		Cidade c2 = new Cidade(null, "São Paulo ", est2);
		Cidade c3 = new Cidade(null, "Araguari ", est1);
		Cidade c4 = new Cidade(null, "Ribeirão Preto", est2);
		Cidade c5 = new Cidade(null, "Prata ", est2);
		Cidade c6 = new Cidade(null, "Patos de Minas ", est1);
		Cidade c7 = new Cidade(null, "Nova Ponte", est1);
		Cidade c8 = new Cidade(null, "Campinas", est2);
		Cidade c9 = new Cidade(null, "Santos", est2);
		Cidade c10 = new Cidade(null, "Franca", est2);

		cidadeRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10));

		

		Cliente cli1 = new Cliente(null, "Igor lopes", "12345678987", "igor@fiemg.com.br", TipoCliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("34900000000", "32125083245"));

		Cliente cli2 = new Cliente(null, "Guilherme Martins", "13345675980", "gui@fiemg.com.br",
				TipoCliente.PESSOAFISICA);
		cli2.getTelefones().addAll(Arrays.asList("34900070401", "22125083249"));

		Cliente cli3 = new Cliente(null, "Gustavo Lennyng", "45645675986", "lenny@hotmail.com.br",
				TipoCliente.PESSOAFISICA);
		cli3.getTelefones().addAll(Arrays.asList("34989070431", "23125543246"));

		Cliente cli4 = new Cliente(null, "Marco Tulio", "43345677890", "tulio@fiemg.com.br", TipoCliente.PESSOAFISICA);
		cli4.getTelefones().addAll(Arrays.asList("34954670401", "22125087890"));

		Cliente cli5 = new Cliente(null, "José Ferreira", "67895675980", "jose@gmail.com.br", TipoCliente.PESSOAFISICA);
		cli5.getTelefones().addAll(Arrays.asList("34922334401", "22125083249"));

		Cliente cli6 = new Cliente(null, "Emanoel Sales", "56575675980", "csales@fiemg.com.br",
				TipoCliente.PESSOAFISICA);
		cli6.getTelefones().addAll(Arrays.asList("3498880401", "56589878249"));

		Cliente cli7 = new Cliente(null, "Leandro Camargo", "13345677650", "lea@gmail.com.br",
				TipoCliente.PESSOAFISICA);
		cli7.getTelefones().addAll(Arrays.asList("34903435401", "53225083249"));

		Cliente cli8 = new Cliente(null, "Gabriel Marques", "13454675980", "marques@fiemg.com.br",
				TipoCliente.PESSOAFISICA);
		cli8.getTelefones().addAll(Arrays.asList("56567870401", "44655083249"));

		Cliente cli9 = new Cliente(null, "Carlos Silva", "15875865980", "silva@hotmail.com.br",
				TipoCliente.PESSOAFISICA);
		cli9.getTelefones().addAll(Arrays.asList("3499978401", "89095083249"));

		Cliente cli10 = new Cliente(null, "Daniel Peres", "212345675980", "daniel@fiemg.com.br",
				TipoCliente.PESSOAFISICA);
		cli10.getTelefones().addAll(Arrays.asList("34933450401", "243435083249"));
		clienteRepository.saveAll(Arrays.asList(cli1, cli2, cli3, cli4, cli5, cli6, cli7, cli8, cli9, cli10));

		Endereco e1 = new Endereco(null, "Rua das Lamedas", "78p", "ap320", "Pacaembu", "380401456", cli1, c1);
		Endereco e2 = new Endereco(null, "Rua das Laranjeiras", "567", null, "Centro", "3435678976", cli2, c2);
		Endereco e3 = new Endereco(null, "Rua Tiago", "56p", "ap230", "Jardim Brasilia", "330401456", cli3, c3);
		Endereco e4 = new Endereco(null, "Rua 28 de Março", "80", "ap232", "Pacaembu", "45636456", cli4, c4);
		Endereco e5 = new Endereco(null, "Rua Paris", "34p", "ap456", "Luizote", "907701456", cli5, c5);
		Endereco e6 = new Endereco(null, "Rua das Folhas", "68", "ap323", "Maravilha", "323546546", cli6, c6);
		Endereco e7 = new Endereco(null, "Rua das Seda", "56p", "ap430", "Jardim Amêrica", "450551456", cli7, c7);
		Endereco e8 = new Endereco(null, "Rua das Pitanga", "38", "ap450", "Shopping Park", "8967596846", cli8, c8);
		Endereco e9 = new Endereco(null, "Rua Cesario", "98p", "ap750", "São Jorge", "478951456", cli9, c9);
		Endereco e10 = new Endereco(null, "Rua Santos", "97", "ap230", "Don Almir", "322425456", cli10, c10);

		enderecoRepository.saveAll(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10));

	}

}
