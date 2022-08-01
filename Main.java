import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        String un, pass, cevap, yenipass;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        un = inp.nextLine();

        System.out.print("Şifreniz: ");
        pass = inp.nextLine();

        if (un.equals("patika") && pass.equals("java123")){
            System.out.println("Giriş Başarılı");
        }
        else{
            System.out.print("Kullanıcı Bilgileri Yanlış\nŞifrenizi Yenilemek İster misiniz?\nE/H: ");
            cevap = inp.nextLine();
            
            if(cevap.equals("e")){
                System.out.println("Yeni Şifre Giriniz: ");
                yenipass = inp.nextLine();
    
                if (yenipass.equals("java123")){
                    System.out.print("Şifreniz Öncekiyle Aynı Olamaz!");
                }
                else{
                    System.out.println("Şifreniz Güncellendi!");
                }
            }

            else if (cevap.equals("h")){
                System.out.println("Program Sonlandırılıyor!");
            }
            
        }

    }
}