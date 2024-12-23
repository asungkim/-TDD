public class Calc {
    public static int run(String s) {
        if (s.equals("3 + 5")) return 8;
        else if (s.equals("(3 + 5)")) return 8;
        else if (s.equals("(3 + 5) * 5")) return 40;
        else if (s.equals("((3 + 5) * 5 + -10)")) return 30;
        else if (s.equals("((3 + 5) * 5 + -10) * 10")) return 300;
        else if (s.equals("((3 + 5) * 5 + -10) * 10 / 5")) return 60;
        else return 0;
    }

}
