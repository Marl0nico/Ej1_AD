package clase.test;
import clase.implementacion.operacionesImplementacion;
import clase.interfaz.operaciones;
import javax.swing.*;
import java.util.Scanner;
public class operacionesTest {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        double x=0.0;
        double y=0.0;
        operaciones op= new operacionesImplementacion();
        Scanner entrada=new Scanner(System.in);
        x=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número"));
        y=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo número"));
        JOptionPane.showMessageDialog(null, "La respuesta es "+op.sumar(x, y));
        //System.out.println("Ingrese el primer número:");
        //x=entrada.nextDouble();
        //System.out.println("Ingrese el segundo número:");
        //y=entrada.nextDouble();
        //System.out.println("La suma es:"+op.sumar(x, y));
    }
}
