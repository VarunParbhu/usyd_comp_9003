import java.util.*;
public class SelectionSort {
	public static ArrayList<String> selectionSort(ArrayList<String> listA, ArrayList<Integer> listB) {
		
		if (listA==null || listB==null){
			return null;
		}

		if (listA.size()==0 || listB.size()==0){
			return null;
		}

		if (listA.size()!=listB.size()){
			return null;
		} else if (listA.size()==0 || listB.size()==0){
			return listA;
		}

		ArrayList<Integer> listBCopy = new ArrayList<Integer>(listB);
		ArrayList<String> outputSort = new ArrayList<String>();
		ArrayList<Integer> outputIndex = new ArrayList<Integer>();

		for(int i=0;i<listA.size();i++){
			int min=listBCopy.get(0);
			int minIndex = 0;
			for(int j=0;j<listBCopy.size();j++){
				if(listBCopy.get(j)<min){
					min = listBCopy.get(j);
					minIndex = j;
				}
			}

			outputIndex.add(listB.indexOf(min));
			listBCopy.remove(minIndex);
		}
		System.out.println(listBCopy);
		System.out.println(outputIndex);

		for (int i=0;i<listA.size();i++){
			outputSort.add(listA.get(outputIndex.get(i)));
		}

		return outputSort;

	}
}
