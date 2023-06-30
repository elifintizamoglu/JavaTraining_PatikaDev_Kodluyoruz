package Week5.Hw_PatikaStore;

import java.util.ArrayList;
import java.util.List;

public class CellPhone extends ProductManager {

    public static List<ProductManager> cellPhones = new ArrayList<>();

    public CellPhone(int productId, String name, double unitPrice, double discountRate, int stockAmount,
                     Brand brand, int memory, float screenSize, int battery, int ram, String color) {
        super(name, unitPrice, discountRate, stockAmount, brand, memory, screenSize, battery, ram, color);

        cellPhones.add(this.getProductId(), this);
    }
}
