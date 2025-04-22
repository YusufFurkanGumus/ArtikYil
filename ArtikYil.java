import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yıl;
        System.out.println("Yıl Giriniz");
        yıl = input.nextInt();
        System.out.println("Seçtiğiniz Yıl ="+yıl);
        //Artık Yıl Nasıl Hesaplanır?
        //
        //Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
        //
        //1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
        //100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:
        //
        //Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.

        if((yıl % 4 ==0 && yıl %100 !=0) || (yıl %400 ==0)){
            System.out.println(yıl+"\nArtık Yıldır!");
        }else{
            System.out.println(yıl+"\nArtık Yıl Değildir!");

        }

    }
}
