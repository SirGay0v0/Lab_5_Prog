import comands.*;
import vehicle_types_coordinates.Vehicle;

import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

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
                case "help": {
                    help.help();
                }
                case "info":{
                    info.info(vector, date);
                }
                case "show":{
                    show.show(vector);
                }
                case "add {element}":{
                    add_element.add_element(sc);
                }
            }
        }
    }
}