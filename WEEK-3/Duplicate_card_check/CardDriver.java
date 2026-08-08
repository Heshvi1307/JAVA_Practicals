public class CardDriver {
    public static void main(String[] args) {
        Card[] cards = new Card[6];
        int count = 0; 

        Card[] cardsToAdd = {
                new Card("Ace", "Spades"),
                new Card("King", "Hearts"),
                new Card("Queen", "Hearts"),
                new Card("Ace", "Spades"), 
                new Card("10", "Clubs"),
                new Card("King", "Hearts") 
        };

        boolean duplicateFound = false;
        for (Card newCard : cardsToAdd) {
            for (int i = 0; i < count; i++) {
                if (cards[i].equals(newCard)) {
                    System.out.println("Duplicate found: " + newCard);
                    duplicateFound = true;
                    break; 
                }
            }
            cards[count] = newCard;
            count++;
        }

        if (!duplicateFound) {
            System.out.println("No duplicates found.");
        }

        System.out.println("\nAll cards added:");
        for (int i = 0; i < count; i++) {
            System.out.println(cards[i]);
        }
    }
}