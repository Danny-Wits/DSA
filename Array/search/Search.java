package Array.search;
import Array.sorting.*;
public class Search {

	public static boolean binarySearch(int[] array, int needle) {
        if(array.length==0)return false;
        answerD.msort(array);
        return BS(array,needle,0,array.length-1);
	}
    private static boolean BS(int[]array,int needle,int from , int to ){
        if(from>to)return false;
        int middle=(from+to)/2;
        if(needle<array[middle])return BS(array,needle,from,middle-1);
        if(needle>array[middle])return BS(array,needle,middle+1,to);
        return true;
    }  
}
