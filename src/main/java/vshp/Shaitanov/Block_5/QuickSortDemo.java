package vshp.Shaitanov.Block_5;

public class QuickSortDemo {
    public static void main(String[] args) {
        char seq[] = {'h', 'e', 'd', 'a', 'c', 'i'};

        System.out.println("Исходный порядок символов:");
        for (int i = 0; i < seq.length; i++)
            System.out.print(seq[i]);

        System.out.println();
        QuickSort.sort(seq);

        System.out.println("Сортированный порядок:");
        for (int i = 0; i < seq.length; i++)
            System.out.print(seq[i]);

        System.out.println();
    }
}

