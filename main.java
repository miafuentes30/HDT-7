/**
 * Universidad del Valle de Guatemala
* @author Mia Fuentes - 23775
 * @description clase principal, que maneja todos los datos
 * @date creación 12/03/2023 última modificación 19/03/2023
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {

    public static void main(String[] args) {

        BinarySearchTree<String, String> arbolTraduccion = new BinarySearchTree<>();
        arbolTraduccion.insert("The", "La");
        arbolTraduccion.insert("woman", "mujer");
        arbolTraduccion.insert("me", "me");
        arbolTraduccion.insert("asked", "preguntó");
        arbolTraduccion.insert("to", "si");
        arbolTraduccion.insert("do", "hice");
        arbolTraduccion.insert("my", "mi");
        arbolTraduccion.insert("homework", "tarea");
        arbolTraduccion.insert("homework", "tarea");
        arbolTraduccion.insert("about", "acerca");
        arbolTraduccion.insert("town", "ciudad");

        Translator traductor = new Translator(arbolTraduccion);

        try (BufferedReader br = new BufferedReader(new FileReader("text.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String lineaTraducida = traductor.traducirOracion(linea);
                System.out.println(lineaTraducida);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

