package com.lviv.iot.lab1;

public class PromoItem {

    private static int numberOfPromoItems;
    protected String idItem;
    protected String department;
    
    private int promoPrice;
    private String itemName;
    private int firstPrice;
    private String market;
    private String PromoItemType;


    public PromoItem() {
        this(null, 0, 0, null, null, null, null);

    }

    public PromoItem(String mmarket, int mfirstPrice, int mpromoPrice, String mitemName) {
        this(mmarket, mfirstPrice, mpromoPrice, mitemName, null, null, null);
    }

    public PromoItem(String mmarket, int mfirstPrice, int mpromoPrice, String mitemName,
                    String midItem, String mPromoItemType, String mdepartment) {
        market = mmarket;
        promoPrice = mpromoPrice;
        itemName = mitemName;
        firstPrice = mfirstPrice;
        idItem = midItem;
        PromoItemType = mPromoItemType;
        department = mdepartment;
        numberOfPromoItems++;
    }

    public static void printStaticField() {
        System.out.println(numberOfPromoItems);
    }

    public static int getNumberOfPromoItems() {
        return numberOfPromoItems;
    }

    public static void setNumberOfPromoItems(int numberOfPromoItems) {
        PromoItem.numberOfPromoItems = numberOfPromoItems;
    }

    public String toString() {
        return "Info about this PromoItem: \n Manufacturer name: " + itemName +
                "\n Model name: " + idItem + "\n PromoItem type: " + PromoItemType + "\n First price: "
                + firstPrice + "\n Department: " + department + "\n Promo price: "
                + promoPrice + "\n Market: " + market + "\n";
    }

    public void resetVslues(String mmarket, String mdepartment, int mpromoPrice, String mitemName,
                            String midItem, String mPromoItemType, int mfirstPrice) {
        if (market != null && department != null && promoPrice != 0 && itemName != null &&
                idItem != null && PromoItemType != null && firstPrice != 0) {
            numberOfPromoItems++;
        }
        market = mmarket;
        promoPrice = mpromoPrice;
        itemName = mitemName;
        PromoItemType = mPromoItemType;
        idItem = midItem;
        firstPrice = mfirstPrice;
        department = mdepartment;
    }

    public void printField() {
        System.out.println(numberOfPromoItems);

    }

    public String getPromoItemType() {
        return PromoItemType;
    }

    public void setPromoItemType(String PromoItemType) {
        this.PromoItemType = PromoItemType;
    }

    public String getmarket() {
        return market;
    }

    public void setmarket(String market) {
        this.market = market;
    }

    public String getidItem() {
        return idItem;
    }

    public void setidItem(String idItem) {
        this.idItem = idItem;
    }

    public int getfirstPrice() {
        return firstPrice;
    }

    public void setfirstPrice(int firstPrice) {
        this.firstPrice = firstPrice;
    }

    public int getpromoPrice() {
        return promoPrice;
    }

    public void setpromoPrice(int promoPrice) {
        this.promoPrice = promoPrice;
    }

    public String getdepartment() {
        return department;
    }

    public void setdepartment(String department) {
        this.department = department;
    }

    public String getitemName() {
        return itemName;
    }

    public void setitemName(String itemName) {
        this.itemName = itemName;
    }
}