package lab7;

public class algorithm {
	public static int Secret(int [] Array) {
		int[] A =Array;
		int minval = A[0];
		int maxval=A[0];
		for(int i=1;i<=A.length-1;i++) {
			if(A[i]< minval) {
				minval=A[i];
			}
			if(A[i]>maxval) {
				maxval = A[i];
			}
			
		}
		return maxval- minval;
	}

	public static void main(String[] args) {
		
			int [] Ar = {6,9,10,20};
			System.out.println(+ Secret(Ar));


	}

}
