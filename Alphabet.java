public class Alphabet {
    public static void main(String[] args) {

        getAlphabet(10);
    }

    public static void getAlphabet(int number){
        String[] alphabet = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        if (number <= alphabet.length && number > 0){
            for (int i = 0 ; i < number ; i++){
                System.out.print(alphabet[i] + " ");
            }
        } else {
            System.out.println("Enter a number from 1 to 26");
        }
    }
}