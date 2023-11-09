import java.util.*;

public class ExchangeCipher {

    public static void main(String[] args) {
        // Create a scanner to read the plaintext string from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the plaintext string
        System.out.print("Enter the plaintext string: ");
        String plaintextString = scanner.nextLine();

        // Convert the plaintext string to a character array
        char[] characters = plaintextString.toCharArray();

        // Create a ciphertext array
        char[] ciphertextCharacters = new char[characters.length];

        // Loop through the characters in the plaintext string
        for (int i = 0; i < characters.length; i++) {
            // Get the current character
            char currentCharacter = characters[i];

            // Get the ciphertext character corresponding to the current character
            char ciphertextCharacter = (char)((currentCharacter - 'A' + 26) % 26 + 'A');

            // Store the ciphertext character in the ciphertext array
            ciphertextCharacters[i] = ciphertextCharacter;
        }

        // Print the ciphertext string in uppercase
        System.out.println("The ciphertext string is: " + new String(ciphertextCharacters).toUpperCase());
    }
}
