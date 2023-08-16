package org.example;

//public class Main {
//    package org.example;

// Создайте массив из 8 случайных целых чисел из интервала [1;50]
//Выведите массив на консоль в строку.
//Замените каждый элемент с нечетным индексом на ноль.
//Снова выведете массив на консоль в отдельной строке.

//public class Main {
//    public static void main(String[] args) {
//        int[] array = ChangeNum.bigMass(8,1,50);
//        ChangeNum.showArray(array);
//        int[] array2 = ChangeNum.findMass(array);
//        ChangeNum.showArray(array2);
//    }
//}

//Создайте массив из 5 случайных целых чисел из интервала [10;99]
//Выведите его на консоль в строку.
//Определите и выведите на экран сообщение о том, является ли массив
// строго возрастающей последовательностью.

    public class Main {
        public static void main(String[] args) {
            int[] array = ChangeNum.bigMass(5, 10, 99);
            ChangeNum.showArray(array);
            ChangeNum.increasMass(array);
        }
    }
