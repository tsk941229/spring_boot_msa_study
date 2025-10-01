package com.springtour.example.test01;

public class PizzaStore {

    private final Delivery delivery;

    public PizzaStore(Delivery delivery) {
        this.delivery = delivery;
    }

    public void orderPizza(String pizza) {
        System.out.println(pizza + "주문완료!");
        delivery.deliver();
    }

}
