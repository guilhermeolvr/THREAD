package trabalhoso;

public class ClientePedagio {

    private Integer numeroDeCancelas;
    private Integer numeroDeCancelasAtivas;
    private Integer numeroDeCarros;

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
}
