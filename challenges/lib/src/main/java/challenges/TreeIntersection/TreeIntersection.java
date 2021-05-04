package challenges.TreeIntersection;

import challenges.tree.BinaryTree;
import challenges.tree.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TreeIntersection {

    public static int [] treeIntersection(BinaryTree input1, BinaryTree input2){
        if(input1.root == null || input2.root == null) return null;
        HashMap out = new HashMap();
        ArrayList<Integer> list = new ArrayList<>();
        preOrder(input1.root, out, list);
        preOrder(input2.root, out, list);

        int [] output = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
        output[i] = list.get(i);

        }


        return output;
    }

    public static void preOrder (Node node, HashMap hm, ArrayList list){
        if (node == null) return;
        if (hm.get(node.val) != null){
            list.add(node.val);
        } else hm.put(node.val, 1);

        preOrder(node.left, hm, list);
        preOrder(node.right, hm, list);

    }



}
