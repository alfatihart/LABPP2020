package tugaspraktikum;

public class Nomor02_2 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("** Menu **");
		System.out.println("1. Mencari Luas Bangun Datar");
		System.out.println("2. Mencari Volume Bangun Ruang");
		
		System.out.println("Input angka sesuai dengan menu yang diinginkan : ");
		
		int pilihnomor = input.nextInt();
		
		
		if (pilihnomor == 1) {
			System.out.println("** Pilih Bangun Datar **");
			System.out.println("1. Persegi");
			System.out.println("2. Persegi Panjang");
			System.out.println("3. Segitiga");
			System.out.println("4. Lingkaran");
			System.out.println("5. Jajar Genjang");
			System.out.println("6. Trapesium");
			System.out.println("7. Belah Ketupat");
			System.out.println("8. Layang-layang");
			}	else if (pilihnomor == 2) {
			System.out.println("** Pilih Bangun Ruang **");
			System.out.println("9. Kubus" );
			System.out.println("10. Prisma Segiempat");
			System.out.println("11. Limas Segiempat");
			System.out.println("12. Limas Segitiga ");
			System.out.println("13. Kerucut");
			System.out.println("14. Tabung");
			System.out.println("15. Kerucut");
			System.out.println("16. Bola");
		} else {
			System.out.println("Nomor tidak sesuai!");
		}
		
		System.out.println("Input angka sesuai dengan nomor bangun  yang diinginkan : ");
		pilihnomor = input.nextInt();
		
		
		switch (pilihnomor) {
		case 1:
			System.out.println("1. Persegi");
			System.out.println("Masukkan s : ");
			int s = input.nextInt();
			int P = s*s;
			System.out.println("Hasil persegi : " + P);
			break;
		case 2 :
			System.out.println("2. Persegi Panjang");
			System.out.println("Masukkan p : ");
			int p = input.nextInt();
			System.out.println("Masukkan l : ");
			int l = input.nextInt();
			int Pp = p*l;
			System.out.println("Hasil persegi panjang : " + Pp);
			break;
		case 3 :
			System.out.println("3. Segitiga ");
			System.out.println("Masukkan a : ");
			int a = input.nextInt();
			System.out.println("Masukkan t : ");
			int t = input.nextInt();
			int Sg = (a*t)/2;
			System.out.println("Hasil segitiga : " + Sg);
			break;
		case 4 :
			System.out.println("4. Lingkaran ");
			int phi = 22/7;
			System.out.println("Masukkan r : ");
			int r = input.nextInt();
			System.out.println("Masukkan L : ");
			int L = 2*phi*r*r;
			System.out.println("Hasil Lingkaran : " + L);
			break;
		case 5 :
			System.out.println("5. Jajar Genjang");
			System.out.println("Masukkan d1 : ");
			int d1 = input.nextInt();
			System.out.println("Masyukkan d2 : ");
			int d2 = input.nextInt();
			int Lj = (d1*d2)/2;
			System.out.println("Hasil Jajargenjang : " + Lj);
			break;
		case 6 :
			System.out.println("6. Trapesium");
			System.out.println("Masukkan sisi awal : ");
			int s1 = input.nextInt(); 
			System.out.println("Masukkan sisi bawah : ");
			int s2 = input.nextInt();
			System.out.println("Masukkan tinggi : ");
			int t1  = input.nextInt();
			int Lt = ((s1 + s2)*t1)/2;
			System.out.println("Hasil trapesium : " + Lt);
			break;
		case 7 :
			System.out.println("7. Belah Ketupat");
			System.out.println("Masukkan diagonal awal : ");
			int d3 = input.nextInt();
			System.out.println("Masukkan diagonal kedua : ");
			int d4 = input.nextInt();
			int Lb = (d3*d4)/2;
			System.out.println("Hasil Belah Ketupat : " + Lb);
			break;
		case 8 :
			System.out.println("8. Layang-layang");
			System.out.println("Masukkan diagonal awal : ");
			int d5 = input.nextInt();
			System.out.println("Masukkan diagonal kedua : ");
			int d6 = input.nextInt();
			int Ll = (d5*d6)/2;
			System.out.println("Hasil layang-layang : " + Ll);
			break;
		default: if(pilihnomor >=9) {
			System.out.println("Masukkan kembali!");
		}
		  }
	
		
		switch(pilihnomor) {
		case 9 :
			System.out.println("9. Kubus");
			System.out.println("Masukkan s : ");
			int s7 = input.nextInt();
			int V = s7*s7*s7;
			System.out.println("Hasil volume kubus : " + V);
			break;
		case 10:
			System.out.println("10. Balok");
			System.out.println("Masukkan p : ");
			int p1 = input.nextInt();
			System.out.println("Masukkan l : ");
			int l1 = input.nextInt();
			System.out.println("Masukkan t : ");
			int t2 = input.nextInt();
			int Vb = p1*l1*t2;
			System.out.println("Hasil volume balok : " + Vb);
			break;
		case 11 :
			System.out.println("11. Prisma Segitiga ");
			System.out.println("Masukkan luas alas : ");
			int la = input.nextInt();
			System.out.println("Masukkan t : ");
			int t3 = input.nextInt();
			int Vp = la * t3;
			System.out.println("Hasil Prisma Segitiga : " + Vp);
			break;
		case 12 :
			System.out.println("12. Limas Segiempat");
			System.out.println("Masukkan p : ");
			int p2 = input.nextInt();
			System.out.println("Masukkan l : ");
			int l2 = input.nextInt();
			System.out.println("Masukkan l : ");
			int t4 = input.nextInt();
			int Vlm = 1/3 * p2*l2*t4;
			System.out.println("Hasil Jajargenjang : " + Vlm);
			break;
		case 13 :
			System.out.println("13. Limas Segitiga");
			System.out.println("Masukkan Luas alas : ");
			int La = input.nextInt();
			System.out.println("Masukkan t : ");
			int t5 = input.nextInt();
			int Vls = 1/3*La*t5;
			System.out.println("Hasil Jajargenjang : " + Vls);
			break;
		case 14 :
			System.out.println("14. Tabung");
			System.out.println("Masukkan r : ");
			int r1 = input.nextInt(); 
			System.out.println("Masukkan tinggi : ");
			int t6  = input.nextInt();
			int phi2 = 22/7;
			int Vtb = phi2 *r1*r1*t6;
			System.out.println("Hasil trapesium : " + Vtb);
			break;
		case 15 :
			System.out.println("15. Kerucut ");
			System.out.println("Masukkan diagonal r : ");
			int r2 = input.nextInt();
			System.out.println("Masukkan diagonal t : ");
			int phi1 = 22/7;
			int t7 = input.nextInt();
			int Vk = 1/3*phi1*r2*r2*t7;
			System.out.println("Hasil Kerucut : " + Vk);
			break;
		case 16 :
			System.out.println("16. Bola ");
			int phi3 = 22/7 ;
			System.out.println("Masukkan r : ");
			int r3 = input.nextInt();
			int Vbo = 4/3 * phi3 * r3 *r3*r3;
			System.out.println("Hasil Volume Bola : " + Vbo);
			break;
		default: System.out.println("Masukkan kembali!");
	} 
			
}
}

