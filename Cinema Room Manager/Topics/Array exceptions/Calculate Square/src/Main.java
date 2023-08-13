class FixingExceptions {
    public static void calculateSquare(int[] array, int index) {
        if (array == null) {
            System.out.println("Exception!");
        } else if (index < 0 || index > array.length - 1 ) {
            System.out.println("Exception!");
        } else {
            int square = array[index] * array[index];
            System.out.println(square);
        }
    }
}