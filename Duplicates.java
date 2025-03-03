package Stream;

import java.util.List;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 3, 6, 3, 10, 1, 36, 55, 12, 36);  //создаем список целых чисел

        System.out.println(nums);

        List<Integer> searchDuplicates = nums.stream().distinct().collect(Collectors.toList()); //создаем поток и удаляем дубли с помощью метода distinct
        System.out.println(searchDuplicates);
    }
}














