package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class secondLargest {
    public static void main(String[] args) {

        List<Integer> element = Arrays.asList(90, 25, 300, 42, 500, 123, 65, 80); // создаем список
        System.out.println(element);

        Optional<Integer> secondLargest = element.stream() // оборачиваем список в Optional
                .distinct()  // убираем дубликаты
                .sorted(Comparator.reverseOrder()) // сортируем в обратном порядке
                .skip(1) // пропускаем первый элемент (после обратной сортировке он стоит первым)
                .findFirst(); // находим первый элемент после пропуска
        secondLargest.ifPresentOrElse(  //обработка значений, которые могут отсутствовать (null)
                value -> System.out.println("Второй по величине элемент: " + value),
                () -> System.out.println("Второй по величине элемент не найден"));
    }
}








