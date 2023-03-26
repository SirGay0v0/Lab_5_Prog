package comands;

import vehicle_types_coordinates.Vehicle;

import java.util.Objects;
import java.util.Vector;

public interface show {
    static void show(Vector vector) {
        int i = -1;
        for (Object vehicle : vector) {
            System.out.println("index = " + vector.indexOf(vehicle) + ", " + vehicle.toString());
        }
    }
}
