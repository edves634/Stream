package Stream;

import java.util.List;
import java.util.Optional;

public class CountingNumberRows {
    public static void main(String[] args) {
        // Создание списка строк
        List<String> list = List.of("Абрикос", "Вишня", "Ананас", "Слива", "Банан", "Авокадо", "Киви", "Мандарин", "Апельсин");

        Optional<List<String>> optionalList = Optional.of(list);  // оборачиваем список в Optional

        char letter = 'а'; // определение буквы

        optionalList.ifPresentOrElse(
                nonEmptyList -> {
                    long count = list.stream()  // преобразование списка в поток, фильтрация строк и подсчет
                            .filter(x -> x.toLowerCase().startsWith(String.valueOf(letter).toLowerCase()))
                            .count();
                    System.out.println("Количество строк, начинающихся с буквы '" + letter + "': " + count);
                },
                () -> System.out.println("Пустой список"));  // действие, если список пуст
    }
}











