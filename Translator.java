/**
 * clase que funciona como traductor de palabras
 */
public class Translator {

    private BinarySearchTree<String, String> arbolTraduccion;

    public Translator(BinarySearchTree<String, String> arbolTraduccion) {
        this.arbolTraduccion = arbolTraduccion;
    }

    public String traducirOracion(String oracion) {
        StringBuilder resultado = new StringBuilder();
        String[] palabras = oracion.split("\\s+"); 

        for (String palabra : palabras) {
            String traduccion = arbolTraduccion.search(palabra); 
            if (traduccion != null) {
                resultado.append("*").append(traduccion).append("*").append(" "); 
            } else {
                resultado.append(palabra).append(" ");
            }
        }

        return resultado.toString().trim(); 
    }
}
