
public class BinarySearchTree<K extends Comparable<K>, V> {
    Node<K, V> root;

    
    public void insert(K key, V value) {
        root = insertRecursive(root, key, value);
    }

    private Node<K, V> insertRecursive(Node<K, V> current, K key, V value) {
        if (current == null) {
            return new Node<>(key, value);
        }

        if (key.compareTo(current.key) < 0) {
            current.left = insertRecursive(current.left, key, value);
        } else if (key.compareTo(current.key) > 0) {
            current.right = insertRecursive(current.right, key, value);
        } else {
            current.value = value; 
        }

        return current;
    }

    /**
     * Busca el valor del arbol
     *
     * @param key la clave.
     * @return el valor asociado sino regresa null.
     */
    public V search(K key) {
        return searchRecursive(root, key);
    }

    private V searchRecursive(Node<K, V> current, K key) {
        if (current == null) {
            return null; 
        }

        if (key.compareTo(current.key) < 0) {
            return searchRecursive(current.left, key); 
        } else if (key.compareTo(current.key) > 0) {
            return searchRecursive(current.right, key); 
        } else {
            return current.value; 
        }
    }
}