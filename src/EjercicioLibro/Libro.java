
package EjercicioLibro;


public class Libro {
    
    private String titulo;
    private int numPaginas;
    private float calificacion;
              
    //Asociacion con cardinalidad 1
    private Autor autor;

    public Libro(String titulo, int numPaginas, float calificacion) { //se pone autor dependiendo de la informacion que tenga
        this.titulo = titulo;
        this.numPaginas = numPaginas;
        this.calificacion = calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    
    
    
}
