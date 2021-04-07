package challenges.stackandqueues;

public class MainFile {


    public MainFile() {
    }

    public boolean multiBracketValidation(String input) throws Exception {
        Stack recent = new Stack();
        char openS = '[';
        char openP = '(';
        char openC = '{';
        char closeS = ']';


//        {fdlf}()[]
        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == '[' || input.charAt(i) == '{' || input.charAt(i) == '('){
                if (recent.isEmpty() == true){
                    recent.push(input.charAt(i));
                } else if (input.charAt(i) == (char) recent.peek()) recent.push(input.charAt(i));
                    else return false;
            } else if (input.charAt(i) == ']' || input.charAt(i) == '}' || input.charAt(i) == ')'){
                if (recent.isEmpty() == true) return false;
                else if (input.charAt(i) == ']' && (char) recent.peek() == '[') recent.pop();
                    else if (input.charAt(i) == '}' && (char) recent.peek() == '{') recent.pop();
                        else if (input.charAt(i) == ')' && (char) recent.peek() == '(') recent.pop();
                            else return false;
            }

        }

        return true;
    }
}
