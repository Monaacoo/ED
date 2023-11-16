import javax.swing.JOptionPane;

/**
 *
 * @author 0031432312007
 */
public class ExercicioCarro {
   public static void main(String[] args) {
       Carro c = new Carro (8);
       Carro copia = new Carro (8);
       String placa, buscaPlaca;
       boolean veiculoEncontrado = false;
       
        while(c.cheia() == false){
            placa = JOptionPane.showInputDialog(
                   "Informe a placa do carro: " + " carro a ser estacionado: "
            );
            if(placa.equals("sair"))
                 break;
            else{    
            c.empilhar(placa);
            copia.empilhar(placa);
            }
       }
        buscaPlaca = JOptionPane.showInputDialog(
                "Informe a placa do carro: " + " a ser retirado: ");
        while(copia.vazia() == false){
            placa = String.valueOf(copia.desempilhar());
            if (placa.equals(buscaPlaca)){
                JOptionPane.showMessageDialog(null,"Carro encontrado" );
                veiculoEncontrado = true;
                break;
            }
        }
        if(veiculoEncontrado == true){
            while(c.vazia() == false){
                placa = String.valueOf(c.desempilhar());
                if (placa.equals(buscaPlaca))
                    break;
                else{
                    JOptionPane.showMessageDialog(null,"O carro com a placa " + placa + " deve ser retirado");
                }
            }
        }
            else{
                    JOptionPane.showMessageDialog(null,"Carro nao esta na rua");
            }
    }
}
