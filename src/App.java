import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        String[] choices = {"Conversor de Moeda", "Conversor de Temperatura"};
        String input=(String)JOptionPane.showInputDialog(null, 
        "Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE, null, 
        choices, choices[0]);
        
        String entrada=(String)JOptionPane.showInputDialog(null,
        "Insira um valor", "Input", JOptionPane.INFORMATION_MESSAGE);
        
        double valor=0;
        try{
            valor=Double.parseDouble(entrada);
        } catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, 
            "Valor inválido, fim do programa", "Erro", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException("Encerrando o programa");
        }
        System.out.println("[" + valor + "]");

        JOptionPane.showMessageDialog(null, "Valor válido", 
        "Acerto", JOptionPane.NO_OPTION);
    }
}
