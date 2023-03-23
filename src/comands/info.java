package comands;

import java.util.Date;
import java.util.HashSet;
import java.util.Vector;

public interface info {
    static void info(Vector vector, Date date) {
        System.out.println("Vector, " + date.toString() + ", " + vector.size());
    }
}