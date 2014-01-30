/*
 * touch README.md
 * git init
 * git remote add origin https://github.com/cenezaraujo/Algorithm.git
 * 
 * 
 * -> git add Arquivo.java
 * -> git commit -m "Comentario"
 * -> git push -u origin master
 */
public class QuickSort {
	public static int id=0;
	public static int particione(int[] A,int p, int r){
		int pivo=A[r];
		int i = p-1;
		for(int j=p, temp;j<=r-1;j++){
			if (A[j]<=pivo){
					i = i + 1;
					temp = A[j]; 
					A[j] = A[i]; 
					A[i] = temp;
			}
		}
		A[r]   = A[i+1];
		A[i+1] = pivo;
		return i+1;
	}
	public static void sort(int[] A, int p, int r){
		if (p < r) {
			int q = particione(A, p, r);
			sort(A, p, q - 1);
			sort(A, q + 1, r);
		}	
	}
	public static void main(String[] args) {
		int[] A = {5,7,1,4,3,0,3,110,3};
		int n = A.length -1;
		sort(A,0,n);
		for(int i=0;i<A.length;i++){
			System.out.println(A[i]);
		}
		System.out.println(":::->"+QuickSort.id);
		
	}
}
