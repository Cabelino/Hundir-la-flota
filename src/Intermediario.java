public class Intermediario {
    Jugador jugador1;
    Jugador jugador2;
    boolean victoria = false;

    // Constructor
    public Intermediario(Jugador jugador1, Jugador jugador2, boolean victoria) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.victoria = victoria;
    }

    // Getters y Setters
    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    public boolean isVictoria() {
        return victoria;
    }

    public void setVictoria(boolean victoria) {
        this.victoria = victoria;
    }

    // Funciones

    
}
