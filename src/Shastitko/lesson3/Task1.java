package Shastitko.lesson3;

public class Task1 {
    public static void main(String[] args) {

        int rondom=-19;
        int number=(rondom/10);


        if (number >= 0) {
            System.out.println(" число положительное" );        }
        else System.out.println(" число отрицательное" );

        if (number < 0){
            number=number*-1;
        }

        if (number < 1) {
            System.out.println(" однозначное" );}
        else  number=number/10;

        if (number < 1){
            System.out.println(" двухзначное " );}
        else System.out.println(" трехзначное " );

        }




    }

}
