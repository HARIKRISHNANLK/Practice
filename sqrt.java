package fstqtn;

public class sqrt{
	public static void main(String[] args) {
		 int x1=4,x2=8;
		 int y1=3,y2=5;
		 sqrt(x1,x2,y1,y2);
		}
		public  static void sqrt(int x1, int x2, int y1, int y2) {
		 int op;
		 op=(int) (Math.sqrt((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2)));
		 System.out.println(op);
		}
		}