package Week5.Hw_PatikaStore;

import java.util.List;
import java.util.Scanner;

public class ProductActions {
    Scanner input = new Scanner(System.in);

    public void activity(List<ProductManager> productList) {
        boolean activityFlag = true;
        while (activityFlag) {
            System.out.println("""
                    Lütfen yapmak istediğiniz işlemi seçiniz:
                    1-Ürün ekleme
                    2-Ürün silme
                    3-Ürün listeleme
                    4-Filtreleme ile ürün listeleme
                    0-Çıkış yapma""");

            int choose = input.nextInt();

            switch (choose) {
                case 1 -> addProduct(productList);
                case 2 -> deleteProduct(productList);
                case 3 -> listProducts(productList);
                case 4 -> searchByFilter(productList);
                case 0 -> activityFlag = false;
                default -> System.out.println("Lütfen geçerli bir işlem giriniz: ");
            }
        }
    }

    public void addProduct(List<ProductManager> productList) {
        System.out.print("Lütfen ürünün adını giriniz: ");
        input.nextLine();
        String name = input.nextLine();

        System.out.print("Lütfen ürünün fiyatını giriniz: ");
        double unitPrice = input.nextDouble();

        System.out.print("Lütfen ürünün indirim oranını giriniz ");
        double discountRate = input.nextDouble();

        System.out.print("Lütfen ürünün stok adedini giriniz: ");
        int stockAmount = input.nextInt();

        Brand brand = null;
        boolean status = true;

        while (status) {
            System.out.print("Lütfen ürünün markasını giriniz: ");
            String brandOfProduct = input.nextLine();
            for (Brand b : Brand.brands) {
                if (b.getName().equals(brandOfProduct)) {
                    brand = b;
                    status = false;
                }
            }
        }

        System.out.print("Lütfen ürünün hafıza kapasitesinin giriniz: ");
        int memory = input.nextInt();

        System.out.print("Lütfen ürünün ekran boyutunu giriniz: ");
        float screenSize = input.nextFloat();

        System.out.print("Lütfen ürünün batarya gücünü giriniz: ");
        int battery = input.nextInt();

        System.out.print("Lütfen ürünün ram miktarını giriniz: ");
        int ram = input.nextInt();

        System.out.print("Lütfen ürünün rengini giriniz ");
        input.nextLine();
        String color = input.nextLine();

        ProductManager newProduct = new ProductManager(name, unitPrice, discountRate, stockAmount,
                brand, memory, screenSize, battery, ram, color);
        productList.add(newProduct);

    }

    public void deleteProduct(List<ProductManager> productList) {
        System.out.print("Lütfen silmek istediğiniz ürünün id'sini giriniz: ");
        int id = input.nextInt();

        if (productList.get(id) == null) {
            System.out.println("Bu id değerine sahip ürün yoktur.");
        } else {
            System.out.println(id + " ID numaralı ürün silinmiştir.");
            productList.remove(id);
        }
    }

    public void listProducts(List<ProductManager> productList) {
        String format = "| %-8s | %-30s | %-22s | %-12s | %-22s | %-25s | %-16s | %-22s | %-22s | %-16s | %-22s |\n";
        System.out.format("+----------+--------------------------------+------------------------+--------------+------------------------+---------------------------+------------------+------------------------+------------------------+------------------+------------------------+\n");
        System.out.format("| ID       | Ürün Adı                       | Marka                  | Ekran Boyutu | Batarya Kapasitesi     | Depolama Kapasitesi       | RAM Kapasitesi   | Renk                   | Fiyat                  | Adet             | İndirim Oranı          |\n");
        System.out.format("+----------+--------------------------------+------------------------+--------------+------------------------+---------------------------+------------------+------------------------+------------------------+------------------+------------------------+\n");
        for (ProductManager product:productList)
        {
            System.out.format(format, product.getProductId(), product.getName(), product.getBrand().getName(), product.getScreenSize(), product.getBattery(), product.getMemory(), product.getRam(), product.getColor(), product.getUnitPrice(), product.getStockAmount(), product.getDiscountRate());
            System.out.format("+----------+--------------------------------+------------------------+--------------+------------------------+---------------------------+------------------+------------------------+------------------------+------------------+------------------------+\n");
        }
    }

    public void searchByFilter(List<ProductManager> productList) {
        System.out.println("Filtrele: ");
        input.nextLine();
        String filter=input.nextLine();

        if (filter.matches("\\d+"))
        {
            int  ourFilter=Integer.parseInt(filter);
            if (productList.get(ourFilter)!=null)
            {
                ProductManager product=productList.get(ourFilter);
                String format = "| %-8s | %-30s | %-22s | %-12s | %-22s | %-25s | %-16s | %-22s | %-22s | %-16s | %-22s |\n";
                System.out.format("+----------+--------------------------------+------------------------+--------------+------------------------+---------------------------+------------------+------------------------+------------------------+------------------+------------------------+\n");
                System.out.format("| ID       | Ürün Adı                       | Marka                  | Ekran Boyutu | Batarya Kapasitesi     | Depolama Kapasitesi       | RAM Kapasitesi   | Renk                   | Fiyat                  | Adet             | İndirim Oranı          |\n");
                System.out.format("+----------+--------------------------------+------------------------+--------------+------------------------+---------------------------+------------------+------------------------+------------------------+------------------+------------------------+\n");
                System.out.format(format, product.getProductId(), product.getName(), product.getBrand().getName(), product.getScreenSize(), product.getBattery(), product.getMemory(), product.getRam(), product.getColor(), product.getUnitPrice(), product.getStockAmount(), product.getDiscountRate());
                System.out.format("+----------+--------------------------------+------------------------+--------------+------------------------+---------------------------+------------------+------------------------+------------------------+------------------+------------------------+\n");
            }
            else
            {
                System.out.println("Bu id numarasına sahip ürün bulunamadı");
            }


        }
        else if(filter.matches("\\D+"))
        {
            if (productList.stream().anyMatch(p->p.getBrand().getName().equals(filter)))
            {
                for (ProductManager product:productList)
                {
                    if (product.getBrand().getName().equals(filter))
                    {
                        String format = "| %-8s | %-30s | %-22s | %-12s | %-22s | %-25s | %-16s | %-22s | %-22s | %-16s | %-22s |\n";
                        System.out.format("+----------+--------------------------------+------------------------+--------------+------------------------+---------------------------+------------------+------------------------+------------------------+------------------+------------------------+\n");
                        System.out.format("| ID       | Ürün Adı                       | Marka                  | Ekran Boyutu | Batarya Kapasitesi     | Depolama Kapasitesi       | RAM Kapasitesi   | Renk                   | Fiyat                  | Adet             | İndirim Oranı          |\n");
                        System.out.format("+----------+--------------------------------+------------------------+--------------+------------------------+---------------------------+------------------+------------------------+------------------------+------------------+------------------------+\n");
                        System.out.format(format, product.getProductId(), product.getName(), product.getBrand().getName(), product.getScreenSize(), product.getBattery(), product.getMemory(), product.getRam(), product.getColor(), product.getUnitPrice(), product.getStockAmount(), product.getDiscountRate());
                        System.out.format("+----------+--------------------------------+------------------------+--------------+------------------------+---------------------------+------------------+------------------------+------------------------+------------------+------------------------+\n");
                    }
                }
            }
            else
            {
                System.out.println("Belirtilen marka ile eşleşen bir ürün bulunamadı");
            }
        }
        else
        {
            System.out.println("Filtreleme id veya markaya göre yapılıyor lütfen bu değerlerden birini giriniz");
        }
    }
}
