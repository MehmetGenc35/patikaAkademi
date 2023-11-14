package pratik;

import java.util.Scanner;

/*
Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
 */
public class HipotenüsHesaplama {

    public static void main(String[] args) {
/*
        //Hipotenüs hesaplama

        Scanner inp =new Scanner(System.in);
        System.out.print("Üçgenin dik kenarlarından birincisini giriniz: ");
        double a=inp.nextDouble();
        System.out.print("Üçgenin dik kenarlarından birincisini giriniz: ");
        double b=inp.nextDouble();

        double hipotenüs= Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("Hipotenüs: "+ hipotenüs);
*/

        //Alan Hesaplama

        Scanner inp =new Scanner(System.in);
        System.out.print("Üçgenin kenarlarından birincisini giriniz: ");
        double a=inp.nextDouble();
        System.out.print("Üçgenin kenarlarından birincisini giriniz: ");
        double b=inp.nextDouble();
        System.out.print("Üçgenin kenarlarından birincisini giriniz: ");
        double c=inp.nextDouble();

        double u=(a+b+c)/2;

        double ilkasama= u*(u-a)*(u-b)*(u-c);
        double alan= Math.sqrt(ilkasama);

        System.out.print("kenarları verilen üçgenin alanı: "+alan+" cm karedir");












    }





}
