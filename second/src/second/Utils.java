package second;

import java.util.Arrays;

public class Utils {

	public static int parseStringToInt(String a, int i) {
		// TODO Auto-generated method stub

		int result = 0;

		try {

			result = Integer.parseInt(a);

			return result;
		} catch (NumberFormatException e) {

			return i;
		}

	}

	public static int parseStringToInt(String a) {
		// TODO Auto-generated method stub
		int result = 0;
		try {
			result = Integer.parseInt(a);

			return result;
		} catch (NumberFormatException e) {

			return 0;
		}

	}

	public static void sortASC(int[] arr) {
		// TODO Auto-generated method stub
		int temp;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}

		}
	}

	public static void printArr(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int a=0;a<arr.length;a++) {
			
        	  System.out.printf("[%d]",arr[a]);
        	  if (arr.length - 1 != a) {
  				System.out.print(",");
  			 
  			}
        	 
        	  
        	  
          }
		

	}

	public static void sortDEC(int[] arr) {
		// TODO Auto-generated method stub
		int d;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					d = arr[i];
					arr[i] = arr[j];
					arr[j] = d;
				}
			}

		}

	}

	public static int getRandom(int start, int end) {
		int a = (int) Math.random() * end + 1;

		return a;
	}

	public static int[] createRandomArr(int start, int end, int count) {
		// TODO Auto-generated method stub

		int arr[] = new int[count];

		for (int a = 0; a < arr.length; a++) {
			arr[a] = (int)((Math.random())*(end-start+1)+start);
			for (int j = 0; j < arr.length; j++) {

			}
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}

	public static int[] createRandomArrNoDuplication(int start, int end, int count) {
		// TODO Auto-generated method stub
		if(end-start+1<count) {
			return null;
		}
		int arr[] = new int[count];

		for (int i = 0; i < arr.length; i++) {
			arr[i]= (int)((Math.random())*(end-start+1)+start);
			for (int j = 0; j < i; j++) {

				if (arr[i] == arr[j]) {
					i--;

					break;

				}

			}
		}

		System.out.println(Arrays.toString(arr));
		return arr;
	}
}
