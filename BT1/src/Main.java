import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 1. Tạo danh sách số nguyên
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        );

        // 2. In danh sách số nguyên
        System.out.println("Danh sách số nguyên: " + numbers);

        // 3. Sử dụng Lambda Expression để in số chẵn
        System.out.println("\nCác số chẵn trong danh sách:");

        numbers.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });

        // 4. Sử dụng Lambda Expression để tính tổng
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("\nTổng các số trong danh sách: " + sum);
    }
}