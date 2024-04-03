public class Main {
    public static void main(String[] args) {
        //Creación de un objeto de tipo UnbalancedBinarySearchTree
        UnbalancedBinarySearchTree arbol = new UnbalancedBinarySearchTree();

        //Insertando valores al árbol
        arbol.insert(8);
        arbol.insert(9);
        arbol.insert(4);
        arbol.insert(10);
        arbol.insert(12);

        System.out.println("\nImpresion pre-orden");
        arbol.preorderTraversal();
        System.out.println();
        System.out.println("\nImpresion in-orden");
        arbol.inorderTraversal();
        System.out.println();
        System.out.println("\nImpresion post-orden");
        arbol.posorderTraversal();
        System.out.println("\n");
    }
}
