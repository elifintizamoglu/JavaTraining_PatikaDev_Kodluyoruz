package Week5.Hw_PatikaStore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Brand{
    private static int BRAND_ID = 1;
    private final int brandId;
    private String name;

    public static List<Brand> brands =new ArrayList<>();

    public Brand(String name) {
        this.name = name;
        this.brandId = BRAND_ID++;
    }

    public int getBrandId() {
        return brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static
    {
        brands.add(new Brand("Samsung"));
        brands.add(new Brand("Lenovo"));
        brands.add(new Brand("Apple"));
        brands.add(new Brand("Huawei"));
        brands.add(new Brand("Casper"));
        brands.add(new Brand("Asus"));
        brands.add(new Brand("HP"));
        brands.add(new Brand("Xiaomi"));
        brands.add(new Brand("Monster"));
        brands.sort(Comparator.comparing(Brand::getName));
    }
}
