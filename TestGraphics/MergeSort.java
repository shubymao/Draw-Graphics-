package TestGraphics;
import java.util.Arrays;

public class MergeSort<E> {
    static int i=0;
    public static void sort(Comparable[] input,DrawArray d,int l, int r){
        if(l==r)return;
        else{
            int mid = (r-l-1)/2;

            sort(input,d,l,mid);
            sort(input,d,mid+1,r);
            merge(input,int mid);
        }
    }
    private static Comparable[] merge(Comparable[] input1,Comparable[]input2)
    {Comparable[] result = new Comparable[input1.length+input2.length];
    int i=0,j=0, r=0;
    int len1=input1.length, len2=input2.length;
    while(i<len1&&j<len2){
        if(input1[i].compareTo(input2[j])<0){
            result[r]=input1[i];
            i++;
            r++;
        }
        else {
            result[r] = input2[j];
            j++;
            r++;
        }
    }
    while(i<len1){
        result[r]=input1[i];
        i++;
        r++;
    }
    while(j<len2){
            result[r]=input2[j];
            j++;
            r++;
    }
    return result;
    }
}
