package subType_superType_Override;

public class JacketItem extends  ClothingItem{
    @Override
    int getPrice() {
        return 25;
    }

    @Override
    String getName() {
        return "Jacket";
    }
}
