package sfsgvs;

public class cc_5 {
	public static void main(String[] args) {
		
		int len = args.length;
		
		if (len > 0) {
			
			for(int i=0 ; i < len ; i++) {
				System.out.println(args[i]);
			}
		}else {
			System.out.println("無參數帶入");
			
		}
		
	}

}
