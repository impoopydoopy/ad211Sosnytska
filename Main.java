import java.util.Scanner;

public class Main {
    public static boolean CheckArray(int[] array, int size) //метод для проверки на соответствие условию
    {
        for(int i = 0; i < (size-1); i++)
        {
            int sumFirst = 0, sumSecond = 0;
            for(int j = 0; j <= i; j++) sumFirst += array[j]; //считаем суммы чисел
            for(int j = i+1; j < size; j++) sumSecond += array[j];

            if(sumFirst == sumSecond) return true; //если равны возвращаем истину и выходим из метода
        }
        return false; //если нет
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); //создаем объект сканнера
        int size;

        System.out.println("Введите длинну массива: (больше или равно 2)");
        do{
            size = in.nextInt(); //in.nextInt() возвращает введенное с клавиатуры целочисленное значение
        }while(size < 2);

        int[] array = new int[size];

        for(int i = 0; i < size; i++) //ввод чисел в массив
        {
            System.out.printf("Введите %d элемент массива: ", i);
            array[i] = in.nextInt();
        }

        for (int i = 0; i < size; i++) //вывод массива
        {
            System.out.println(array[i]);
        }

        System.out.println(CheckArray(array, size)); //вызываем метод для проверки и передаем параметром массив и его размер
    }
}