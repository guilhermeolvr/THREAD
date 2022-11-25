package trabalhoso;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Pedágio extends ClientePedagio {

   public static void main(String[] args) throws InterruptedException {
       Estacionamento();
   }
   public static void Estacionamento() throws InterruptedException {

       Scanner sc = new Scanner(System.in);
       Pedágio pedagio;
       pedagio = new Pedágio();
       System.out.println("------------------------------------------");
       System.out.print("Digite o numero de cancelas: ");
       pedagio.setNumeroDeCancelas(Integer.parseInt(sc.nextLine()));

       ClientePedagio clientePedagio;
       clientePedagio = new ClientePedagio();

       Scanner sc2 = new Scanner(System.in);
       System.out.print("Digite o numero de cancelas ativas: ");
       clientePedagio.setNumeroDeCancelasAtivas(Integer.parseInt(sc2.nextLine()));
       System.out.print("Digite o numero de carros: ");
       clientePedagio.setNumeroDeCarros(sc2.nextInt());
       sc2.close();

       numeroDeCarrosporcancela = clientePedagio.getNumeroDeCarros() / clientePedagio.getNumeroDeCancelasAtivas();

       valortotal  = 5 *  clientePedagio.getNumeroDeCarros() / clientePedagio.getNumeroDeCancelasAtivas();

       System.out.println("------------------------------------------");
       for (int i = 0; i < pedagio.numeroDeCancelas ; i++) {
             new Thread() {
               @Override
               public void run() {
                   long start = System.currentTimeMillis();
                   try {
                       TimeUnit.SECONDS.sleep(2);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
                   System.out.println("Numero de carros nessa cancela: "+numeroDeCarrosporcancela);
                   System.out.println("Valor arrecadado nessa cancela: R$"+ valortotal);
                   for (int i = 0; i < pedagio.numeroDeCarrosporcancela ; i++) {
                       long finish = System.currentTimeMillis();

                       long total = finish - start;
                       System.out.println("um carro passou por esta cancela: ");
                       System.out.println("Tempo aproximado total em milisegundos = " + total);
                       System.out.println("Tempo de inicio: " + start);
                       System.out.println("Tempo de termino: " + finish);
                       System.out.println("------------------------------------------");
                   }
               }
           }.start();
           TimeUnit.SECONDS.sleep(1);

       }
   }
}
