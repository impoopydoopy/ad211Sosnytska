public class Main {
    public static void main(String[] args) {

        int[] array = {2, 7, 9, 8}; //массив с изначальными данными
        boolean meetsCondition = true; //флаг совпадает ли массив с условием

        for (int i = 0; i < array.length; i++) //вывод массива
        {
            System.out.println(array[i]);
        }

        for (int i = 1; i < array.length; i++) //проверка на совпадение с условием
        {
            if (array[i] < array[i - 1]) { //сравниваем все элементы
                meetsCondition = false;
                break;
            }
        }

        if (meetsCondition) System.out.println("true"); //вывод результата
        else System.out.println("false");
    }
}
