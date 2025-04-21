package clase.implementacion;
import clase.interfaz.operaciones;
public class operacionesImplementacion implements operaciones{
    @Override
    public double sumar(double x, double y) {
        return x+y;
    }
    @Override
    public double restar(double x, double y) {
        return x-y;
    }
    @Override
    public double multiplicar(double x, double y) {
        return x*y;
    }
    @Override
    public double dividir(double x, double y) {
        return x/y;
    }
}
