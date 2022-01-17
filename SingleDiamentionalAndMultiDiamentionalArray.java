package javafirstTask.come;

public class SingleDiamentionalAndMultiDiamentionalArray {

	public static void main(String[] args) {
		int[] single = {11,12,13,14,15,16,17,18,19};
		System.out.println("The elements in single diamentional array is ");
		for (int i=0;i<9;i++)
			System.out.print(single[i]+ " ");
		int[][] multi = {{11,12,13},{14,15,16},{17,18,19}};
		System.out.println();
		System.out.println("The elements in multi diamentional array is ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(multi[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
	


