import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        double valorDoDolar=5.25;
        double valorDoEuro=5.65;
        double valorParaSerConverdido=0;
        double valorDeMoedaConvertido=0;
        int respostaContinuacao;

        do{
            String[] opcoesDeConversao={"Conversor de Moeda: ", "Conversor de Temperatura"};
            String tipoDeConversaoEscolhida=(String)JOptionPane.showInputDialog(null,"Escolha uma opção","Menu",JOptionPane.PLAIN_MESSAGE,null,opcoesDeConversao,opcoesDeConversao[0]);

            try{
                valorParaSerConverdido=Double.parseDouble(
                    (String)JOptionPane.showInputDialog(null,"Insira um valor","Input",JOptionPane.INFORMATION_MESSAGE)
                );
            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Valor inválido, fim do programa","Erro",JOptionPane.ERROR_MESSAGE);
                throw new RuntimeException("Encerrando o programa");
            }

            String[] opcaoesDeConversaoDeMoeda={"Converter de Reais a Dólar", "Converter de Reais a Euro", "Converter de Dólar a Reais", "Converter de Euro a Reais"};
            String moedaParaConversaoEscolhida=(String)JOptionPane.showInputDialog(null,"Escolha o tipo de conversao","Moedas",JOptionPane.PLAIN_MESSAGE,null,opcaoesDeConversaoDeMoeda,opcaoesDeConversaoDeMoeda[0]);
            switch(moedaParaConversaoEscolhida){
                case "Converter de Reais a Dólar":
                    valorDeMoedaConvertido=valorParaSerConverdido*valorDoDolar;
                    break;
                case "Converter de Reais a Euro":
                    valorDeMoedaConvertido=valorParaSerConverdido*valorDoEuro;
                    break;
                case "Converter de Dólar a Reais":
                    valorDeMoedaConvertido=valorParaSerConverdido/valorDoDolar;
                    break;
                case "Converter de Euro a Reais":
                    valorDeMoedaConvertido=valorParaSerConverdido/valorDoEuro;
                    break;
                default: 
                    System.out.println("Nenhuma opção escolhida");
                    break;
            }
            JOptionPane.showMessageDialog(null,"O valor da conversão é de " + valorDeMoedaConvertido,"Saída",JOptionPane.PLAIN_MESSAGE);
        
            respostaContinuacao=JOptionPane.showConfirmDialog(null,"Deseja continuar?","Select a option",JOptionPane.YES_NO_OPTION);
        } while(respostaContinuacao==0);
        
        JOptionPane.showMessageDialog(null,"Programa finalizado","Message",JOptionPane.INFORMATION_MESSAGE);
    }
}
