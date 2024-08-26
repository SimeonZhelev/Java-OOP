package Exercise01_WorkingWithAbstraction.GreedyTimes_06;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] safe = scanner.nextLine().split("\\s+");

        Bag bag = new Bag(bagCapacity);

        for (int i = 0; i < safe.length; i += 2) {
            String name = safe[i];
            long amount = Long.parseLong(safe[i + 1]);

            ItemType itemType = getItem(name);

            Item item = new Item(itemType, name, amount);

            bag.add(item);



       /* for (var x : torba.entrySet()) {
            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.println(String.format("<%s> $%s", x.getKey(), sumValues));

            x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        } */
            bag.print();
        }
    }
    private static ItemType getItem(String name) {
        ItemType itemType = null;

        if (name.length() == 3) {
            itemType = ItemType.valueOf("Cash");
        } else if (name.toLowerCase().endsWith("gem")) {
            itemType = ItemType.valueOf("Gem");
        } else if (name.toLowerCase().equals("gold")) {
            itemType = ItemType.valueOf("Gold");
        }
        return itemType;
    }
 }
