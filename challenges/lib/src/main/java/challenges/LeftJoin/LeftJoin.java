package challenges.LeftJoin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class LeftJoin {


    public static List <List<String>> leftJoin (HashMap left, HashMap right){
        if (left.isEmpty() ) return null;
        List <List<String>> output = new ArrayList<>();
        Set <String> leftSet =left.keySet();
        int counter = 0;
        for (String s : leftSet){
            System.out.println("here");
        output.add(new ArrayList<String>());
        output.get(counter).add(s);
        output.get(counter).add(left.get(s).toString());
        counter ++;
        }
        Set <String> rightSet =right.keySet();
        for (String s : rightSet){
            for (int i = 0; i < output.size(); i++) {
                if (output.get(i).get(0).equals(s)) output.get(i).add(right.get(s).toString());
            }

        }
        return output;
    }

}
