package Task5;

public class Tsk51 {
    // Задача на системы счисления
    // Условие: 
    // На вход алгоритма подается натуральное число N, оно обрабатывается следующим образом:
    // 1. Строится пятеричная запись этого числа.
    // 2. Цифры числа записываются в обратном порядке.
    // 3. Полученное число переводится в десятичную систему счисления.
    // Какое число было передано, если получилось число 61?
    // Если ответов несколько, нужно выбрать наименьший из них.
    
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
