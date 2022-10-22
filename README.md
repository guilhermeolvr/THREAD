# THREAD
Implementar um programa em java que irá simular o comportamento de um pedágio.  Os seguintes dados serão informados pelo usuário para o funcionamento do programa:  

1 - Número total de cancelas. 

2 - Número de cancelas ativas no momento. 

3 - Número de veículos a serem atendidos.

Os seguintes dados poderão ser fixados no código:

1 - Valor do pedágio

As seguintes regras devem ser atendidas:

1 - O número de threads criadas não poderá ultrapassar o número de cancelas ativas

2 - Cada carro terá uma informação de tempo de atendimento (um número inteiro).
Esse valor deve ser utilizado para que cada thread aguarde o tempo de atendimento definido.

Ao final da execução, as seguintes informações devem ser apresentadas:

1 - Número de carros atendidos por cada cancela.

2 - Relatório de Total arrecadado por cada cancela
(Ordenado do maior para o menor).

…or create a new repository on the command line
echo "# Trabalho-de-SO" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/guilhermeolvr/THREAD.git
git push -u origin main
…or push an existing repository from the command line
git remote add origin https://github.com/guilhermeolvr/THREAD.git
git branch -M main
git push -u origin main


package atvcompiladores;

import java.util.Scanner;

public class trabalhoSOparalelismo {
	
	
		static int numero = 0;
		
		public static void main(String[] args) {
			
			
			
			new Thread(t1).start();
			new Thread(t2).start();
			
			
		}
		
				 		
		static Scanner palavramista = new Scanner(System.in);   //recebendo a palavra mista
		static String stringmista = palavramista.nextLine();
		
		
		
		
		private static Runnable t1 = new Runnable() {
			
			@Override
			public void run() {
								
				
				char[] chars = stringmista.toCharArray();  //dividindo a string em blocos(caracteres) analisando caracter por caracter com o laco for
		        for (int i = 0; i < chars.length; i++)
		        {
		            chars[i] = Character.isUpperCase(chars[i])
		                                ? Character.toLowerCase(chars[i]) //se o caracter for maisculo recebe funcao Lowercase, minuscula Uppercase
		                                : Character.toUpperCase(chars[i]);
		        }
		        
		        System.out.println("palavra mista transformada:");   
		        System.out.println(chars);   //imprimindo os caracteres
				
				
				palavramista.close();
			}
		}; 
		
		
		
		
		private static Runnable t2 = new Runnable() {
			
			@Override
			public void run() {
				
				char[] chars = stringmista.toCharArray();  //dividindo a string em blocos(caracteres) analisando caracter por caracter com o laco for
		        for (int i = 0; i < chars.length; i++)
		        {
		            chars[i] = Character.isUpperCase(chars[i])
		                                ? Character.toLowerCase(chars[i]) //se o caracter for maisculo recebe funcao Lowercase, minuscula Uppercase
		                                : Character.toUpperCase(chars[i]);
		        }
		        
		        System.out.println("palavra mista transformada:");   
		        System.out.println(chars);   //imprimindo os caracteres
				
				
				palavramista.close();
			}
		};

	}



Aí a gnt pede pro usuário
O tanto de veículos
Em cada cancela
Pra cada cancela
A gnt pode pegar a quantidade de carros
E dividir pelas cancelas
Pra poder distribuir
Aí manda pra cada thread executar o seguinte
O valor
Pega o total de carros e multiplica pelo valor
Podemos printar tbm
Cancela arrecadou tanto
O tempo q demorou pra isso
Q aí no caso será o tempo de atendimento de cada carro
Cancela tal arrecadou tanto
Multiplica pelo total de carros q foram para aquele cancela
