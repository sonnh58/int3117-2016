package kiemthu2;

public class bt1 {
	public int dem(String x){
		int count=0;
		for(int i=0; i<x.length(); i++){
			if(x.charAt(i)=='C' || x.charAt(i)=='c'){
				count++;
			}
		}
		return count;
	}
}
