package lin;

public class voidDemmo03 {
	public static void main(String[] args) {
		java.util.Scanner scan  = new java.util.Scanner(System.in);
		
		int[] scores = new int[10];
		int a;
		
		System.out.println("輸入十個正整數");
		for (int i=0 ; i <scores.length ; i++) {
			System.out.print("請輸入第"+ (i+1) + "個正整數: ");
			scores[i]= scan.nextInt();
			
		}
		
		for (int i =0 ; i<scores.length; i++) {
			if(scores[i] > scores[i+1]) {
				a=scores[i];
				scores[i]=scores[i+1];
				scores[i+1]=a;
				
			}
		}
		for(int i=0;i<scores.length;i++)
			System.out.println(scores[i]);
		
		
		
	}
		
	}



