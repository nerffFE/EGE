package Task5;

// Задача на системы счисления
// Условие: 
// На вход алгоритма подается натуральное число N, оно обрабатывается следующим образом:
// 1. Строится восьмеричная запись этого числа.
// 2. У него удаляются все чётные цифры.
// 3. Полученное число переводится в десятичную систему счисления.
// Какое число получится, если подать на вход число 115?

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
