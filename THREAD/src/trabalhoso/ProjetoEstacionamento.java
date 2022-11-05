package trabalhoso;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ProjetoEstacionamento {
    public static void main(String[] args) {
    dadospedagio();
    }
        public static void dadospedagio(){
            Scanner sc = new Scanner(System.in);
            ClientePedagio clientePedagio;
            List<ClientePedagio> listaCliente = new ArrayList<ClientePedagio>();
            int opcao = 0;

            do {
            	System.out.println("_______________________");
                System.out.println("## Escolha uma das opções abaixo ##");
                System.out.println("Opção 1 - Cadastra novo cliente");
                System.out.println("Opção 2 - Imprime clientes cadastrados");
                System.out.println("Opção 0 - Sair do programa");
                System.out.println("_______________________");
                System.out.print("Digite aqui sua opção: ");
                opcao = Integer.parseInt(sc.nextLine());

                if(opcao == 1){
                    //Cria um novo objeto
                    clientePedagio = new ClientePedagio();
                    

                    System.out.println("Digite o numero de cancelas: ");
                    clientePedagio.setNumeroDeCancelas(Integer.parseInt(sc.nextLine()));

                    System.out.print("Digite o numero de cancelas ativas: ");
                    clientePedagio.setNumeroDeCancelasAtivas(Integer.parseInt(sc.nextLine()));

                    System.out.print("Digite o numero de carros: ");
                    clientePedagio.setNumeroDeCarros(Integer.parseInt(sc.nextLine()));

                    System.out.println();
                    
                    
                   
                    

                    //Guarda o objeto pessoa em uma lista.
                    listaCliente.add(clientePedagio);
                }else if(opcao == 2){
                    if(listaCliente.isEmpty()){
                        System.out.println("Não existem clientes cadastrados, pressione uma tecla para continuar!");
                        sc.nextLine();
                    }else{
                        System.out.println(listaCliente.toString());

                        System.out.println("Pressione um tecla para continuar.");
                        sc.nextLine();
                    }         }
            } while (opcao != 0);

            sc.close();
            }
}
