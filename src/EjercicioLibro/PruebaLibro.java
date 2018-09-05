
package EjercicioLibro;


public class PruebaLibro {
    
    public static void main(String[] args){
        //Relacion de Dependencia
        ConjuntoLibro biblioteca=new ConjuntoLibro();
        
        //Dependencia
        Autor autor=new Autor ("Gabriel","Garcia");
        
        Libro libro=new Libro("Cien ", 300, 8);
        
        libro.setAutor(autor);
        boolean resultado=biblioteca.anadirLibro(libro);
        if(resultado==true){
            System.out.println("Insercion satisfactoria");
        }else{
            System.out.println("Problemas para insertar el libro");
        }
    }
    //...
}
