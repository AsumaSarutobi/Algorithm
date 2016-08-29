package Algorithms;

import java.util.Random;

public class QuickSort {
    public static void main(String args[]){
        int[] array = new int[10];
        
        Random rand = new Random(System.currentTimeMillis());
        
        for(int i = 0; i<10; i++){
            array[i] = rand.nextInt(100);
        }
        quickSort(array, array.length-1,0);
        
        for(int x:array){
            System.out.print(x +" ");
        }
        
    }


    public static void quickSort(int[] a, int hi, int low){
        if(hi>low){
            Random rand = new Random();
            
            int pivotIndex = low + rand.nextInt(hi - low +1); 
            int temp = a[pivotIndex];
            a[pivotIndex] = a[hi];
            a[hi] = temp;
            
            int pivot = partion(a,hi,low);
            quickSort(a,pivot-1,low);
            quickSort(a,hi,pivot+1);
        }
    }
    
    public static int partion(int[]a,int hi,int low){
        int pivot = a[hi];
        int i = low;
        for(int j = i; j<hi; j++){
            if(pivot > a[j]){
                //(a[i],a[j]);
                int temp = a[i];
                a[i]=a[j];
                a[j]=temp; 
                
                i++;
            }
        }
        //swap(a[hi],a[i]);
        int temp2 = a[hi];
                a[hi]=a[i];
                a[i]=temp2;
        
        return i;
    }
}
