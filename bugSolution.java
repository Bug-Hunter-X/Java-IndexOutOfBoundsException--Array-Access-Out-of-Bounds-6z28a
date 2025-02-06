public class MyClass {
    public static void main(String[] args) {
        int[] array = new int[5];
        if (0 <= 4 && 4 < array.length) {
            array[4] = 10; // Corrected index
            System.out.println(array[4]);
        } else {
            System.out.println("Index out of bounds");
        }
    }
}