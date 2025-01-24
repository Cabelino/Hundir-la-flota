import java.util.ArrayList;

public class Jugador {
    String nombre;
    int barcosRestantes = 22;
    ArrayList<Integer> matriz = new ArrayList();

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBarcosRestantes() {
        return barcosRestantes;
    }

    public void setBarcosRestantes(int barcosRestantes) {
        this.barcosRestantes = barcosRestantes;
    }

    public ArrayList<Integer> getMatriz() {
        return matriz;
    }

    public void setMatriz(ArrayList<Integer> matriz) {
        this.matriz = matriz;
    }
}
