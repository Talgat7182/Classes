
public class Calculator1 {
	
	
int sum(int a, int b, int c) { 
	
	
	return (a+b+c); 
}

int average(int a, int b, int c) { 
	
	
	return (a+b+c)/3;

}

int min(int a, int b, int c) { 
	
	
	int min = a; 
     if(b<a) {
    	 min = b; 
     }
     else if(c<min) { 
    	 min = c; 
     }
     return min; 
     
}

int max(int a, int b, int c) { 
	
	
	int max = a; 
     if(b>a) {
    	 max= b; 
     }
     else if(c>max) { 
    	 max= c; 
     }
     return max; 
   
}
}