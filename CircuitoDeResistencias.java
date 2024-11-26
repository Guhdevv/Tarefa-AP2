import javax.swing.JOptionPane;

public class CircuitoDeResistencias {
    public static void main(String[] args) {
        double[] resistencias = new double[4];
        double soma = 0, maior = Double.MIN_VALUE, menor = Double.MAX_VALUE;

        for (int i = 0; i < 4; i++) {
            resistencias[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da resistência " + (i + 1) + " em ohms:"));
            soma += resistencias[i];
            if (resistencias[i] > maior) maior = resistencias[i];
            if (resistencias[i] < menor) menor = resistencias[i];
        }

        String resultado = "Resistência Equivalente: " + soma + " ohms\n" +
                "Maior Resistência: " + maior + " ohms\n" +
                "Menor Resistência: " + menor + " ohms";

        JOptionPane.showMessageDialog(null, resultado);
    }
}