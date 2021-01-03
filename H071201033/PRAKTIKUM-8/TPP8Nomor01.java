import java.io.*;
import java.util.Scanner;

class TPP8Nomor01 {
	//Main method
	public static void main(String[] args) {
		System.out.println("\n----------Program Copy File----------\n");
		Scanner scan = new Scanner(System.in);

		System.out.print("Input fileNameInputCopy: ");
		String fileNameInput = scan.next();
		fileNameInput += ".txt";

		System.out.print("Input fileNameOutputCopy: ");
		String fileNameOutput = scan.next();
		fileNameOutput += ".txt";

		CopyFile(fileNameInput, fileNameOutput);

	}

	//Method copyFile IO
	public static void CopyFile(String fileNameInput, String fileNameOutput) {
		System.out.println("\n----------Copy File----------\n");
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileNameInput))) {
			String str = new String();

			try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileNameOutput, true))) {

				while ((str = bufferedReader.readLine()) != null) {
					System.out.println(str);
					bufferedWriter.write(str);
					bufferedWriter.newLine();
				}

			System.out.println("\nBerhasil Menyalin file!");


			} catch (Exception e) {
				System.out.println("Gagal menyalin file!\n" + e);
				
			}
	

		} catch (Exception e) {
			System.out.println("Gagal menyalin file!\n" + e);
			
		}



	}
   

}