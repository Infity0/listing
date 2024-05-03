package vshp.Shaitanov.Block_5;

public class BubbleSortDemo {

    public static void main(String[] args) {

        int nums[] = {99, -10, 23, 123972, 17, -654, 46, 87, -9};

        System.out.println("Исходеый порядок массива:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");

            System.out.println();
            BubbleSort.sort(nums);

            System.out.println("Новый порядок:");
            for ( i = 0; i < nums.length; i++) { //Убрал тут int перед i (выдавало ошибку)
                System.out.println(nums[i] + " ");

                System.out.println();
            }
        }
    }
}

