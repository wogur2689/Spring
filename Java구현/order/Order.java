package hello.core.order;

public class Order {

    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int discountPrice;

    public Order(Long memberId, String itemNAme, int itemPrice, int discountPrice) {
        this.memberId = memberId;
        this.itemNAme = itemNAme;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }

    public int calculatePrice() {
        return itemPrice - discountPrice;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemNAme() {
        return itemNAme;
    }

    public void setItemNAme(String itemNAme) {
        this.itemNAme = itemNAme;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemNAme='" + itemNAme + '\'' +
                ", itemPrice=" + itemPrice +
                ", discountPrice=" + discountPrice +
                "}";
    }
}
