import javax.swing.*{
    public class PontoAcai {
        public static void main(String[] args) {
            String tamanho= JOptionPane.showInputDialog(null,"ponto do açai:\n");
            String desejaSorvete = JOptionPane.showInputDialog(null,"deseja sorvete?\n S-sim\n N-nao");
            Acai acai = new Acai();
            Boolean acrescimoSorvete;
            if (desejaSorvete.equals("S")) {
                acrescimoSorvete = true;
            }else{
                acrescimoSorvete = false;
            }
            Double valorTotal= acai.calcularValor(acrescimoSorvete,tamanho);
            JOptionPane.showMessageDialog(null,"o valor é:"+ valorTotal);
        }
}
}
