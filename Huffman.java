import java.util.*;

class HuffmanNode {
    int data;
    char c;
    HuffmanNode left;
    HuffmanNode right;
}

class MyComparator implements Comparator<HuffmanNode> {
    public int compare(HuffmanNode x, HuffmanNode y){
        return x.data - y.data;
    }
}
 
public class Huffman {
    public static void printCode(HuffmanNode root, String s)
    {
        if (root.left == null && root.right== null && Character.isLetter(root.c)) {
            return;
        }
 
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }
 
    public static void main(String[] args)
    {
 
        Scanner s = new Scanner(System.in);
        int n = 6;
        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int[] charfreq = { 5, 9, 12, 13, 16, 45 };
 
        PriorityQueue<HuffmanNode> q = new PriorityQueue<HuffmanNode>(n, new MyComparator());
 
        for (int i = 0; i < n; i++) {
 
            HuffmanNode hn = new HuffmanNode();
 
            hn.c = charArray[i];
            hn.data = charfreq[i];
 
            hn.left = null;
            hn.right = null;
 
            // add functions adds
            // the huffman node to the queue.
            q.add(hn);
        }
 
        // create a root node
        HuffmanNode root = null;
 
        while (q.size() > 1) {
 
            // first min extract.
            HuffmanNode x = q.peek();
            q.poll();
 
            // second min extract.
            HuffmanNode y = q.peek();
            q.poll();
 
            // new node f which is equal
            HuffmanNode f = new HuffmanNode();
 
            // to the sum of the frequency of the two nodes
            // assigning values to the f node.
            f.data = x.data + y.data;
            f.c = '-';
 
            // first extracted node as left child.
            f.left = x;
 
            // second extracted node as the right child.
            f.right = y;
 
            // marking the f node as the root node.
            root = f;
 
            // add this node to the priority-queue.
            q.add(f);
        }
 
        printCode(root, "");
    }
}
