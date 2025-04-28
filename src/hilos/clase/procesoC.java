package hilos.clase;
public class procesoC extends Thread{
    //constructor
    private int n;
    public procesoC(int n){
        this.n=n;
    }

    public void dividir (int n){
        for (int i = 10; i>-2; i--) {
            System.out.println(n/i);
        }
    }

    @Override
    public void run() {
        //super.run();
        dividir(n);
    }
}
