/*
 * 29/01/2014
 * */
public class MergeSort {
	public static void main(String[] args) {
		int[] t = {10,7,90,3,79,8,15,13,20};
		int n = t.length-1;
		sort(t,0,n);
		for(int x=0;x<t.length; x++){
			System.out.println("|"+t[x]+"|");
		}
	}
	public static void intercala(int[] A, int p, int q, int r){
		int n1 = q-p+1;
		int n2 = r-q;  
		int count = 0;
		int[] L = new int[n1+2];
		int[] R = new int[n2+2];
		for(int i=1;i<=n1;i++) L[i] = A[p+i-1];
		for(int i=1;i<=n2;i++) R[i] = A[q+i];
		L[n1+1] = 2147483647;
		R[n2+1] = 2147483647;
		int i = 1;
		int j = 1;
		for(int k=p;k<=r;k++){
			if (L[i]<=R[j]){
				A[k] = L[i];
				i = i + 1;
			} else {
				count = count +1;
				A[k] = R[j];
				j = j + 1;
			}
		}
	}
	public static void sort(int[] A, int p, int r){
		if(p<r){
			int q = (int)((p+r)/2);
			sort(A,p,q);
			sort(A,q+1,r);
			intercala(A,p,q,r);
		}
	}
}

