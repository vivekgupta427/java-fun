
public class MatrixProbability {

	public static void main(String[] args) {
		int m = 5, n =5;
		int x= 3,y=1;
		int N= 2;
		
		System.out.println("Probability is : " + findProbability(x,y,m,n,N));

	}
	
	public static double findProbability(int x, int y, int rows, int col,int steps){
		if(!isSafe(x,y,rows,col)){
			return 0.0;
		}
		
		if(steps==0){
			return 1.0;
		}
		
		double prob = 0.0;
		
		//moving upwards
		prob += findProbability(x-1, y, rows, col, steps-1)*0.25;
		
		//moving downwards
		prob += findProbability(x+1, y, rows, col, steps-1)*0.25;
		
		//moving right
		prob += findProbability(x, y+1, rows, col, steps-1)*0.25;
		
		//moving left
		prob +=findProbability(x, y-1, rows, col, steps-1)*0.25;
		
		return prob; 
	}
	
	public static boolean isSafe(int x,int y,int rows,int col){
		return (x>=0 && y>=0 && x<rows && y<col);			
	}

}
