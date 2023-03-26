package comands;

import vehicle_types_coordinates.Vehicle;

import java.util.Scanner;
import java.util.Vector;

public interface remove_by_id {
    static void remove(Vector vector, Scanner sc) {
        Vehicle vehicle;
        System.out.print("Введите id элемента, который хотите удалить: ");
        int rmvid = sc.nextInt();
        sc.nextLine();

    }
}
