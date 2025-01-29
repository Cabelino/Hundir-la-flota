import java.util.ArrayList;

public class Jugador {

    String nombre;
    int barcosDestruidos = 0;
    ArrayList<ArrayList<Integer>> campoContrario;
    ArrayList<ArrayList<Integer>> campoPropio;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBarcosDestruidos() {
        return barcosDestruidos;
    }

    public void setBarcosDestruidos(int barcosDestruidos) {
        this.barcosDestruidos = barcosDestruidos;
    }

    public ArrayList<ArrayList<Integer>> getCampoContrario() {
        return campoContrario;
    }

    public void setCampoContrario(ArrayList<ArrayList<Integer>> campoContrario) {
        this.campoContrario = campoContrario;
    }

    public ArrayList<ArrayList<Integer>> getCampoPropio() {
        return campoPropio;
    }

    public void setCampoPropio(ArrayList<ArrayList<Integer>> campoPropio) {
        this.campoPropio = campoPropio;
    }
}
