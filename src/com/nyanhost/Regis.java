package com.nyanhost;
import java.util.Scanner;


public class Regis {
    private String Name;
    private String Nim;
    private String Password;
    public String banner =
                    "+------------------------------------------+\n" +
                    "|                 APLIKASI                 |\n" +
                    "|  Pendaftaran Akun Mahasiswa Informatika  |\n" +
                    "+------------------------------------------+\n";
    Scanner input = new Scanner(System.in);


    public void setName(){
        System.out.println(banner);
        System.out.print("# Username : ");
        Name = input.nextLine();
    }


    public void setNim() {
        do {
            System.out.print("# Nim      : ");
            Nim = input.nextLine();
            if (Nim.length() == 15) {
            }
            else{
                System.out.println("\nNIM harus berjumlah 15 angka!\n");
            }
        } while (Nim.length() != 15);


    }

    public void  setPassword(){
        do {
            System.out.print("# Password : ");
            Password = input.nextLine();
            if (Password.length() >= 8){
            }
            else{
                System.out.println("\nPassword haruslah minimal 8 karakter!\n");
            }

        } while (Password.length() < 8);
    }


    //getter Name
    public String getName(){
        return Name;
    }

    //getter Nim
    public String getNim(){
        return Nim;
    }

    //getter Password
    public String getPassword(){
        return Password;
    }

    }
