import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BinaryTreeTESTS {

    @Test
    public void testSearch() {
        //Crea claves
        BinarySearchTree<String, String> tree = new BinarySearchTree<>();
        tree.insert("Llave1", "palabra1");
        tree.insert("Llave2", "palabra2");
        tree.insert("Llave3", "palabra3");

    
        assertEquals("palabra1", tree.search("Llave1")); 
        assertEquals("palabra2", tree.search("Llave2")); 
        assertEquals("palabra3", tree.search("Lave3")); 
        assertNull(tree.search("claveInexistente")); 
    }
}

