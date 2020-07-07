package second;

import java.util.Arrays;

public class Gugudan {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/* guguDan(2, 6); */
		/*
		 * int sum=sum(1,2);
		 * 
		 * 
		 * sum=sum(1,2,3); sum=sum(1,2,3,4,6,7,8,9,10,11,12);
		 */

		/*
		 * int result=Utils.parseStringToInt("10",0);//10정수값 리턴
		 * System.out.println(result); result=Utils.parseStringToInt("aa10",1);//파싱할 수
		 * 없을 때 두번째 인자값 리턴 System.out.println(result);
		 * result=Utils.parseStringToInt("aa10");//0리턴 System.out.println(result);
		 * result=Utils.parseStringToInt("9");//9리턴 System.out.println(result);
		 */
		/*
		 * int[] arr = { 4, 5, 11, 223, 3, 10 }; Utils.sortASC(arr);
		 * System.out.println(Arrays.toString(arr)); Utils.sortDEC(arr);
		 * Utils.printArr(arr); System.out.println(Arrays.toString(arr));
		 */
		// 1~9 랜덤한 값을 5칸 가지는 정수형 배열을 리턴하시오

		/*
		 * int[] rArr = Utils.createRandomArr(1, 9, 5); rArr = Utils.createRandomArr(5,
		 * 15, 10); rArr=Utils.createRandomArrNoDuplication(5,15,11);
		 * Utils.printArr(rArr);
		 */

		String star = makeStarTrangle(5);
		System.out.println(star);

			System.out.println(star);
		
	}

	private static String makeStarTrangle(int star) {
		// TODO Auto-generated method stub\
		String str = "";
		for (int i = 1; i <= star; i++) {

			for (int j = 1; j <= i; j++) {
				str += "*";

			}
			str += "\n";
		}
		return str;
	}
	
	
	/*
	 * private static int sum(int ...arr) { int sum=0; for(int i=0;i<arr.length;i++)
	 * {
	 * 
	 * sum+=arr[i];
	 * 
	 * 
	 * 
	 * } System.out.println(sum);
	 * 
	 * 
	 * return sum; }
	 */

	/*
	 * public static void guguDan(int dan, int edan) { // TODO Auto-generated method
	 * stub for (int i = dan; i <= edan; i++) {
	 * 
	 * for (int j = 1; j <= 9; j++) {
	 * 
	 * if (i * j%2 == 0) { System.out.printf("%d * %d=%d\n", i, j, i * j); }
	 * 
	 * } System.out.println(); }
	 * 
	 * }
	 */

}
