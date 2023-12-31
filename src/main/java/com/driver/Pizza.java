package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheese;
    private boolean isExtraCheeseAdded;
    private  int extraTopping;
    private boolean isExtraToppingAdded;
    private  int paperBag;
    private  boolean isPaperBagAdded;
    private  int totalPrice;
    private  boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg == true){
            this.price = 300;
            this.extraTopping = 70;
        } else{
            this.price = 400;
            this.extraTopping = 120;
        }
        this.extraCheese = 80;
        this.paperBag = 20;

        this.isExtraCheeseAdded = false;
        this.isExtraToppingAdded = false;
        this.isPaperBagAdded = false;

        totalPrice = price;
        this.bill = "Base Price Of The Pizza: "+totalPrice + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isExtraCheeseAdded == false){
            this.totalPrice += extraCheese;
            isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isExtraToppingAdded== false){
            this.totalPrice += extraTopping;
            isExtraToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isPaperBagAdded == false){
            this.totalPrice += paperBag;
            isPaperBagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated==false){


            if(isExtraCheeseAdded ==true){
                bill = bill + "Extra Cheese Added: "+ extraCheese + "\n";
            }
            if(isExtraToppingAdded==true){
                bill = bill + "Extra Toppings Added: "+extraTopping + "\n";
            }
            if(isPaperBagAdded==true){
                bill = bill + "Paperbag Added: "+paperBag + "\n";
            }

            bill = bill + "Total Price: "+totalPrice + "\n";

            isBillGenerated = true;
        }
        return this.bill;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public int getExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(int extraCheese) {
        this.extraCheese = extraCheese;
    }

    public boolean isExtraCheeseAdded() {
        return isExtraCheeseAdded;
    }

    public void setExtraCheeseAdded(boolean extraCheeseAdded) {
        isExtraCheeseAdded = extraCheeseAdded;
    }

    public int getExtraTopping() {
        return extraTopping;
    }

    public void setExtraTopping(int extraTopping) {
        this.extraTopping = extraTopping;
    }

    public boolean isExtraToppingAdded() {
        return isExtraToppingAdded;
    }

    public void setExtraToppingAdded(boolean extraToppingAdded) {
        isExtraToppingAdded = extraToppingAdded;
    }

    public int getPaperBag() {
        return paperBag;
    }

    public void setPaperBag(int paperBag) {
        this.paperBag = paperBag;
    }

    public boolean isPaperBagAdded() {
        return isPaperBagAdded;
    }

    public void setPaperBagAdded(boolean paperBagAdded) {
        isPaperBagAdded = paperBagAdded;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isBillGenerated() {
        return isBillGenerated;
    }

    public void setBillGenerated(boolean billGenerated) {
        isBillGenerated = billGenerated;
    }
}
