package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.insertion_sort.service;

public class InsertionSortService {
    public  void sort_sub(String array[], int f){
        String temp="";
        for(int i=0;i<f;i++){
            for(int j=i+1;j<f;j++){
                if(array[i].compareToIgnoreCase(array[j])>0){
                    temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        int n = array.length;
        for (int i=0; i<n; ++i)
            System.out.print(" | "+array[i] + " | ");
        System.out.println();
    }

}
