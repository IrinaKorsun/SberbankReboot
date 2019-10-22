package sharoyko.task_01;

public class Task_02_RandArray {

    public static void main(String[] args) {
        //инициализируем переменную массива на 10 ячеек
        double arr [];
        arr = new double [10];
        //заполняем массим случайными числами от 0 до 1
        for (int i = 0; i<10; i++)
        {
            arr[i]=Math.random();
            System.out.println(arr[i]);
        }
        ////находим минимальное значение
        //для этого инициализируем переменную для минимального значения min и погружаем в него первое значение массива
        double min=arr[0];
        //сравниваем весь массив с min, если меньше, вписываем такое значение в min
        for (int i = 1; i<9; i++)
        {
            if (min > arr[i]) min =arr[i];
        }
        //выводим минимальное значение в консоль
        System.out.println("Минимальное число: " + min);

        ////находим максимальное значение
        //для этого инициализируем переменную для максимальное значения max и погружаем в него первое значение массива
        double max=arr[0];
        //сравниваем весь массив с max, если больше, вписываем такое значение в max
        for (int i = 1; i<9; i++)
        {
            if (max < arr[i]) max =arr[i];
        }
        //выводим максимальное значение в консоль
        System.out.println("Максимальное число: " + max);

        ////находим среднее значение
        //для этого инициализируем переменную для среднего значения
        double mid=0;
        //складываем весь массив
        for (int i = 0; i<10; i++)
        {
            mid += arr[i];
        }
        //делим полученную сумму чисел массива на длинну массива
        mid=mid/10;
        //выводим среднее значение в консоль
        System.out.println("Среднее значение: " + mid);
    }

}
