package example_utils;

public class BubbleSort {

    // Property
    private int[] data;

    // Constructor
    public BubbleSort(int[] data) {
        this.data = data;
    }

    // Sort method
    public void sort() {

        for (int i = 0; i < data.length - 1; i++) {

            for (int j = 0; j < data.length - 1 - i; j++) {

                if (data[j] > data[j + 1]) {

                    // Swap
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    // Return sorted value
    public int[] getData() {
        return data;
    }
}