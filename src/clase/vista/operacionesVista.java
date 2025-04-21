package clase.vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class operacionesVista extends JFrame {

    // Componentes de la interfaz
    private JTextField textField1, textField2, textFieldResultado;
    private JButton botonSuma, botonResta, botonMultiplicacion, botonDivision;

    public operacionesVista() {
        // Configuración de la ventana
        setTitle("Calculadora Simple");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10)); // 5 filas y 2 columnas

        // Crear los campos de texto para ingresar números
        textField1 = new JTextField();
        textField2 = new JTextField();
        textFieldResultado = new JTextField();
        textFieldResultado.setEditable(false); // Solo para mostrar el resultado

        // Crear los botones de operación
        botonSuma = new JButton("Sumar");
        botonResta = new JButton("Restar");
        botonMultiplicacion = new JButton("Multiplicar");
        botonDivision = new JButton("Dividir");

        // Añadir los componentes al layout
        add(new JLabel("Número 1:"));
        add(textField1);
        add(new JLabel("Número 2:"));
        add(textField2);
        add(new JLabel("Resultado:"));
        add(textFieldResultado);
        add(botonSuma);
        add(botonResta);
        add(botonMultiplicacion);
        add(botonDivision);

        // Manejadores de eventos
        botonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular("+");
            }
        });

        botonResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular("-");
            }
        });

        botonMultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular("*");
            }
        });

        botonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular("/");
            }
        });

        // Hacer visible la ventana
        setVisible(true);
    }

    private void calcular(String operacion) {
        try {
            // Obtener los números de los campos de texto
            double num1 = Double.parseDouble(textField1.getText());
            double num2 = Double.parseDouble(textField2.getText());
            double resultado = 0;

            // Realizar la operación seleccionada
            switch (operacion) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        JOptionPane.showMessageDialog(this, "Error: No se puede dividir entre 0", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    break;
            }

            // Mostrar el resultado en el campo de texto
            textFieldResultado.setText(String.valueOf(resultado));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese números válidos", "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Iniciar la calculadora
        new operacionesVista();
    }
}