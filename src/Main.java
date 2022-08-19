public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box = box * 3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);
        var liftingcapaciti = 50;
        var stuffWeight = 20;
        var capacitiLeft = liftingcapaciti - stuffWeight;
        System.out.println("Ещё можно положить " + capacitiLeft + " кг вещей");
        var appleWeight = 2;
        var orangeWeight = 3;
        var fruitWeight = appleWeight + orangeWeight;
        System.out.println("Общий вес фруктов " + fruitWeight);
        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumbersWeight = 2;
        var pepersWeight = 2;
        var zucchiniWeight = 2;
        var vegetablosWeight = tomatoesWeight + cucumbersWeight + pepersWeight + zucchiniWeight;
        var productWeight = vegetablosWeight + fruitWeight + meatWeight+ waterWeight;
        System.out.println("Общий вес продуктов " + productWeight + " кг!");
        var leftWeight = liftingcapaciti - stuffWeight - productWeight;
        System.out.println("Места осталось " + leftWeight + " кг!");
        productWeight = productWeight * 2;
        System.out.println("Теперь вес продуктов " + productWeight);
        leftWeight = liftingcapaciti - stuffWeight - productWeight;
        System.out.println("Теперь места осталось " + leftWeight + " кг!");
        var Overload = (stuffWeight + productWeight) % liftingcapaciti;
        System.out.println("Перегруз на " + Overload + " кг!");
        var productInOneCar = productWeight / 2;
        System.out.println("Продуктов в машине теперь " + productInOneCar);
        short bananas = 200;
        System.out.println("Бананов " + bananas + " кг");
        float sugar = 3;
        float onePortion = sugar / 4;
        System.out.println("Одна порция сахара весит " + onePortion + " кг");
        byte a = 1;
        short b = 1;
        int c = 1;
        int d = a + b + c;
        System.out.println(d);
        float g = a + 1f;
        System.out.println(g);
        System.out.println("Пишем наше ДЗ!");
        System.out.println("Делаем комит и пуш");
        System.out.println("Переходим в гитхаб");





    }
}