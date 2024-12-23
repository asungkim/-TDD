public class Calc {
    public static int run(String s) {

        // 3 + 5 -> 3+5
        s=s.replace(" ","");
        return execute(s);
    }

    private static int execute(String s) {
        if (s.startsWith("(")&&s.endsWith(")")) {
            return run(s.substring(1,s.length()-1));
        }

        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if (c=='+'||c=='-'||c=='*'||c=='/') {
                int left=Integer.parseInt(s.substring(0,i));
                int right=Integer.parseInt(s.substring(i+1));
                return calculate(left,right,c);
            }
        }

        return Integer.parseInt(s);
    }

    private static int calculate(int left, int right, char operator) {
        int an=0;
        switch (operator) {
            case '+': an=left+right; break;
            case '-': an=left-right; break;
            case '*': an=left*right; break;
            case '/': an=left/right; break;
            default: break;
        }

        return an;
    }

}
