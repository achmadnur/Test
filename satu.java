import java.util.*;
public class satu{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
	String nama;
	String alamat;
	System.out.print("Berapa banyak hobimu: ");
		int akeh = Integer.parseInt(input.nextLine());
	String hobi[] = new String[akeh];
	String sekolah;
	String jurusan;
	boolean status = ;
	
	System.out.print("Nama : "); 
	nama = input.nextLine();
	System.out.print("Alamat : "); 
	alamat = input.nextLine();
	System.out.print("Sekolah : "); 
	sekolah = input.nextLine();
	System.out.print("Jurusan : "); 
	jurusan = input.nextLine();
	
	
	for (int i = 0; i < hobi.length; i++) {
			System.out.print("hobi " + (i+1) + " : ");
		        hobi[i] = input.nextLine();
		}
	do {
    try {
        System.out.print("Apakah kamu sudah menikah(true/false)?");
        Scanner n = new Scanner(System.in);
                boolean bn = n.nextBoolean();
                if (bn == true) {
                    System.out.println("Sudah");
                } else if (bn == false) {
                    System.out.println("Belum");
                }

    } catch (InputMismatchException e) {
        System.out.println("Tidak ada!");
    }
} while (!status);
		    
		
	
	
	System.out.print("nama saya :"+ nama); 
		System.out.print("	alamat saya :"+ alamat); 
	for (int i = 0; i < hobi.length; i++) {
			System.out.print("	hobi " + (i+1) + " : ");
		        System.out.print(hobi[i] + "\n");
		}
			System.out.print("asal sekolah saya :"+ sekolah); 
		System.out.print("	jurusan saya :"+ jurusan);
}
}