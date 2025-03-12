package collectionframework;
import java.util.*;

class Main {

    public static String StringChallenge(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        StringBuilder compressed = new StringBuilder();
        char currentChar = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                count++;
            } else {
                compressed.append(count).append(currentChar);
                currentChar = str.charAt(i);
                count = 1;
            }
        }

        compressed.append(count).append(currentChar);
        String ChallengeToken = "rpl0q4x3";
        StringBuilder finalOutput = new StringBuilder();

        int tokenIndex = 0;
        for (int i = 0; i < compressed.length(); i++) {
            finalOutput.append(compressed.charAt(i));
            if (tokenIndex < ChallengeToken.length()) {
                finalOutput.append(ChallengeToken.charAt(tokenIndex));
                tokenIndex++;
            }
        }

        // Replace every fourth character with underscore
        for (int i = 3; i < finalOutput.length(); i += 4) {
            finalOutput.setCharAt(i, '_');
        }

        return finalOutput.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = s.nextLine();
        System.out.println("Final output: " + StringChallenge(input));
        s.close();
    }

}
