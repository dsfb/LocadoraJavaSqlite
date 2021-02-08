package com.github.dsfb.locadorajavasqlite.view;

import java.util.Scanner;

public class View {
	private Scanner scanner = new Scanner(System.in);

	private void printf(String text) {
		System.out.printf(text);
	}

	public void showMenu() {
		printf("------------------------------ Locadora GeeksBR ------------------------------");
		printf("\n\n1  - Cadastrar um filme\n");
		printf("2  - Cadastrar um cliente\n");
		printf("3  - Listar todos os filmes\n");
		printf("4  - Listar todos os clientes\n");
		printf("5  - Pesquisar por filme\n");
		printf("6  - Pesquisar por cliente\n");
		printf("7  - Alugar um filme\n");
		printf("8  - Entregar um filme\n");
		printf("9  - Excluir um filme\n");
		printf("10 - Excluir um cliente\n");
		printf("11 - Limpar o arquivo de clientes\n");
		printf("12 - Limpar o arquivo de filmes\n");
		printf("13 - Alterar o nome de um cliente ja cadastrado\n");
		printf("14 - Alterar o nome de um filme ja cadastrado\n");
		printf("15 - Alterar o preco de um filme ja cadastrado\n");
		printf("0  - Sair\n");
	}

	public int getUserOption() {
		printf("Digite o numero da opcao: ");
		return scanner.nextInt();
	}
}
