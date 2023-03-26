import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        String[] choices = {"Conversor de Moeda", "Conversor de Temperatura"};
        JOptionPane.showInputDialog(null, "Escolha uma opção", 
        "Menu", JOptionPane.PLAIN_MESSAGE, null, choices, choices[0]);

    }
}
