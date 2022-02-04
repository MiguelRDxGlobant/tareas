package topic1.ejercicio3;

public abstract class PerritoDecorator implements PerritoCaliente {

    private PerritoCaliente perrito;

    public PerritoDecorator(PerritoCaliente perrito){
        this.perrito = perrito;
    }

    protected PerritoCaliente getPerrito() {

        return perrito;
        
    }
    
}
