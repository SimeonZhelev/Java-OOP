package Exercise01_WorkingWithAbstraction.TrafficLights_04;

import java.util.Arrays;
import java.util.Scanner;

import static Exercise01_WorkingWithAbstraction.TrafficLights_04.Signal.printSignal;
import static Exercise01_WorkingWithAbstraction.TrafficLights_04.Signal.updateSignal;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Signal[] signals = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Signal::valueOf)
                .toArray(Signal[]::new);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            updateSignal(signals);
            
            printSignal(signals);
        }
    }
}