
public class modorichi {
	public static void main(String[] args){
	      int a = 23165247;
	      if( isMultipleOf3(a) ){
	         System.out.println(a + "は3で割り切れます");
	      }else{
	         System.out.println(a + "は3で割り切れません");
	      }
	   }
	   public static boolean isMultipleOf3(int n){
	      boolean result;
	      result = ( n % 3  == 0 );
	      return result;
	   }
	}


