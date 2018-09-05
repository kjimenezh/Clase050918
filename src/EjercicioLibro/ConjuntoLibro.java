
package EjercicioLibro;

public class ConjuntoLibro {
    
    //Asociacion cardinalidad 10 (tamaño maximo conocido)
    
    private Libro[] libros;

    public ConjuntoLibro() {
        
        //Liberando la memoria maxima (es como si tuviera 10 espacios de memoria todos con null)
        this.libros=new Libro[10];
    }
    
    public boolean anadirLibro(Libro libro){    
        for(int i=0; i<this.libros.length;i++){ //this.libros.length calcula el tamaño del arreglo
            if (this.libros[i]==null){
                this.libros[i]=libro;
                return true;
            }
        }
    return false;
    }
    //Solo mostrar datos en el main
    public boolean eliminarLibroxTitulo(String titulo){    
        for(int i=0; i<this.libros.length;i++){ 
            if (this.libros[i]!=null && this.libros[i].getTitulo().equals(titulo)){ //equals es para comprar String
                this.libros[i]=null;
                return true;
            }
        }
    return false;
    }
    
    public boolean eliminarLibroxAutor(String autor){    
        for(int i=0; i<this.libros.length;i++){ 
            if (this.libros[i].getAutor().equals(autor)){ //equals es para comprar String
                this.libros[i]=null;
                return true;
            }
        }
    return false;
    }
    
    public Libro buscarMejorCalificado(){
        Libro mejor=null;
            for(int i=0; i<this.libros.length;i++){ 
                if (i==0 && this.libros[i]!=null) mejor=this.libros[i];
                else{
                    if (this.libros[i]!=null && this.libros[i].getCalificacion()>mejor.getCalificado){
                        mejor=this.libros[i];
                    }
                }
            }
            return mejor;
    }
    
    public Libro buscarMenorCalificado(){
        Libro menor=null;
            for(int i=0; i<this.libros.length;i++){ 
                if (i==0) menor=this.libros[i];
                else{
                    if (this.libros[i].getCalificacion()<menor.getCalificado){
                        menor=this.libros[i];
                    }
                }
            }
            return menor;
    }

    public Libro[] getLibros() {
        return this.libros;
    }
    
}