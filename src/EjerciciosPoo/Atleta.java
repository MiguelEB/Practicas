package EjerciciosPoo;

public class Atleta {
    
    private String nombre;
    private int numero;
    private float tiempo;

    public Atleta(String nombre, int numeroAtleta, float tiempoAtleta) {
        this.nombre = nombre;
        this.numero = numeroAtleta;
        this.tiempo = tiempoAtleta;
    }

    public float getTiempoAtleta() {
        return tiempo;
    }
    
    public String mostrarDatos (){
        return "Nombre: "+nombre+"\nNumero de atleta: "+numero+"\nTiempo: "+tiempo+"\n";
    }
    
    
}
