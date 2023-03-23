package comands;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public interface add_element {
    static void add_element(Scanner sc){
        System.out.print("Введите индекс добавляемого элемента: ");
        int index = sc.nextInt();
        sc.nextLine();

        long id = (long) (Math.random() * 100);

        System.out.print("Введите имя добавляемого элемента: ");
        String name = sc.nextLine();
        sc.nextLine();

        System.out.print("Введите координату X добавляемого элемента: ");
        int x = sc.nextInt();
        sc.nextLine();

        System.out.print("Введите координату Y добавляемого элемента: ");
        int y = sc.nextInt();
        sc.nextLine();

    }
}
