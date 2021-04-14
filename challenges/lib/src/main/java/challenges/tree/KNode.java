package challenges.tree;

import java.util.ArrayList;

public class KNode <T>{
    T val;
    int kChildren;
    ArrayList <KNode> kids;

    public KNode (){}
    public KNode(T val, int kChildren) {
        this.val = val;
        for (int i = 0; i < kChildren; i++) {

            kids.add(new KNode());
        }
    }
}