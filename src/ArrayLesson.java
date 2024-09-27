public class ArrayLesson {
    public static void main(String[] args) {

        int[] largeArray = {8, -24, 12, 13, 2, 25, 65, 34, 54, 99, 76, 87, 10, 54};

        int smallest = largeArray[0];
        int largest = largeArray[0];
        int i = 0;

        for (i=0; i<=13; i++);
        {
            if (largeArray[i] < smallest) smallest = largeArray[i];
            if (largeArray[i] > largest) largest = largeArray[i];
        }
        System.out.println("the smallest value is: " + smallest);
        System.out.println("the largest value is: " + largest);

    }
}

