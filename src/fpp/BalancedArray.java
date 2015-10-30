Page 93 Q3

public static int isBalanced(int[] a){
		
		for(int i = 0; i<a.length; i++){
			
			boolean holyCow = false;
			int firstNum = a[i];
			if(firstNum > 0) firstNum *=-1;
			else firstNum = -firstNum;
			
			
			for(int j = 0; j<a.length; j++){
				
				if(a[j] == firstNum){
					holyCow = true;
				}
				
			}
			
			if(holyCow) continue;
			else return 0;
		}
		
		return 1; 
		
		
	}
