public class Acai {
    public String tamanho;
    public Double valor;
    public Boolean acrescimoSorvete;
    public Double calcularValor(Boolean acrescimoSorvete, String tamanho){
        if (tamanho.equals("P")){
            valor= 8
        }else if (tamanho.equals("M")){
            valor=10.0;
            else{
                valor=12;
            }
            if (acrescimoSorvete){
                valor +=2.0;
            }
            return valor;
        }

    }
}
