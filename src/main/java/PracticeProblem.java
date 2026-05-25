public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String[] addString(String[] arr, String s, int num) {
		
		String[] arr2 = new String[arr.length+1];
		int index = 0

		for (int i = 0; i < arr2.length; i++) {
			
			if (i != num){
				
				arr2[i] = arr[index];
				index++;
				
			}
				
			else {
				
				arr2[i] = s;
			}
		}
		return arr2;
	}

	
	public static char[] removeChars(char[] arr, char c) {
		
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == c) {
				
				count = count + 1;
			}
		}

		int index = 0;

		char[] arr2 = new char[arr.length - count];
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] != c) {
				arr2[index] = arr[i];
				index++;
			}
		}

		return arr2;
	}

}
