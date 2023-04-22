import javax.swing.JOptionPane;
import java.lang.Double;

public class IMC {

    public static void main(String[] args) {
        double peso,
               altura,
               imc;
        String messageFinal;
        String name = JOptionPane.showInputDialog(null, "Qual o seu nome?", "Nome", 3);
        String messageName = String.format("Bem vindo %s!%n", name) +
                             String.format("1º) O ponto depois do zero é . (ponto final)%n") +
                             String.format("2º) A altura e o peso segue a mesma regra acima");
        JOptionPane.showMessageDialog(null, messageName, "Regras", 2);
        String pesoEntrada = JOptionPane.showInputDialog(null, "Qual o seu peso?", "Insira o peso", 3);
        String alturaEntrada = JOptionPane.showInputDialog(null, "Qual a sua altura?", "Altura", 3);
        peso = Double.parseDouble(pesoEntrada);
        altura = Double.parseDouble(alturaEntrada);
        imc = peso / (altura * altura);
        if(imc < 18.5){
            messageFinal = String.format("Seu imc é %.2f%n", imc) +
                           String.format("%s, sua classificação é: Magreza", name);
        }
        else if (imc >= 18.5 && imc <= 24.9){
             messageFinal = String.format("Seu imc é %.2f%n", imc) +
                            String.format("%s, sua classificação é: Normal", name);
        }
        else if (imc >= 25 && imc <= 29.9){
            messageFinal = String.format("Seu imc é %.2f%n", imc) +
                           String.format("%s, sua classificação é: Sobrepeso", name);
        }
        else if (imc >= 30 && imc <= 34.9){
            messageFinal = String.format("Seu imc é %.2f%n", imc) +
                           String.format("%s, sua classificação é: Obesidade grau I", name);
        }
        else{
            messageFinal = String.format("Seu imc é %.2f%n", imc) +
                           String.format("%s, sua classificação é: Obesidade grau II", name);
        }
        JOptionPane.showMessageDialog(null, messageFinal, "Resultado final", 1);
    }
}
