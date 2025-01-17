package NumberPattern;

public class pattern5 {


    public static class MyClass {
        public static void main(String[] args) {
        
        			ToRecurseIsDivine.print("To Iterate Is Human");
        			ToRecurseIsDivine.print("To Recurse Is Divine");
        			
        		}	
        	}

        	class ToRecurseIsDivine {
        	  public static void print(String statement) {
        	        int count = statement.length();
        	        if (count == 0) return;
        	        if (count % 2 == 0) {
        	            System.out.print(statement.charAt(0));
        	            print(statement.substring(1));
        	        } else if (count % 2 != 0) {
        	            System.out.print(statement.charAt(count - 1));
        	            print(statement.substring(0, count - 1));
        	        }
        	    }
        	}
}