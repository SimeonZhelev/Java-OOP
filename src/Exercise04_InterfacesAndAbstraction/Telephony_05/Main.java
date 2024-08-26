package Exercise04_InterfacesAndAbstraction.Telephony_05;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> phoneNumbers = List.of(scanner.nextLine().split("\\s+"));
        List<String> urls = List.of(scanner.nextLine().split("\\s+"));

        Smartphone smartphone = new Smartphone(phoneNumbers, urls);

        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());
    }
}