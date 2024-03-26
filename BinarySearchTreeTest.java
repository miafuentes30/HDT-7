import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BinarySearchTreeTest{


    @Test
    public void testInsertAndSearch() {
        BinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        
        // Insertamos algunos elementos y verificamos su inserción y búsqueda
        tree.insert(5, "five");
        tree.insert(3, "three");
        tree.insert(7, "seven");
        
        assertEquals("five", tree.search(5));
        assertEquals("three", tree.search(3));
        assertEquals("seven", tree.search(7));
        
        // Verificamos que no se inserten duplicados
        tree.insert(5, "duplicate");
        
        // Verificamos que un elemento que no está en el árbol devuelva null
        assertNull(tree.search(10));
    }
}
