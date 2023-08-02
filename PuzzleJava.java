import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    Random randMachine = new Random();

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> randTen = new ArrayList<Integer>();
        int i = 0;
        while (i < 10) {
            randTen.add(randMachine.nextInt(21));
            i++;
        }

        return randTen;
    }

    public String getRandomLetter() {
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String randLetter = alphabet[randMachine.nextInt(alphabet.length)];
        return randLetter;
    }

    public String generatePassword() {
        int i = 0;
        String password = "";
        while(i < 8){
            password += getRandomLetter();
            i++;
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int ArrayLength) {
        ArrayList<String> passwords = new ArrayList<String>();
        int i = 0;
        while (i < ArrayLength) {
            passwords.add(generatePassword());
            i++;
        }
        return passwords;
    }

}