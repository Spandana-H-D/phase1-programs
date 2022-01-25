

public class UsingTryCatch {

	public static void main(String[] args) {
		
		        int[] array = new int[7];
		        try 
		        {
		            array[8] = 7;
		        }
		        catch (ArrayIndexOutOfBoundsException e) 
		        {
		            System.out.println("Array index is out of bounds!"); 
		        }
		        finally 
		        {
		            System.out.println("The array is of size " + array.length);
		        }
		    }
		}


