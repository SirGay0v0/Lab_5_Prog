package comands;

import vehicle_types_coordinates.Vehicle;

import java.util.Objects;
import java.util.Vector;

public interface show {
    static void show(Vector vector) {
        for (Object vehicle : vector) {
            System.out.print(vehicle + " ");
        }
    }
}
