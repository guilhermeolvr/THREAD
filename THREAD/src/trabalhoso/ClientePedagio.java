package trabalhoso;

import java.util.concurrent.ForkJoinTask;

public class ClientePedagio {

    private Integer numeroDeCancelas;
    private Integer numeroDeCancelasAtivas;
    private Integer numeroDeCarros;
    //Integer carro;
    public long total;
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
    
    
    
    public void threads_criadas(){
    	    	
    	
    	for (int i = 0; i < numeroDeCancelasAtivas; i++) {
        
    		new Thread().start();
    	}
    	}
    		
    	private Runnable Thread() = new Runnable() {
    		
    		@Override
    	public void run() {
    			if(numdecarrosporcancela == 0 ) {
    				System.out.println("nao passaram carros por esta cancela");	
    			} 
    			else {
    				 for (int i = 0; i < numdecarrosporcancela; i++) {
    					 numdecarrosporcancela = precodapassagem;
    				     
    				     }
    	        			
    		}
    	} 
    			
    	};
    	    	
        
    
    
    
    
    public void divisaodoscarros(){
     numdecarrosporcancela = numeroDeCarros / numeroDeCancelasAtivas;
        
    	
    		
    		
    		return ;	
       	
        }
    







}