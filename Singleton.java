package singleton_aleatorio;

public class Singleton {
    // número generado de forma aleatoria
    private int numAleatorio;

    // sumador de número de aciertos
    private int numAciertos;
       
    // contador número de intentos
    private int numIntentos;
      
    // selección numero 1-10
    private int seleccion;
       
    // número más alto de aciertos
    private int puntuacion;
       
    // número máximo de intentos
    private int intentosMax;

    // nombre de la persona que tiene el record
    private String alias;
       
    // número máximo de rondas
    private int rondasPartida;
       
    // ronda actual en la que estamos
    private int rondaActual;

    // instancia
    private static Singleton instance = null;
       
    // Constructor bloqueado con private
    private Singleton() {
    }
    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    public void setNumAleatorio(int numAleatorio) {
        this.numAleatorio = numAleatorio;
    }

    public void setNumAciertos(int numAciertos) {
        this.numAciertos = numAciertos;
    }
    
    public void setNumIntentos(int numIntentos) {
        this.numIntentos = numIntentos;
    }

    public void setSeleccion(int seleccion) {
        this.seleccion = seleccion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    
    public void setIntentosMax(int intentosMax) {
        this.intentosMax = intentosMax;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setRondasPartida(int rondasPartida) {
        this.rondasPartida = rondasPartida;
    }

    public void setRondaActual(int rondaActual) {
        this.rondaActual = rondaActual;
    }

    public int getNumAleatorio() {
        return numAleatorio;
    }

    public int getNumAciertos() {
        return numAciertos;
    }

    public int getNumIntentos() {
        return numIntentos;
    }

    public int getSeleccion() {
        return seleccion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public int getIntentosMax() {
        return intentosMax;
    }

    public String getAlias() {
        return alias;
    }

    public int getRondasPartida() {
        return rondasPartida;
    }

    public int getRondaActual() {
        return rondaActual;
    }
    
    
}
