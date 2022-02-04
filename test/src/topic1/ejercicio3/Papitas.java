package topic1.ejercicio3;

public class Papitas extends PerritoDecorator {

    public Papitas(PerritoCaliente perrito){
        super(perrito);

    }

    @Override
    public void ponerPan() {
        getPerrito().ponerPan();
        System.out.println("Poniendo papitas al pan");
    }

    @Override
    public void ponerSalchicha() {
        getPerrito().ponerSalchicha();
        System.out.println("Poniendo papitas sobre la salchicha");
    }
    
}