package hilos.clase;

import javax.swing.*;

public class procesoE implements Runnable{
    private String saludo;
    public procesoE (String saludo){
        this.saludo=saludo;
    }
    public void ventanaSaludo(String saludo){
        JOptionPane.showMessageDialog(null, saludo);
    }
    @Override
    public void run() {
        ventanaSaludo(saludo);
    }
}
