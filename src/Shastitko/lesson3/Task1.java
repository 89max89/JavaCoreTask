package Shastitko.lesson3;

public class Task1 {
    public static void main(String[] args) {

        int rondom=29;
        int number=rondom/10;


        if (rondom>= 0) {
            System.out.println(" число положительное" );}
        else System.out.println(" число отрицательное" );

        if (number < 1){
            number=number*-1;
        }

        if (number < 1 ) {
            System.out.println(" однозначное" );
            number=number/10;}
        else   if (  number < 1){
            System.out.println(" двухзначное " );
            number=number/10;}
        else if (number < 1){
            System.out.println(" трехзначное " );}



        }




    }


