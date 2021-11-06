import java.util.Scanner;
class LargestElement{
public static void main(String args[]){
	int size,i=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array:\n");
      size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter the Array Elements:\n");
	for(i=0;i<size;i++){
		arr[i]=sc.nextInt();
	}
	int largest;
	largest=arr[0];
	for(i=0;i<size;i++){
		if(largest<arr[i]){
			largest=arr[i];
			i++;
		}
	}
	System.out.println("Largest Element is:"+largest);
}
}