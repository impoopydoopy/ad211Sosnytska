public class Main {
    public static void main(String[] args)
    {
        int min = 1, max = 101; //переменные мин и макс для определения границ цикла
        for(int i = min; i < max; i++)
        {
            if(i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz"); //проверяем на кратность по отстатку от деления
            else if(i % 3 == 0) System.out.println("Fizz");
            else if(i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i); //если не выполняется ни одно условие просто выводим число
        }
    }
}