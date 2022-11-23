import java.util.Arrays;
import java.util.Scanner;

public class mass {
    public void first(){
        System.out.println("Введите размер массива: ");
        Scanner num = new Scanner(System.in);
        int size = num.nextInt();
        int[] array = new int[size];
        System.out.println("Введите числа для сортировки: ");
        for (int i = 0; i < size; i++) {
            array[i] = num.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("");

    }
    public void second(){
        System.out.println("Введите что-то для подсчёта: ");
        Scanner sentence = new Scanner(System.in);
        while (true) {
            String str = sentence.nextLine();
            int[] counters = new int[(int) Character.MAX_VALUE];
            for (char c : str.toCharArray()) {
                counters[(int) c]++;
            }
            for (int i = 0; i < counters.length; ++i) {
                if (counters[i] > 0)
                    System.out.println((char) i + "\t" + counters[i]);
            }
            break;
        }
        System.out.println("");
    }
    public void third(){
        System.out.println("Выводим числовой массив где каждой букве соответствует число – номер буквы в алфавите: ");
        String[] str = {"а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й", "к", "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф", "х", "ц", "ч", "ш", "щ", "ъ", "ы", "ь", "э", "ю", "я"};
        int[] arrayNum = new int[33];
        for (int i = 0; i < str.length; i++) {
            arrayNum[i] = i + 1;
        }
        System.out.println(Arrays.toString(arrayNum));
        System.out.println("");
    }
    public void fourth(){
        System.out.println("Введите слова:");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String[] wordsArray = word.split(" ");
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        for (int i = 0; i < wordsArray.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (wordsArray[i].contains(numbers[j])) {
                    System.out.println(wordsArray[i]);
                    break;
                }
            }
        }
        System.out.println("");
    }
}
