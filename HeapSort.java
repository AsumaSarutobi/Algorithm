package Algorithm;


public class HeapSort {
    public static void Heapify(int [] a, int n, int i){
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i+2;
        
        if(left<n && a[left]>a[largest]){
            largest = left;
        }
        
        if(right<n && a[right]>a[largest]){
            largest = right;
        }
        
        if(largest != i){
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
            
            Heapify(a,n,largest);
        }
    }
    
    public void Sort(int a[]){
        int n = a.length;
        
        for(int i = n/2-1; i>=0; i--){
            Heapify(a,n,i);
        }
        
        for(int i=n-1; i>=0; i--){//a[0] swap a[last]
            int swap = a[0];
            a[0] = a[i];
            a[i] = swap;
            
            Heapify(a,i,0);
        }
        
       
    }
    
    public static void main(String args[]){
        int [] a = {3,77,8,14,34};
        Print(a);
        HeapSort s = new HeapSort();
        s.Sort(a);
        Print(a);
        
    }
    
    public static void Print(int a[]){
        for(int x:a){
            System.out.printf("%d ",x);
        }
        System.out.println();
    }
}
