package hilos.clase;
import hilos.clase.Auto;
import javax.swing.*;
import java.awt.event.*;
public class procesoF implements Runnable {
    @Override
    public void run() {
        SwingUtilities.invokeLater(() -> {
            JFrame ventanAuto = new JFrame("Ingreso de Datos del Auto");
            ventanAuto.setSize(350, 250);
            ventanAuto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventanAuto.setLayout(null);
            JLabel marca = new JLabel("Marca:");
            marca.setBounds(30, 20, 100, 25);
            ventanAuto.add(marca);
            JTextField campoMarca = new JTextField();
            campoMarca.setBounds(120, 20, 180, 25);
            ventanAuto.add(campoMarca);
            JLabel modelo = new JLabel("Modelo:");
            modelo.setBounds(30, 60, 100, 25);
            ventanAuto.add(modelo);
            JTextField campoModelo = new JTextField();
            campoModelo.setBounds(120, 60, 180, 25);
            ventanAuto.add(campoModelo);
            JLabel precio = new JLabel("Precio:");
            precio.setBounds(30, 100, 100, 25);
            ventanAuto.add(precio);
            JTextField campoPrecio = new JTextField();
            campoPrecio.setBounds(120, 100, 180, 25);
            ventanAuto.add(campoPrecio);
            JButton procesar = new JButton("Procesar");
            procesar.setBounds(100, 150, 120, 30);
            ventanAuto.add(procesar);
            procesar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Auto auto1 = new Auto();
                    auto1.setMarca(campoMarca.getText());
                    auto1.setModelo(campoModelo.getText());
                    try {
                        auto1.setPrecio(Integer.parseInt(campoPrecio.getText()));
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(ventanAuto, "El precio debe ser un número", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    String mensaje = "Marca: " + auto1.getMarca() +
                            "\nModelo: " + auto1.getModelo() +
                            "\nPrecio: $" + auto1.getPrecio();
                    JOptionPane.showMessageDialog(ventanAuto, mensaje, "Datos del Auto", JOptionPane.INFORMATION_MESSAGE);
                }
            });
            ventanAuto.setVisible(true);
        });
    }
}
