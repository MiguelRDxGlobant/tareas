package topic1.ejercicio3;

public class main {

    public static void main(String[] args) {
 
        PerritoCaliente perroFull = new Tocino(new Papitas(new Salsas(new PerritoBasico("Perrito"))));
        perroFull.ponerPan();
        perroFull.ponerSalchicha();

        PerritoCaliente perroConSalsaYPapas = new Papitas(new Salsas(new PerritoBasico("Perrito")));
        perroConSalsaYPapas.ponerPan();
        perroConSalsaYPapas.ponerSalchicha();
    }
    
}
