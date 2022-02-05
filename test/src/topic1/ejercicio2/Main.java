package topic1.ejercicio2;

public class Main {

    public static void main(String[] args) {
        
        Suscriptor suscriptor1 = new Suscriptor("Juan");

        Suscriptor suscriptor2 = new Suscriptor("Gabriel");

        Suscriptor suscriptor3 = new Suscriptor("Hector");

        Suscriptor suscriptor4 = new Suscriptor("Ana");

        Suscriptor suscriptor5 = new Suscriptor("Sara");

        Producto celular = new Producto("Huawei", 399.99);

        celular.enlazarObservador(suscriptor1);

        celular.enlazarObservador(suscriptor2);

        celular.enlazarObservador(suscriptor3);

        celular.enlazarObservador(suscriptor4);

        celular.notificarDesuscription(suscriptor4);

        
        celular.Suscribirse();
        
        celular.actPrecio();
        
        celular.Desuscribirse();
    }
    
}
