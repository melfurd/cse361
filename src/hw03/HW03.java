package hw03;

public class HW03 {

	static long tStart;
	static long tEnd;
	static long tDelta;
	static double elapsedSeconds;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start for binary 1 for n = 100 , k = 97");
		startTimer();
		bin1(100,97);
		endTimer();
		System.out.println("End, it took "+ elapsedSeconds + " seconds.");
		System.out.println("Start for binary 2 for n = 100, k = 97");
		startTimer();
		bin2(100, 97);
		endTimer();
		System.out.println("End, it took "+ elapsedSeconds + " seconds.");
		
		
		System.out.println("Start for binary 1 for n = 500 , k = 97");
		startTimer();
		bin1(500,97);
		endTimer();
		System.out.println("End, it took "+ elapsedSeconds + " seconds.");
		System.out.println("Start for binary 2 for n = 500, k = 97");
		startTimer();
		bin2(500, 97);
		endTimer();
		System.out.println("End, it took "+ elapsedSeconds + " seconds.");
	}
	
	public static void startTimer(){
		tStart = System.currentTimeMillis();
	}
	
	public static void endTimer(){
		tEnd = System.currentTimeMillis();
		tDelta = tEnd - tStart;
		elapsedSeconds = tDelta / 1000.0;
	}
	


	
	public static int bin1(int n, int k){
		if (k==0 || n == k){
			return 1;
		}
		else{
			return bin1(n-1, k-1) + bin1(n-1,k);
		}		
			
	}
	
	public static int bin2(int n, int k){
		int [][] B = new int[n+1][k+1];
		for (int i = 0; i <= n; i++){
			for (int j = 0; j <= Math.min(i, k); j++){
				if (j ==0 || j == i){
					B[i][j] = 1;
				}
				else{
					B[i][j] = B[i-1][j-1]+B[i-1][j];
				}
			}
		}
		return B[n][k];
	}

}
