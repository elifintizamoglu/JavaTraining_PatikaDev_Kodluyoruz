package Week1;
import java.util.Scanner;
public class FindZodiacSign {
    public static void main(String[] args) {
        int month,day;
        
        Scanner input= new Scanner(System.in);
        

        System.out.print("Enter your birth month: ");
        month = input.nextInt();
        System.out.print("Enter your birth day: ");
        day=input.nextInt();

        if(month==1){
            if(1<=day && day<=21 ){
                System.out.print("OĞLAK BURCU");
            }
            else if (21<day) {
                System.out.print("KOVA BURCU");
            }
        }
        if(month==2){
            if(1<=day && day<=19 ){
                System.out.print("KOVA BURCU");
            }
            else if (19<day) {
                System.out.print("BALIK BURCU");
            }
        }
        if(month==3){
            if(1<=day && day<=20 ){
                System.out.print("BALIK BURCU");
            }
            else if (20<day) {
                System.out.print("KOÇ BURCU");
            }
        }
        if(month==4){
            if(1<=day && day<=20 ){
                System.out.print("KOÇ BURCU");
            }
            else if (20<day) {
                System.out.print("BOĞA BURCU");
            }
        }
        if(month==5){
            if(1<=day && day<=21 ){
                System.out.print("BOĞA BURCU");
            }
            else if (21<day) {
                System.out.print("İKİZLER BURCU");
            }
        }

        if(month==6){
            if(1<=day && day<=22 ){
                System.out.print("İKİZLER BURCU");
            }
            else if (22<day) {
                System.out.print("YENGEÇ BURCU");
            }
        }

        if(month==7){
            if(1<=day && day<=22 ){
                System.out.print("YENGEÇ BURCU");
            }
            else if (22<day) {
                System.out.print("ASLAN BURCU");
            }
        }
        if(month==8){
            if(1<=day && day<=22 ){
                System.out.print("ASLAN BURCU");
            }
            else if (22<day) {
                System.out.print("BAŞAK BURCU");
            }
        }
        if(month==9){
            if(1<=day && day<=22 ){
                System.out.print("BAŞAK BURCU");
            }
            else if (22<day) {
                System.out.print("TERAZİ BURCU");
            }
        }
        if(month==10){
            if(1<=day && day<=22 ){
                System.out.print("TERAZİ BURCU");
            }
            else if (22<day) {
                System.out.print("AKREP BURCU");
            }
        }
        if(month==11){
            if(1<=day && day<=21 ){
                System.out.print("AKREP BURCU");
            }
            else if (21<day) {
                System.out.print("YAY BURCU");
            }
        }
        if(month==12){
            if(1<=day && day<=21 ){
                System.out.print("YAY BURCU");
            }
            else if (21<day) {
                System.out.print("OĞLAK BURCU");
            }
        }

    }
}
