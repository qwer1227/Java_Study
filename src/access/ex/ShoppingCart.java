package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;
    private int total =0;

    void addItem(Item item) {
        items[itemCount++] = item;
    }

    void displayItems(){
        System.out.println("장바구니 상품 출력");
        for(int i = 0; i < itemCount; i++) {
            total += items[i].getPrice()*items[i].getQuantity();
            System.out.println("상품명 : " + items[i].getName() + ",합계 : " + items[i].getPrice()*items[i].getQuantity());
        }
        System.out.println("전체 가격 합 : " + total);
    }


}
