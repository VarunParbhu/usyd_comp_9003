import java.util.ArrayList;
import java.util.Arrays;

public class runner {
    public static void main(String[] args){
        ArrayList<String> listA = new ArrayList<>(Arrays.asList("Two", "One", "Three"));
        ArrayList<Integer> listB = new ArrayList<>(Arrays.asList(1, 2, 3));
        SelectionSort select = new SelectionSort();

        ArrayList<String> listC = select.selectionSort(listA,listB);

        System.out.println(listC);

    }
}
