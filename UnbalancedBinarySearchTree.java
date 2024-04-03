public class UnbalancedBinarySearchTree {
    
    //Atributo
    private TreeNode root;//root es la raíz del árbol

    //Constructor
    public UnbalancedBinarySearchTree() 
    {
        this.root = null;
    }

    // Implementar la inserción de un valor en el árbol
    public void insert(int val) 
    {
        TreeNode nuevo = new TreeNode(val);
	
        // Implementación necesaria
	    insertaRecursivo(nuevo, root);
    }
                    //Nodo que se acaba de crear      Raíz del árbol 
	public void insertaRecursivo(TreeNode nodo_nuevo, TreeNode nodo_actual)
    {

        //Verificar si el nodo actual (raíz) es null y la raiz es null entonces
        //En caso afirmativo poner el nodo nuevo como la raíz
        if(nodo_actual == null)
        {
            root = nodo_nuevo;
        }
        else
        {
            if(nodo_nuevo.getVal() < nodo_actual.getVal())
            {
                if(nodo_actual.getLeft() == null)
                {
                    nodo_actual.setLeft(nodo_nuevo);
                }
                else
                {
                    insertaRecursivo(nodo_nuevo, nodo_actual.getLeft());
                }
            }
            else
            {
                if(nodo_actual.getRight() == null)
                {
                    nodo_actual.setRight(nodo_nuevo);
                }
                else
                {
                    insertaRecursivo(nodo_nuevo, nodo_actual.getRight());
                }
            }
    
        }
        //Si el nodo actual (raíz) es distinto de null
        //Comparar el valor del nodo nuevo con el nodo actual
        //Hay que ver si es hoja (no tiene hijo izquierdo o derecho según el caso) 
            //extra(revisar si el nodo_actual es hoja o no)
        //Si hay espacio (no tiene un hijo izquierdo) se pone el nuevo nodo ahí
        //Si hay espacio (no tiene un hijo derecho) se pone el nuevo nodo ahí
        //Si es menor hago recursividad en el hijo izquierdo para insertar
        //Si es mayor hago recursividad en el hijo derecho para insertar

        //Implementación
        
    }

    // Implementar la eliminación de un valor en el árbol
    public void delete(int val) 
    {
        // Implementación necesaria
    }

    // Implementar la búsqueda de un valor en el árbol
    public boolean search(int val) 
    {
        // Implementación necesaria
        return false;
    }

    // Método para imprimir el árbol en inorden (usando recursividad)
    public void inorderTraversal() 
    {
        impresionInorden(root);
    }

    public void impresionInorden(TreeNode nodo)
    {
        if(nodo == null)
            return;
        else
        {
            impresionInorden(nodo.getLeft());
            System.out.print(nodo.getVal() + " ");
            impresionInorden(nodo.getRight());
        }
    }

    // Método para imprimir el árbol en preorden (usando recursividad)
    public void preorderTraversal()
    {
        impresionPreorden(root);
    }

    public void impresionPreorden(TreeNode nodo)
    {
        if (nodo == null)
            return;
        else 
        {
            
            System.out.print(nodo.getVal() + " ");
            impresionPreorden(nodo.getLeft());
            impresionPreorden(nodo.getRight());
        }
    }

    // Método para imprimir el árbol en postOrden (usando recursividad)
    public void posorderTraversal() 
    {
        impresionPostOrden(root);
    }

    public void impresionPostOrden(TreeNode nodo)
    {
        if(nodo == null)
            return;
        else
        {
            impresionPostOrden(nodo.getLeft());
            impresionPostOrden(nodo.getRight());
            System.out.print(nodo.getVal() + " ");
        }
    }


}
