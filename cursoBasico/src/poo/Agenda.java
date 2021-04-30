package poo;

import java.util.ArrayList;
import java.util.Collection;

public class Agenda {
	String nome;
	int idade;
	double altura;

	//Collection <String> agenda = new ArrayList();
	
	public Agenda(String nome, int idade, double altura) {
		
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}


	public String toString() {
		return this.nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	
}
	
	

/*Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as
seguintes operações:
void armazenaPessoa(String nome, int idade, float altura);
void removePessoa(String nome);
int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da
agenda.*/