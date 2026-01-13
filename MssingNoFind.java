

public class MssingNoFind {

	public static void main(String[] args)
	{
		
		long no = 124689L;
		
        long temp=no;
        
        int check=0;
       
       
        	for(long i=1;i<=9;i++) {
        	 	check=0;
        		while(temp!=0) {
        			long r=temp%10;
        		if(r==i) {
        			check=1;break;
        		}
        		temp/=10;
        		}
        		temp=no;
        		if(check==0)System.out.println(i);
        	}
       

	}

}
