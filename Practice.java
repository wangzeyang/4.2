public class Practice{
	
	public static void main (String [] args){
		String l,k;
		String z="*";
		String o="       ";
		String v="  ";
		int c=8;
		int g=13;
		String d="*************";
		double s=0;
		for(int i=0;i<100;i++){
			if (i%5==0&&i!=0) System.out.println();
			s=s+2;
			System.out.print(s+"  ");
			}
		double x=1;
		int a=0;
		do{
			if (a%5==0) System.out.println();
			System.out.print(x+"  ");
			x=x+2;
			a++;
		}
			while(a<100);
		int q=0;
		System.out.println();
		while(q<13){
			
			if(q<7){
				c--;
				l=o.substring(0,c);
				System.out.println(l+z);
				o=o+"";
			z=z+"**";
			}else{
				g=g-2;
				k=d.substring(0,g);
				System.out.println(v+k);
				v=v+" ";
			
				}
			q++;
		}
	}
	
}
