package vshp.Shaitanov.Block_3;

public class Basket {  // "корзина покупок"

    // оплата наличными
    void  pay(double money) {
        System.out.println("Оплачено наличными: " + money);
    }

    //оплата кредитными картами
    void pay(String cardNum) {
        System.out.println("Оплачено по кредитной карте #" + cardNum);
    }

    //оплата чеком
    void pay(String accountNum, String bankCode) {
        System.out.println("Переведено на счёт #" + accountNum + " в банке " + bankCode);
    }
} //Basket class

