package Lab02_Encapsulation.ValidationData_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Person_03> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            try{
                people.add(new Person_03(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3])));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        double bonus = Double.parseDouble(reader.readLine());
        for (Person_03 person : people) {
            try {
                person.increaseSalary(bonus);
                System.out.println(person.toString());
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
