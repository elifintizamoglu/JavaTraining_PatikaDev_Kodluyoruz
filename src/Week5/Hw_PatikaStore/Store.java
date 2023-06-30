package Week5.Hw_PatikaStore;

import java.util.Scanner;

public class Store {
    Scanner input = new Scanner(System.in);
    ProductActions productActions=new ProductActions();

    public void run() {
        System.out.println("-----Patika Store Ürün Yönetim Paneli-----");
        boolean flag = true;
        while (flag) {
            System.out.println("""
                    Lütfen yapacağınız işlemi seçiniz:
                    1-NoteBook İşlemleri
                    2-Cep Telefonu İşlemleri
                    3-Marka Listeleme
                    0-Çıkış""");
            System.out.print("Tercihiniz: ");
            int choose = input.nextInt();
            switch (choose) {
                case 1 -> productActions.activity(Notebook.notebooks);
                case 2 -> productActions.activity(CellPhone.cellPhones);
                case 3 -> listBrand();
                case 0 -> flag = false;
            }

        }
    }

    public void listBrand(){
        System.out.println("----------------");
        System.out.println("Markalar: ");
        for(Brand brand: Brand.brands){
            System.out.println(brand.getName());
        }
        System.out.println("----------------");
    }

}
