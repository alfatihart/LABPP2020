import java.io.*;
import java.util.Scanner;

class TPP8Nomor02 {
	//Main method
	public static void main(String[] args) {
		System.out.println("\n----------Program Copy dan Read File----------\n");
		Scanner scan = new Scanner(System.in);

		System.out.print("Input fileNameInputStream: ");
		String fileNameInput = scan.next();
		fileNameInput += ".txt";

		System.out.print("Input fileNameOutputStream: ");
		String fileNameOutput = scan.next();
		fileNameOutput += ".txt";

		CopyFile(fileNameInput, fileNameOutput);

		String sourceFile = fileNameOutput;
		readFrom(sourceFile);

	}

	//Method copyFile IO
	public static void CopyFile(String fileNameInput, String fileNameOutput) {
		System.out.println("\n----------Copy File----------\n");
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileNameInput))) {
			String str = new String();

			try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileNameOutput))) {

				while ((str = bufferedReader.readLine()) != null) {
					System.out.println(str);
					bufferedWriter.write(String.format("%100s",str));
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
   
   
    //Method readFrom IO
    public static void readFrom(String sourceFile) {
    	System.out.println("\n----------Read File----------\n");
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile))) {
			String str = new String();

			while ((str = bufferedReader.readLine()) != null) {
				System.out.printf("%50s\n",str);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}