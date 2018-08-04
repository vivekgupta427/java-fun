
public class PointInsideRectangle {

	public static void main(String[] args) {
		if(isInside(10, 10, 10, 26, 45, 26, 45, 10, 0, 50)){
			System.out.println("outside");
		}else{
			System.out.println("inside");
		}
	}
	
	static float area(int x1,int y1,int x2,int y2,int x3,int y3,int x4, int y4){
		int height = y3-y4;
		int width = x4-x1;
		return (float)(height*width);
	}
	
	static float areaTri(int x1,int y1,int x2,int y2,int x3,int y3){
		return (float)((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2.0);
	}
	
	static boolean isInside(int x1,int y1,int x2,int y2,int x3,int y3,int x4, int y4,int x,int y){
		float A = area(x1,y1,x2,y2,x3,y3,x4,y4);
		System.out.println(A);
		float A1 = areaTri(x1, y1, x, y, x2, y2);
		float A2 = areaTri(x2, y2, x, y, x3, y3);
		float A3 = areaTri(x3, y3, x, y, x4, y4);
		float A4 = areaTri(x4, y4, x, y, x1, y1);
		return A<(A1+A2+A3+A4); 
	}

}
