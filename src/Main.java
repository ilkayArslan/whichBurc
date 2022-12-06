import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int month,day;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen doğduğunuz ayı yazınız : ");
        month = input.nextInt();
        System.out.print("Lütfen doğduğunuz günü yazınız : ");
        day=input.nextInt();
        if(month==1){
            if (day<=21){
                System.out.println("Oğlak burcusun");
            }else{
                System.out.println("Kova burcusun");
            }
        }else if(month==2){
            if (day<=19){
                System.out.println("Kova burcusun");
            }else{
                System.out.println("Balık burcusun");
            }
        }else if(month==3){
            if (day<=20){
                System.out.println("Balık burcusun");
            }else{
                System.out.println("Koç burcusun");
            }
        }else if(month==4){
            if (day<=21){
                System.out.println("Koç burcusun");
            }else{
                System.out.println("Boğa burcusun");
            }
        }else if(month==5){
            if (day<=22){
                System.out.println("Boğa burcusun");
            }else{
                System.out.println("İkizler burcusun");
            }
        }else if(month==6){
            if (day<=22){
                System.out.println("İkizler burcusun");
            }else{
                System.out.println("Yengeç burcusun");
            }
        }else if(month==7){
            if (day<=22){
                System.out.println("Yengeç burcusun");
            }else{
                System.out.println("Aslan burcusun");
            }
        }else if(month==8){
            if (day<=22){
                System.out.println("Aslan burcusun");
            }else{
                System.out.println("Başak burcusun");
            }
        }else if(month==9){
            if (day<=22){
                System.out.println("Başak burcusun");
            }else{
                System.out.println("Terazi burcusun");
            }
        }else if(month==10){
            if (day<=22){
                System.out.println("Terazi burcusun");
            }else{
                System.out.println("Akrep burcusun");
            }
        }else if(month==11){
            if (day<=22){
                System.out.println("Akrep burcusun");
            }else{
                System.out.println("Yay burcusun");
            }
        }else if(month==12){
            if (day<=22){
                System.out.println("Yay burcusun");
            }else{
                System.out.println("Oğlak burcusun");
            }
        }else {
            System.out.println("Yanlış bir ay girdiniz");
        }


    }
}