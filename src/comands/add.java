package comands;

import vehicle_types_coordinates.*;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Vector;

public interface add {
    static void add(Scanner sc, Vehicle newVehicle, Vector<Vehicle> vector) {

        long id = (long) (Math.random() * 1000);
        newVehicle.setId(id);


        System.out.print("Введите имя добавляемого элемента: ");
        String name = sc.nextLine();
        newVehicle.setName(name, sc);


        System.out.print("Введите координату X добавляемого элемента: ");
        long x = sc.nextInt();
        sc.nextLine();
        System.out.print("Введите координату Y добавляемого элемента: ");
        long y = sc.nextInt();
        newVehicle.setCoordinates(new Coordinates(x, y));

        LocalDateTime creationDate = LocalDateTime.now();
        newVehicle.setCreationDate(creationDate);


        System.out.print("Введите мощность добавляемого элемента: ");
        long engine = sc.nextLong();
        sc.nextLine();
        newVehicle.setEnginePower(engine, sc);


        System.out.print("Введите кол-во колес у добавляемого элемента: ");
        long wheels = sc.nextLong();
        sc.nextLine();
        newVehicle.setNumberOfWheels(wheels, sc);


        System.out.print("Введите вместимость добавляемого элемента: ");
        long capacity = sc.nextLong();
        sc.nextLine();
        newVehicle.setCapacity(capacity, sc);


        System.out.print("Выберите тип добавляемого элемента(CAR, HELICOPTER, SUBMARINE, BOAT): ");
        String choice = sc.nextLine();
        switch (choice) {
            case "CAR" -> newVehicle.setType(VehicleType.CAR);
            case "HELICOPTER" -> newVehicle.setType(VehicleType.HELICOPTER);
            case "SUBMARINE" -> newVehicle.setType(VehicleType.SUBMARINE);
            case "BOAT" -> newVehicle.setType(VehicleType.BOAT);
        }
        vector.add(newVehicle);
    }
}
