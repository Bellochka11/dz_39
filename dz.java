import java.util.*;
// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее ариф. значение
public class dz {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // 1) Удаление четных чисел
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(list);

        // 2) Минимальное значение
        int min = Collections.min(list);
        System.out.println("Минимальное значение: " + min);

        // 3) Максимальное значение
        int max = Collections.max(list);
        System.out.println("Максимальное значение: " + max);

        // 4) Среднее арифметическое значение
        double average = 0;
        for (int num : list) {
            average += num;
        }
        average = average / list.size();
        System.out.println("Среднее арифметическое значение: " + average);
    }
}