package ThredDemo;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 50, 22, 5, 95, 5, 66 };

		int num = 0;
		for (int i = 0; i <= arr.length; i++) {

			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					num = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = num;

				}
			}

		}
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
