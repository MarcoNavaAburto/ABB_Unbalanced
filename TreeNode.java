public class TreeNode
{
    private int val;
    private TreeNode left;
    private TreeNode right;

    //Constructor
    public TreeNode(int val)
    {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    //Métodos setter's y getter's
    public TreeNode getLeft()
    {
        return left;
    }

    public TreeNode getRight()
    {
        return right;
    }

    public int getVal()
    {
        return val;
    }

    public void setRight(TreeNode nodo)
    {
        right = nodo;
    }

    public void setLeft(TreeNode nodo)
    {
        left = nodo;
    }

    public void setVal(int valor)
    {
        val = valor;
    }
}