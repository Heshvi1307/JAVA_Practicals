public class Chatfilter {

    public static boolean containsKeyword(String message, String keyword) {
        return message.toLowerCase().contains(keyword.toLowerCase());
    }
}