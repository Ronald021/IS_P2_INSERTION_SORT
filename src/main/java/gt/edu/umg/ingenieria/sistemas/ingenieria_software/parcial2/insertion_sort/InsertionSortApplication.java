package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.insertion_sort;

import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.insertion_sort.service.InsertionSortService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


@SpringBootApplication
public class InsertionSortApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsertionSortApplication.class, args);
		Scanner sc=new Scanner(System.in);

		System.out.print("Ingrese la cantidad de nombres que desea ingresar: ");
		int n=sc.nextInt();
		String[] sarray=new String[n];

		for(int i=0;i<n;i++){
			System.out.print("Ingrese el nombre "+(i+1)+": ");
			sarray[i]=sc.next();
		}
		InsertionSortService is = new InsertionSortService();
		is.sort_sub(sarray, sarray.length);
	}

}
