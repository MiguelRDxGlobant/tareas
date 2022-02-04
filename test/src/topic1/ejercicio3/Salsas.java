package topic1.ejercicio3;

public class Salsas extends PerritoDecorator {

    public Salsas(PerritoCaliente perrito){
        super(perrito);

    }

    @Override
    public void ponerPan() {
        getPerrito().ponerPan();
        System.out.println("Poniendo salsa al pan");
    }

    @Override
    public void ponerSalchicha() {
        getPerrito().ponerSalchicha();
        System.out.println("Poniendo salsa a la salchicha");
    }
    
}
