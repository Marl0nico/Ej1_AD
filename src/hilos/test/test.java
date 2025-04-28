package hilos.test;
import hilos.clase.*;

public class test {
    public static void main(String[] args) {
        /*procesoA a =new procesoA("Juan");
        procesoB b= new procesoB(20);
        procesoC c =new procesoC(5);
        //procesoD d=new procesoD(100);
        Runnable x=new procesoD(50);
        Runnable y=new procesoE("Hola como estás?");
        Thread d =new Thread(x);
        Thread e =new Thread(y);
        c.start();
        a.start();
        b.start();
        d.start();
        e.start();*/
        Persona p=new Persona();
        p.setNombre("Juan Pérez");
        p.setFechaNacimiento("01 de agosto del 2001");
        p.setDireccion("Quito, Av. Salinas y Santiago");
        System.out.println("Nombre: "+p.getNombre());
        System.out.println("Fecha de nacimiento: "+p.getFechaNacimiento());
        System.out.println("Dirección: "+p.getDireccion());
        Runnable z=new procesoF();
        Thread f=new Thread(z);
        f.start();
    }
}
