/*package clase.vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vistaOperaciones {
    private JTextField valorIngreso1;
    private JTextField valorIngreso2;
    private JButton multiplicacion;
    private JButton suma;
    private JButton resta;
    private JButton limpiarValores;
    private JButton division;
    private JLabel valor1;
    private JLabel valor2;
    private JLabel respuesta;
    private JPanel calculadora;

    public vistaOperaciones() {
        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        multiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        limpiarValores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

}*/




package clase.vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vistaOperaciones{
    private JTextField valorIngreso1;
    private JTextField valorIngreso2;
    private JButton multiplicacion;
    private JButton suma;
    private JButton resta;
    private JButton limpiarValores;
    private JButton division;
    private JLabel valor1;
    private JLabel valor2;
    private JLabel respuesta;
    private JPanel calculadora;

    public vistaOperaciones() {
        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarOperacion('+');
            }
        });
        resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarOperacion('-');
            }
        });
        multiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarOperacion('*');
            }
        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarOperacion('/');
            }
        });
        limpiarValores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valorIngreso1.setText("");
                valorIngreso2.setText("");
                respuesta.setText("Resultado:");
            }
        });
    }

    private void realizarOperacion(char operador) {
        try {
            double num1 = Double.parseDouble(valorIngreso1.getText());
            double num2 = Double.parseDouble(valorIngreso2.getText());
            double resultado = 0;

            switch (operador) {
                case '+': resultado = num1 + num2; break;
                case '-': resultado = num1 - num2; break;
                case '*': resultado = num1 * num2; break;
                case '/':
                    if (num2 == 0) {
                        respuesta.setText("Error: división por 0");
                        return;
                    }
                    resultado = num1 / num2; break;
            }

            respuesta.setText("Resultado: " + resultado);
        } catch (NumberFormatException ex) {
            respuesta.setText("Error: ingresar números válidos");
        }
    }

    public JPanel getCalculadora() {
        return calculadora;
    }

    public static void main(String[] args) {
        // Iniciar la calculadora
        //new vistaOperaciones();
        JFrame frame = new JFrame("Calculadora Básica");
        vistaOperaciones ventana = new vistaOperaciones();
        frame.setContentPane(ventana.getCalculadora());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(250, 200);
        frame.setLocationRelativeTo(null); // Centra la ventana
        frame.setVisible(true);
    }
}

