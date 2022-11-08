package trabalhoso;

import java.util.Scanner;
import java.util.concurrent.ForkJoinTask;

public class ClientePedagio {

    private Integer numeroDeCancelas;
    private Integer numeroDeCancelasAtivas;
    private Integer numeroDeCarros;
    //Integer carro;
    public int total;
    public int precodapassagem;
    int numdecarrosporcancela;
    ProjetoEstacionamento estacionamento;
    
    public Integer getNumeroDeCancelas() {
        return numeroDeCancelas;
    }

    public void setNumeroDeCancelas(Integer numeroDeCancelas) {
        this.numeroDeCancelas = numeroDeCancelas;
    }

    public Integer getNumeroDeCancelasAtivas() {
        return numeroDeCancelasAtivas;
    }

    public void setNumeroDeCancelasAtivas(Integer numeroDeCancelasAtivas) {
        this.numeroDeCancelasAtivas = numeroDeCancelasAtivas;
    }

    public Integer getNumeroDeCarros() {
        return numeroDeCarros;
    }

    public void setNumeroDeCarros(Integer numeroDeCarros) {
        this.numeroDeCarros = numeroDeCarros;
    }

    @Override
    public String toString() {
        return "Numero de cancelas: "+numeroDeCancelas+ "" +
            "\n"+ "Numero de cancelas ativas: "+numeroDeCancelasAtivas+"" +
            "\n"+"Numero de carros: "+numeroDeCarros+"\n";
    }
  
    
    
    public static int cancelas(){
    	
		//int numeroDeCancelasAtivas;
		Scanner numeroDeCancelasAtivas = new Scanner(System.in);
        
	       
        System.out.println("Digite o numero de cancelas ativas: ");
        int cancativas = numeroDeCancelasAtivas.nextInt();
		
		for (int i = 0; i < cancativas; i++) {
        
			if(cancativas == 0 ) {
				System.out.println("nao passaram carros por esta cancela");	
			} 
			else {
				 
					 
					 //System.out.println("esse carro demorou: " + total + "para ser atendido" );
					 
					 //numeroDeCancelasAtivas = 5 + precodapassagem;
				//int valortotal  = precodapassagem *  numcarro;
					 System.out.println("valor arrecadado nessa cancela:");   
				       
					 System.out.println(numeroDeCancelasAtivas);
				        
				          
			}
		}
		return cancativas;
	 
			
	
	}
   /* public class threads {

    	
        

    	public static Runnable t1 = new Runnable() {
    		public void run() {
    			
    			
    			
    			System.out.println(threads.Carro());
    			System.out.println(threads.cancelas());
    		}
    	};

    	public static Runnable t2 = new Runnable() {
    		public void run() {
    			
    			
    			System.out.println(threads.Carro());
    			System.out.println(threads.cancelas());
    		}
    	};

    	public static Runnable t3 = new Runnable() {
    		public void run() {
    			
    			
    			
    			System.out.println(threads.Carro());
    			System.out.println(threads.cancelas());
    		}
    	};

    	public static Runnable t4 = new Runnable() {
    		public void run() {
    			
    			
    			
    			
    			System.out.println(threads.Carro());
    			System.out.println(threads.cancelas());
    			
    		}
    	};
    	
    	public static Runnable t5 = new Runnable() {
    		public void run() {
    			
    			
    			
    			
    			System.out.println(threads.Carro());
    			System.out.println(threads.cancelas());
    			
    		}
    	};*/
    }

 



