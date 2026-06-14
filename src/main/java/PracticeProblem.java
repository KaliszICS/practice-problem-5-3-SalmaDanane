public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String[] addString(String[] arr, String word, int index) {
		String[]arr2 = new String[arr.length + 1];
		int j = 0;
		for (int i = 0; i < arr2.length; i++) {
			if (index == i) {
				arr2[i] = word;
			}
			else {
				arr2[i] = arr[j];
				j++;
			}
	}
		return arr2;
	}

	public static char[] removeChars(char[] arr, char character) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == character) { 
			count++;
		}
	}
		char[]arr2 = new char[arr.length - count];
		int j = 0;
		for (int i2 = 0; i2 < arr.length; i2++) {
			if (arr[i2] != character) { 
			arr2[j] = arr[i2];
			j++;
		}
		}
		return arr2;
	}	
	}


