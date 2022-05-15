
public class MergeSort {
    
    //splitted das array in der mitte
    //splitted rekursiv so lange, bis nur noch zwei elemente. die beiden elemente wreden sortiert
    //zusammenfügen der einzelnen elemente und dabei nochmal jeweils sortieren beim zusammenfügen

    public static int[] mergeSort(int[] unsortedArray)
        {
            int[] leftHalfArray = new int[unsortedArray.length / 2];
            int[] rightHalfArray = new int[(unsortedArray.length / 2) - 1];

            for (int i = 0; i < unsortedArray.length / 2; i++)
            {   
                leftHalfArray[i] = unsortedArray[i];
            }

            for (int i = 0; i < (unsortedArray.length / 2) - 1; i++)
            {
                rightHalfArray[i] = unsortedArray[(unsortedArray.length / 2) - 1 + i];
            }

            return leftHalfArray;
        };

}
