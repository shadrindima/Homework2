public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        byte sekond = 60;
        short minute = 24;
        int hour = 24;
        long day = 365;
        float month = 3;
        double nothing = 0;
        boolean bu = 5>6;
        char c = 0;
        double weightOfQneBoxer = 78.2;
        double weightOfSekondBoxer = 82.7;
        double totalWeight = weightOfQneBoxer + weightOfSekondBoxer;
        double differenceWeight = Math.abs(weightOfQneBoxer - weightOfSekondBoxer);
        System.out.println("Общий вес боксеров кг " + totalWeight);
        System.out.println("Разница в весе боксеров кг " + differenceWeight);
        double banana = 5;
        double weigtBanana = banana * 80;
        System.out.println ("Общий вес бананов " + weigtBanana);
        double milk = 200;
        double weigtMilk = milk * 1.05;
        System.out.println ("Общий вес молока " + weigtMilk);
        double iceСream = 2;
        double weigtIceСream = iceСream * 100;
        System.out.println ("Общий вес мороженого " + weigtIceСream);
        double eggs = 4;
        double weigtEggs = eggs * 70;
        System.out.println ("Общий вес яиц " + weigtEggs);
        double totalWeightGramm = weigtBanana + weigtMilk + weigtIceСream + weigtEggs;
        System.out.println ("Общий вес в граммах " + totalWeightGramm);
        double totalWeightKilogramm = totalWeightGramm * 0.001;
        System.out.println ("Общий вес в килограммах " + totalWeightKilogramm);
        double loseWeight = 7;
        double fastWeightLoss = 0.5;
        double slowWeightLoss = 0.25;
        double daysFastWeightLoss = loseWeight / fastWeightLoss;
        System.out.println ("Количество дней для быстрого похудения кг " + daysFastWeightLoss);
        double daysSlowWeightLoss = loseWeight / slowWeightLoss;
        System.out.println ("Количество дней для медленого похудения кг " + daysSlowWeightLoss);
        double daysWeightLoss = (daysFastWeightLoss + daysSlowWeightLoss) / 2;
        System.out.println ("Среднее количество дней для похудения кг " + daysWeightLoss);
        int Masha = 67760;
        double prizeMasha = Masha * 1.1;
        System.out.println ("Маша теперь получает рублей " + (int)prizeMasha);
        double yearPrizeMasha = prizeMasha * 12;
        double yearMasha = Masha * 12;
        double incomeDifferenceMasha =  yearPrizeMasha - yearMasha;
        System.out.println ("Годовой доход Маши вырос рублей " + (int)incomeDifferenceMasha);
        int Denis = 83690;
        double prizeDenis = Denis * 1.1;
        System.out.println ("Денис теперь получает рублей " + (int)prizeDenis);
        double yearPrizeDenis = prizeDenis * 12;
        double yearDenis = Denis * 12;
        double incomeDifferenceDenis =  yearPrizeDenis - yearDenis;
        System.out.println ("Годовой доход Дениса вырос рублей " + (int)incomeDifferenceDenis);
        int Christina = 76230;
        double prizeChristina = Christina * 1.1;
        System.out.println ("Кристина теперь получает рублей " + (int)prizeChristina);
        double yearPrizeChristina = prizeChristina * 12;
        double yearChristina = Christina * 12;
        double incomeDifferenceChristina =  yearPrizeChristina - yearChristina;
        System.out.println ("Годовой доход Кристины вырос рублей " + (int)incomeDifferenceChristina);





    }
}