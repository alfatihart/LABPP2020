import java.io.*;
import java.util.Scanner;


class TPP8Nomor03 {
	//Main method
	public static void main(String[] args) {
		System.out.println("\n----------Program Write dan Read File----------\n");
		Scanner scan = new Scanner(System.in);

		System.out.print("Input fileName: ");
		String fileName = scan.next();
		fileName += ".txt";

		writeTo(scan, fileName);

		readFrom(fileName);

	}

	public static void writeTo(Scanner scanner, String fileName) {
		System.out.print("\n----------Write File----------\n");
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;

		try {
			fileWriter = new FileWriter(fileName);
			bufferedWriter = new BufferedWriter(fileWriter);

			System.out.print("\nInput jumlah data: ");
			int n = scanner.nextInt();

			System.out.println("\nInput data (Nama, Nim, Angkatan): ");
			String[] name = new String[n];
			String[] nim = new String[n];
			String[] angkatan = new String[n];

			bufferedWriter.write("+------------------------+---------------+------------+");
			bufferedWriter.newLine();
			bufferedWriter.write("|          Nama          |      NIM      |  Angkatan  |");
			bufferedWriter.newLine();
			bufferedWriter.write("+------------------------+---------------+------------+");
			bufferedWriter.newLine();
 

				for (int i = 0 ; i < n ; i++) {
					name[i] = scanner.next();
					nim[i] = scanner.next();
					angkatan[i] = scanner.next();

					String text = String.format("| %-22s | %-13s | %-10s |", name[i], nim[i], angkatan[i]);
					bufferedWriter.write(text);
					bufferedWriter.newLine();
				}

			bufferedWriter.write("+------------------------+---------------+------------+");

			System.out.println("\nBerhasil menulis file!");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				bufferedWriter.close();
				fileWriter.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}


	public static void readFrom(String sourceFile) {
		System.out.print("\n----------Read File----------\n");
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile))) {
			String str = new String();
			System.out.println();

			while ((str = bufferedReader.readLine()) != null) {
				System.out.println(str);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}


}