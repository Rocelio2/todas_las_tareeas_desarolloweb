public class Blackjack {

    public int parseCard(String card) {
        switch (card) {
            case "ace": return 11;
            case "two": return 2;
            case "three": return 3;
            case "four": return 4;
            case "five": return 5;
            case "six": return 6;
            case "seven": return 7;
            case "eight": return 8;
            case "nine": return 9;
            case "ten": case "jack": case "queen": case "king": return 10;
            default: return 0;
        }
    }

    public boolean isBlackjack(String card1, String card2) {
        return parseCard(card1) + parseCard(card2) == 21;
    }

    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (handScore == 22) {
            return "P"; // Split
        }
        if (handScore == 21) {
            return dealerScore < 10 ? "W" : "S"; // Win or Stand
        }
        if (handScore >= 17 && handScore <= 20) {
            return "S";
        }
        if (handScore >= 12 && handScore <= 16) {
            return dealerScore >= 7 ? "H" : "S"; // Hit or Stand
        }
        return "H"; // Hit
    }
}