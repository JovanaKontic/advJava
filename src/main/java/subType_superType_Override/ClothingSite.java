package subType_superType_Override;

import java.util.ArrayList;
import java.util.List;

public class ClothingSite {
    public static void main(String[] args) {
        ShirtItem newShirt = new ShirtItem();
        ShirtItem newShirt1 = new ShirtItem();
   //     checkoutItem(newShirt);
   //     JacketItem newJacket = new JacketItem();
   //     checkoutItem(newJacket);

        List<ShirtItem> myClothes = new ArrayList<>();
  //      myClothes.add(newJacket);
        myClothes.add(newShirt);
        myClothes.add(newShirt1);

        checkOutAllItems(myClothes);
    }

    static void checkoutItem(ClothingItem item) {
        System.out.println("Item purchased: " + item.getName() + ", price: " + item.getPrice());
    }

    /*** static void checkOutAllItems(List <ClothingItem> myNewCloths) {
        for (ClothingItem cloths: myNewCloths) {
            checkoutItem(cloths);
        }
    } ***/

    // AKO  ZELIMO DA NAM NE ZAVISI OD SUPERTIPA ONDA KORISTIMO WILDCARDS

    static void checkOutAllItems(List <? extends ClothingItem> myNewCloths) {
        for (ClothingItem cloths: myNewCloths) {
            checkoutItem(cloths);
        }
    }

}
