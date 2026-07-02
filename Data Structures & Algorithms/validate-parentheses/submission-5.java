class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                if (!st.isEmpty()) {
                    char chr = st.peek();
                    if ((ch == ')' && chr == '(') || (ch == '}' && chr == '{')
                        || (ch == ']' && chr == '[')) {
                        st.pop();
                    } else {
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }

        if (st.isEmpty())
            return true;

        return false;
    }
}
