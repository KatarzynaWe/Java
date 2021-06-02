public class ReversedArray {

    public static void main(String[] args) {
        reversedArray(new int[]{1,2,3,4,5,6,7,8,9});
    }

    public static void reversedArray(int[] numbers){
        System.out.println("Before change:");
        for (int number : numbers){
            System.out.print(number + " ");
        }
        for (int i = 0; i < numbers.length/2; i++){
            int temporary = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temporary;
        }
        System.out.println("");
        System.out.println("After change:");
        for (int number : numbers){
            System.out.print(number + " ");
        }
    }
}