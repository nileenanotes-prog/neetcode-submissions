class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int i, mid;
        char poped;

        // not bracket pairs
        if ( (s.length())%2 != 0 )
            return false;

        for (i=0; i<s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                stack.push(s.charAt(i));
            else{
                if(stack.empty())
                    return false;

                poped = stack.peek();

                if ( 
                    ( poped == '(' && s.charAt(i) == ')' ) || 
                    ( poped == '{' && s.charAt(i) == '}' ) ||
                    ( poped == '[' && s.charAt(i) == ']' ) 
                ){
                    stack.pop();
                    continue;
                }

                else
                    return false;
            }
        }

        if ( (i==s.length()) && (stack.empty()) )
            return true;
        else
            return false;








        /*
        mid =  (s.length())/2;

        for (i=0; i<mid; i++){
            stack.push(s.charAt(i));
        } 

        for (i=mid; i< s.length(); i++){
            poped = stack.pop();
            if (
                ( poped == '(' && s.charAt(i) == ')' ) || 
                ( poped == '{' && s.charAt(i) == '}' ) ||
                ( poped == '[' && s.charAt(i) == ']' ) 
                )
                continue;
            else
                return false;
                
        } 

        return true;
        */
    }
}
