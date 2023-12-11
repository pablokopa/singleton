package singleton_aleatorio;

public class Singleton_aleatorio {
    public static void main(String[] args) {
        // creamos un objeto
        Singleton miInstancia = Singleton.getInstance();
        
        miInstancia.setAlias("Pablo");
        miInstancia.setIntentosMax(2);
        miInstancia.setNumAciertos(0);
        miInstancia.setNumIntentos(0);
        miInstancia.setPuntuacion(0);
        miInstancia.setRondaActual(0);
        miInstancia.setRondasPartida(10);
        miInstancia.setSeleccion(0);
    }  
}
