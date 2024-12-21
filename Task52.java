package Task5;


public class Task52 {
    public static void main(String[] args) {
        System.out.println(F1(115));
    }

    private static int F1(int N) {
       String s = Integer.toOctalString(N);
       String doomy = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) % 2 != 0)
                doomy += s.charAt(i);
        }
        return Integer.parseInt(doomy,8);
    }
}
