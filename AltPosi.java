package fstqtn;

public class AltPosi {
	public static void main(String[] args) {
		 String s="Hello"; 
		 System.out.println(alternatingChar(s));
		}
		public static String alternatingChar(String s){
		 StringBuffer sb=new StringBuffer();
		 for(int i=0;i<s.length();i++)
		  if(i%2==0)
		   sb.append(s.charAt(i));
		 return sb.toString();
		}
		}