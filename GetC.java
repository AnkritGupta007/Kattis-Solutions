import java.util.Scanner;

public class getC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BST tree = new BST();
        
        for (int i = 0; i < n; i++) {
            tree.insert(sc.nextInt());
            System.out.println(tree.C);
        }
    }
}

class BST {
    public int C;
    public static Node root;
	
    public BST() {
		C = 0;
		root = null;
	}
    
    public void insert(int x) {
		Node temp = new Node(x);
		if (root == null) {
			root = temp;
			return;
		}
		Node current = root;
		Node parent = null;
		
		while (true) {
			parent = current;
			
			if (temp.value < current.value) 
			{
				current = current.left;
				C++;
				if (current == null) {
					parent.left = temp;
					return;
				}
			} 
			else 
			{
				current = current.right;
				C++;
				if (current == null) {
					parent.right = temp;
					return;
				}
			}
		}
	}
	
	
	public int C() {
	    return C;
	}
}

class Node {
	int value;
	Node left;
	Node right;
	
	public Node(int a) {
		this.value = a;
		left = null;
		right = null;
	}
}
