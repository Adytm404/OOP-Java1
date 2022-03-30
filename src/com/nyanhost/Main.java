package com.nyanhost;

public class Main {
    private static boolean banner;


        public static void main(String[] args) {

            com.nyanhost.Regis Regis1 = new com.nyanhost.Regis();

            Regis1.setName();
            Regis1.setNim();
            Regis1.setPassword();

            System.out.println(banner);
            System.out.println("\nTerimakasih " + Regis1.getName() + " Telah Melakukan Registrasi. \n");
            System.out.println("# Username : " + Regis1.getName());
            System.out.println("# NIM      : " + Regis1.getNim());
            System.out.println("# Password : " + Regis1.getPassword());

        }

}


