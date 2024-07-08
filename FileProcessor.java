/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author  Irfan aria putra
 *          2301092021
 *          Manajemen Informatika 1-C
 */
// impor kelas yang dibutuhkan untuk operasi file
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileProcessor {
    // "processFile" method yang memproses file sourcefile dan mengganti spasi menjadi
    // underscore pada file destinationfile
    public static void processFile(String sourceFile, String destinationFile) {
        File inputFile = new File(sourceFile);
        File outputFile = new File(destinationFile);

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // mengubah spasi menjadi underscore
                String modifiedLine = line.replace(' ', '_');
                writer.write(modifiedLine);
                writer.newLine();
            }

            System.out.println("File processing completed successfully!");

        } catch (IOException e) {
            System.err.println("An error occurred during file processing: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java FileProcessor <sourceFile> <destinationFile>");
            return;
        }

        String sourceFile = args[0];
        String destinationFile = args[1];

        processFile(sourceFile, destinationFile);
    }
    /*
    Cara untuk menggunakan program ini
    1. simpan program ini dalam format 'java'
    
    2. buat 2 file dengan format txt.
    - satu bernama "sourceFile", ini akan menjadi file.txt yang akan di konversikan
    spasi( ) dalam file tersebut menjadi underscore(_),dapat diisikan dengan karakter 
    apapun asalkan ada spasi untuk membuktikan bahwa program ini berjalan atau tidak
    - untuk file kedua bernama "destinationFile", dimana hasil dari konversi
    sourceFile akan disimpan pada file ini, jadi file ini dapat dikosongkan saja.
    - lalu simpan kedua file ini pada lokasi yang sama dengan file program 
    "FileProcessor.java" 
    
   4. buka command prompt lalu pindahkan direktori sesuai dengan dimana program 
    ini disimpan misalkan seperti saya menyimpan pada Drive D :
    "C:\Users\MyBook 14F> cd D:\ipan\PBO_2301092021\src"
    "C:\Users\MyBook 14F> D:"
   
    3. lalu kompilasi file pada command prompt dengan perintah 
    "javac FileProcessor.java"
    
    4. jalankan program dengan perintah 
    "java fileProcessor sourceFile.txt destinationFile.txt"
    
    5. Lalu periksa "destinationFile.txt" apakah program ini sudah 
    berjalan atau tidak
    */
}