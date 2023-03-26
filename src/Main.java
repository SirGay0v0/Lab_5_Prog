import comands.*;
import vehicle_types_coordinates.*;

import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Vector<Vehicle> vector = new Vector<>();
        Scanner sc = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println();
            System.out.print("Напишите команду: ");
            String choose = sc.nextLine();
            switch (choose) {
                case "help" -> help.help();
                case "info" -> info.info(vector, date);
                case "show" -> show.show(vector);
                case "add" -> {
                    Vehicle vehicle = new Vehicle();
                    add.add(sc, vehicle, vector);
                }
                case "update id" -> {
                }
                case "remove_by_id" -> {
                    System.out.print("Введите порядковый номер элемента,  : ");
                    int rmvid = sc.nextInt();
                    sc.nextLine();
                    for (Vehicle v : vector) {
                        if (v.getId() == rmvid) {
                            vector.remove(v);
                            break;
                        }
                    }
                }
                case "clear" -> vector.removeAllElements();
//                case "save" ->;
//                case "execute_script"
                case "exit" -> work = false;
                case "remove_lower" -> {
                    System.out.print("Введите индекс элемента, чтобы удалить все элементы, меньшие, чем заданный индекс: ");
                    int i = Integer.parseInt(sc.nextLine());
                    for (i--; i >= 0; i--) {
                        vector.remove(i);
                    }
                }
                case "reorder", "sort" -> {
                    ArrayList<Vehicle> myArray = new ArrayList<>();
                    int num = vector.size() - 1;
                    int i = 0;
                    for (; num > -1; num--) {
                        myArray.add(i, vector.get(num));
                        i++;
                    }
                    vector.removeAllElements();
                    vector.addAll(myArray);
                }
                case "max_by_creation_date" -> {
                    LocalDateTime lastDate = null;
                    for (int i = 0; i < vector.size() - 1; i++) {
                        if (vector.get(i).getCreationDate().isAfter(vector.get(i + 1).getCreationDate())) {
                            lastDate = vector.get(i).getCreationDate();
                        } else {
                            lastDate = vector.get(i + 1).getCreationDate();
                        }
                    }
                    System.out.println("Крайний элемент был создан в " + lastDate);
                }

                case "filter_by_number_of_wheels" -> {
                    System.out.print("Введите количество колес: ");
                    int wheels = sc.nextInt();
                    for (Vehicle veh : vector) {
                        if (veh.getNumberOfWheels() == wheels) {
                            System.out.println(veh.toString());
                        }
                    }
                }
                case "print_field_descending_capacity" -> {
                    ArrayList<Vehicle> myArray = new ArrayList<>(vector);

                    for (Vehicle vehicle : myArray) {
                        System.out.println(vehicle.toString());
                    }
                }
            }
        }
    }
}