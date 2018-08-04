package stringsPractice;

public class ReverseWordInString {

	public static void main(String[] args) {
		String str = "This is my India, I love my India." ;
		char [] paragraph = str.toCharArray();
		for(int i=0;i<paragraph.length;i++){
			System.out.print(paragraph[i]);
	}
	    reverseWordInArray(paragraph);
	    System.out.println();
	    for(int i=0;i<paragraph.length;i++){
			System.out.print(paragraph[i]);
	}
}
	
	private static void reverseWordInArray(char [] para){
		int i=0, j=0,k=0,m=0;
		int count =0;
		for(i=0;i<para.length;){	
			j=i;		
			count=0;						
			while(para[j]!=' ' &&  para[j]!='.' && para[j]!=','){
	     				count++;	
						k++;		
						j++;							
				}
			int t = k-1;	
			j--; 			
			m=i;
			for(int n=0;n<count/2;n++){ 
				
				char ch = para[m]; 
				para[m] = para[t];  
				para[t]= ch;		
				t--;				
				m++;			
			}			
			i=k+1;				
			k++;				
		}
	}
}
