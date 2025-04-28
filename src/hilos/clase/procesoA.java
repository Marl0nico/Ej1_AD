package hilos.clase;

public class procesoA extends Thread {
    private String name;
    public procesoA(String name){
        this.name=name;
    }
    public void saludar(String name){
        System.out.println("Hola "+name);
    }

    @Override
    public void run() {
        saludar(name);
    }
}
