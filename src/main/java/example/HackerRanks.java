package example;

import java.util.*;

public class HackerRanks {

    Stack games = new Stack();

    static boolean isOpen(char c) {
        if (c == '{' || c == '[' || c == '(') {
            return true;
        }
        return false;
    }

    static boolean isClosed(char c) {
        if (c == ']' || c == '}' || c == ')') {
            return true;
        }
        return false;
    }

    static boolean matchingPair(char close, char open) {
        HashMap<Character, Character> pairs = new HashMap<>();
        boolean res = false;
        pairs.put(']', '[');
        pairs.put('}', '{');
        pairs.put(')', '(');
        if (pairs.get(close).equals(open)) {
            res = true;
        }
        return res;
    }

    static Boolean isBalanced(String pattern) {
        Stack<Character> openingSt = new Stack();
        // [ , (, { are open ones
        // ] , ) ,} are closed ones

        /* the logic is to check from the left hand side I expect to see the opening pair first in any patter {} or  {{}}
        when I see the closing pair
        1-HAS TO MATCH THE MOST RECENT OPENING PAIR  If not
             it considered not balance
        OR 2- I SEE THE CLOSING PAIR FIRST WITHOUT OPENING ONE
         */
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (isOpen(c)) {
                openingSt.add((Character) c);
            } else if (isClosed(c)) {
                // check the peek if yes , pop
                // the pattern is finished but there
                try
                {
                    char c2=openingSt.peek();
                    if (matchingPair(c,c2 )) {
                        openingSt.pop();
                    } else {
                        return Boolean.FALSE;
                    }
                    // else return FALSE
                }catch (EmptyStackException e)
                {
                    return Boolean.FALSE;
                }


            }
        }

// if pattern is finished with open but there is no close so check the stack is empty in case of balance pattern
        if(!openingSt.isEmpty())
        {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lines = new ArrayList<>();
        List<Boolean> results = new ArrayList<>();

        while (sc.hasNext()) {
            String input = sc.next();
            if (input.contains("END")) break;
            //Complete the code
            lines.add(input);

        }

        for (String l : lines) {
            results.add(isBalanced(l));
        }
        for (Boolean result : results) {
            System.out.println(result.toString());
        }


    }


}
