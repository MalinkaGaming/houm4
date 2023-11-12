public class Main {
    public static void main(String[] args) {
        System.out.println("задача № 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен" + age + ",то он совершеннолетний");
        }
        int age1 = 14;
        if (age < 18) {
            System.out.println("он не достиг совершеннолетия" + age1 + ",нужно немного подождать");
        }

        System.out.println("задача № 2");
        int temperature = 2;
        if (temperature < 5) {
            System.out.println("На улице" + temperature +  "градусов, нужно надеть шапку ");
        }
        int temperature1 = 6;
        if (temperature >= 5) {
            System.out.println("На улице" + temperature1 + "можно идти без шапки ");
        }

        System.out.println("задача № 3");
        int speed = 70;
        if (speed >= 60) {
            System.out.println("Если скорость" + speed +", то  придется заплатить штраф");
        } else {
            System.out.println("можно ездить спокойно"+speed);
        }

        System.out.println("задача № 4");
        int age2 =15;
        if (age2 <= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен," + age2 + "то ему нужно ходить в детский  сад ");

        } else if (7 <= age2 && age2 <= 17) {
            System.out.println("Если возраст человека равен," + age2 + "то ему нужно ходить в школу ");
        } else if (18 <= age && age <= 24) {
            System.out.println("Если возраст человека равен," + age2 + "то вы студент университета ");
        } else {
            System.out.println("Вам," + age2 + "то вы работаете");
        }
        System.out.println("задача № 5");
        int years =11;
        if (years <= 5 ) {
            System.out.println("Если возраст ребенка равен" + years + "то он не может кататься на аттракционе");
        } else if (5 <= years && years <= 14) {
            System.out.println("Если возраст ребенка равен" + years + "то он может кататься только в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен" + years + "то он может кататься без сопровождения взрослого");
        }

        System.out.println("задача № 6");
        int passengers =80;
        int passengerCount = 102;
        int seats = 60;
        int standingPlaces= passengerCount - passengers;
        if(standingPlaces >=30){
            System.out.println("есть  место в вагоне" + standingPlaces );
        } else if (50 < standingPlaces ) {
            System.out.println("есть  место в вагоне сидячее" + standingPlaces );
        } else if (11 <= standingPlaces && standingPlaces <= 82 ) {
            System.out.println("есть  место в вагоне стоячее" + standingPlaces );
        } else {
            System.out.println("вагон уже полностью забит" + standingPlaces );
        }

        System.out.println("задача № 7");
        int one = 10;
        int two = 25;
        int three = 2;
        // Сравнение чисел
        if (one > two && one > three) {
            System.out.println("Первое число больше.");
        } else if (two > one && two > three) {
            System.out.println ("Второе число больше.");
        } else if (three > one && three > two) {
            System.out.println ("Третье число больше.");
        } else {
            System.out.println ("Числа равны.");
        }
    }
}