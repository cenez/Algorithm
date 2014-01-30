import java.util.ArrayList;
import java.util.List;

public class SelectSort {
	public static void main(String[] args) {
		List<Integer> data = new ArrayList<Integer>();
		data.add(1);
		data.add(7);
		data.add(10);
		data.add(19);
		data.add(20);
		data.add(27);
		data.add(29);
		adiciona(data,8);
		for(int i=0;i<data.size();i++){
			System.out.println(data.get(i));
		}
	}
	public static void adiciona(List<Integer> X, int x){
		X.add(x);
		for(int i=0; i<X.size();i++){
			if(X.get(i)>x){
				int temp = X.get(i);
				X.set(i,X.get(X.size()-1));
				X.set(X.size()-1, temp);
			}
		}
	}
}
