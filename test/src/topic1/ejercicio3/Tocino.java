package topic1.ejercicio3;

public class Tocino extends PerritoDecorator {

    public Tocino(PerritoCaliente perrito){
        super(perrito);

    }

    @Override
    public void ponerPan() {
        getPerrito().ponerPan();
        System.out.println("Poniendo tocino en el pan");
    }

    @Override
    public void ponerSalchicha() {
        getPerrito().ponerSalchicha();
        System.out.println("Poniendo tocinos sobre la salchicha");
    }
    
}
