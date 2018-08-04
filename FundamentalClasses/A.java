import java.util.*;
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);
		System.out.println("Enter number of persons");
		int num = a.nextInt();
		int [] ids = new int[num];
		for(int i =0;i<ids.length;i++){
			ids[i]=a.nextInt();
		}

		int j =2;
		int []value = new int[num];

			while(j<Integer.MAX_VALUE){
			
				for(int k=0;k<ids.length;k++){
				value[k] = ids[k] % j;
			}

				int temp = 0;
		Arrays.sort(value);
		for(int m=0;m<value.length-1;m++){
			temp=0;
			if(value[m]==value[m+1]){
				temp=1;
			j++;
			break;
			}
			
	}
		if(temp==0){
			break;
		}
			}
			System.out.println(j);
	}
}


	
