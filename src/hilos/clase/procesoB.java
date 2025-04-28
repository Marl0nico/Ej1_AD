package hilos.clase;

public class procesoB extends Thread {
    private int n;
    public procesoB(int n){
        this.n=n;
    }
    public void contar(int n){
        for (int i=1; i<n; i++){
            System.out.println("Iteración n:"+i);
            try{
                sleep(20000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void run() {
        contar(n);
    }
}
