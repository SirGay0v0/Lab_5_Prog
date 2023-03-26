package vehicle_types_coordinates;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vehicle {

    private long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private long enginePower; //Значение поля должно быть больше 0
    private long numberOfWheels; //Значение поля должно быть больше 0
    private float capacity; //Значение поля должно быть больше 0
    private VehicleType type; //Поле может быть null

    public Vehicle() {
    }

    public Vehicle(long id, String name, Coordinates coordinates, LocalDateTime creationDate, long enginePower, long numberOfWheels, float capacity, VehicleType type) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.enginePower = enginePower;
        this.numberOfWheels = numberOfWheels;
        this.capacity = capacity;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, Scanner sc) {
        String nametest = name;
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        boolean check = true;
        while (check) {
            Matcher matcher = pattern.matcher(nametest);
            if (matcher.find()) {
                check = false;
                this.name = nametest;
            } else {
                System.out.print("Введите имя добавляемого элемента: ");
                nametest = sc.nextLine();
            }
        }
    }

    public String getCoordinates() {
        String coordinatesFinal = "";
        coordinatesFinal = "x=" + coordinates.getX() + " y= " + coordinates.getY();
        return coordinatesFinal;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public long getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(long enginePower, Scanner sc) {
        boolean check = true;
        while (check) {
            if (enginePower > 0) {
                this.enginePower = enginePower;
                check = false;
            } else {
                System.out.print("Введите мощность добавляемого элемента: ");
                enginePower = sc.nextLong();
            }
        }
    }

    public long getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(long numberOfWheels, Scanner sc) {
        boolean check = true;
        while (check) {
            if (numberOfWheels > 0) {
                this.numberOfWheels = numberOfWheels;
                check = false;
            } else {
                System.out.print("Введите кол-во колес у добавляемого элемента: ");
                numberOfWheels = sc.nextLong();
            }
        }
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity, Scanner sc) {
        boolean check = true;
        while (check) {
            if (capacity > 0) {
                this.capacity = capacity;
                check = false;
            } else {
                System.out.print("Введите вместимость добавляемого элемента: ");
                capacity = sc.nextLong();
            }
        }
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coordinates=" + coordinates +
                ", creationDate=" + creationDate +
                ", enginePower=" + enginePower +
                ", numberOfWheels=" + numberOfWheels +
                ", capacity=" + capacity +
                ", type=" + type +
                '}';
    }
}