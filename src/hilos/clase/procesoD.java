package hilos.clase;
public class procesoD implements Runnable{
    private int n;
    public procesoD(int n){
        this.n=n;
    }
    public void asteriscos(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("Iteración "+i+": *****");
        }
    }
    @Override
    public void run() {
        asteriscos(n);
    }
}
