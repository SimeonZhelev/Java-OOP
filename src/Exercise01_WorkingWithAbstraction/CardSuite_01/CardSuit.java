package Exercise01_WorkingWithAbstraction.CardSuite_01;

public enum CardSuit {
    CLUBS,
    DIAMONDS,
    HEARTS,
    SPADES;

    public static void printCardSuits(){
        System.out.println("Card Suits:");
        for (CardSuit cardsuit : CardSuit.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s\n",cardsuit.ordinal(),cardsuit);
        }
    }
}
