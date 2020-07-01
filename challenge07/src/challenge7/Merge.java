package challenge7;

public class Merge {
	public static void main(String[] args) {
		int A[] = {162,168,170,175,177}; 	//A市名簿
		int B[] = {161,163,166,172,185};	//B市名簿
	//  int A[] = {162,168.170,175,177};
	//	int B[] = {161,168,170,175,177};

		int[] C = new int[10];
	// 	int[] C = new int {10];		//C市名簿　初期値に-1を設定
		int idx_a = 0;  //A市名簿配列用の番号
	//	int idx_a = 0;
		int idx_b = 0;  //B市名簿配列用の番号
	//  int  idx_b = 0;
		int idx_c = 0;  //C市名簿配列用の番号
	//  int idx_c =0;

		//C市の名簿分ループを行う
		for(idx_c=0; idx_c<C.length; idx_c=idx_c+1){
		   if(A[idx_a] < B[idx_b]){     //A<B
		      C[idx_c] = A[idx_a];
		      idx_a=idx_a+1;
		      if(idx_a>=A.length) {		//A市名簿が終了
		    	  idx_a = idx_a -1;		//最後に最大値を設定
		    	  A[idx_a] = 999;       //for if (頭ではなく指が覚えるまで課題をアレンジ）
		      }
		   }
		   /*for(idx c=0; idx_c<C.length; idx_c=c+1){
		    * if(A[idx_a] < B[idx_b]){
		    * C[idx_c] = A[idx_a];
		    * idx a = idx_a +1;
		    * if(idx_a>=A.length){
		    * idx_a = idx_a -1;
		    *   A[idx_a] =999;
		    *
		    *
		    * }
		    * }
		    *
		    *
		    */
		   else{            			 //B<A
		      C[idx_c] = B[idx_b];
		      idx_b=idx_b+1;
		      if(idx_b>=B.length) {		//B市名簿が終了
		    	  idx_b = idx_a -1;		//最後に最大値を設定
		    	  B[idx_b] = 999;
		      }

		   }
		}

		/*else{
		 * C[idx_c] = B[idx_b];
		 * idx_b=idx_b+1;
		 * if(idx_b>=B.length){
		 * 	idx_b = idx_a -1;
		 *  B[idx_b] =999;
		 *
		 */
		//C市名簿表示
		for(idx_c=0;idx_c<C.length;idx_c=idx_c+1) {
			System.out.println(C[idx_c]);
		}
	}
}
/*
 * 		for(idx_c=0;idx_c<C.length;idx_c=idx_c+1){
 * 			System.out.println(C[idx_c]);
 *
 *
 *
 *
 */
