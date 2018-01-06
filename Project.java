import java.util.Scanner;
public class Project {
	public static double MomentumLinear(double m, double v){
		double p = m*v;
		return p;
	}
	public static double Impuls(double F, double T, double t){
		double I = F*(T-t);
		return I;
	
	}
	public static double ImpulsPM(double F, double T, double t){
		double IPM = P2-P1;
		return IPM;
	
	}
public static void main(String[] args){
Scanner Scan=new Scanner(System.in);
int x;
do{
		System.out.println("============================================================");
		System.out.println("                       Momentum dan Impuls		            ");
		System.out.println("============================================================");
		System.out.println(" 1. MomentumLinear");
		System.out.println(" 2. Impuls");
		System.out.println(" 3. perubahan impuls terhadap interval waktu");
		System.out.println(" 0. Keluar ");
		System.out.println("============================================================");
		System.out.print("Masukkan Nomor Materi : ");
		int NM= Scan.nextInt();

	if(NM==1){
		System.out.print("Masukan Nilai Massa Benda : ");
		double m= Scan.nextDouble(); // m = massa benda
		System.out.print("Masukan Nilai Kecepatan Benda : ");
		double v= Scan.nextDouble(); // v = kecepatan benda
		double ML= MomentumLinear(m,v); // ML = momentum benda
		System.out.println("Nilai Momentum Benda Adalah "+ML+ "Kilogram meter persecond");
	} else if(NM==2){
		System.out.print("Masukan Nilai Gaya Benda : ");
		double F= Scan.nextDouble();
		System.out.print("Masukan Nilai Waktu Akhir : ");
		double T= Scan.nextDouble();
		System.out.print("Masukan Nilai Waktu Awal : ");
		double t= Scan.nextDouble();
		double IM= Impuls(F,T,t);
		System.out.println("Nilai Impuls Benda Adalah "+IM+ "Kilogram Meter Persecond");
	} else if(NM=3){
		System.out.print("Masukan Nilai Momentum benda pertama : ");
		double P1= Scan.nextDouble();
		System.out.print("Masukan Nilai Momentum benda Kedua : ");
		double P2= Scan.nextDouble();
		double IPM= ImpulsPM(F,T,t);
		System.out.println("Nilai Impuls Benda Adalah "+IPM+ "Kilogram Meter Persecond");
	}	
}
}
}