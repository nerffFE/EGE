package Task5;

public class Tsk51 {
    //https://education.yandex.ru/ege/task/2e09b9f5-1927-41a3-8963-2ea21f82a52b
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            if (F(i) == 61)
                System.out.println(i);
        }
    }

    private static int F(int N) {
        String s = Integer.toString(N,5);
        s = new StringBuilder(s).reverse().toString();
        return Integer.parseInt(s,5);
    }
}
