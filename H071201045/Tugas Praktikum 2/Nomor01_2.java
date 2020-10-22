package tugaspraktikum;

public class Nomor01_2 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Masukkan angka : ");
	
		//negatif, positif, genap, ganjil
		int a = input.nextInt();
		int b = input.nextInt(); 
		int c = input.nextInt(); 
		int d = input.nextInt(); 
		int e = input.nextInt();
		
		int genap = 0;
		int ganjil = 0;
		int positif = 0;
		int negatif = 0;
		
		
// a	
		try {
		if (a<=0)
        { if (a<0)
          negatif++;
            if(a%2==0)
                genap++;
            else
                ganjil++;            
        } else {
            positif++;
            if(a%2==0)
                genap++;
            else
                ganjil++;}

// b		
        if (b<=0)
        { if (b<0)
            negatif++;
            if(b%2==0)
                genap++;
            else
                ganjil++;            
        } else {
            positif++;
            if(b%2==0)
                genap++;
            else
                ganjil++;}

 // c     
        if (c<=0)
        { if (c<0)
            negatif++;
           if(c%2==0)
                genap++;
            else
                ganjil++;            
        } else {
        positif++;
            if(c%2==0)
                genap++;
            else
                ganjil++;}

 // d       
        if (d<=0)
        { if (d<0)
            negatif++;
           if(d%2==0)
                genap++;
            else
                ganjil++;            
        } else {
            positif++;
            if(d%2==0)
                genap++;
            else
                ganjil++;}

        
 // e       
        if (e<=0)
        { if (e<0)
            negatif++;
            if(e%2==0)
                genap++;
            else
                ganjil++;            
        } else {
            positif++;
            if(e%2==0)
                genap++;
            else
                ganjil++;}
        
        
        System.out.printf("jumlah bilangan positif = %d \n",positif);
        System.out.printf("jumlah bilangan negatif = %d \n",negatif);
        System.out.printf("jumlah bilangan ganjil = %d \n",ganjil);
        System.out.printf("jumlah bilangan genap = %d " ,genap);}        
		catch (Exception string)  {
        System.out.println("Input Tidak Valid");}
			}
}

