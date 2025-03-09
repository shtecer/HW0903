public class Main {
    public static void main(String[] args) {

        int age = 24;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }

        int outTemp = 10;
        if (outTemp < 5) {
            System.out.println("На улице " + outTemp + " градусов, нужно надеть шапку");
        }
        else {
            System.out.println("На улице " + outTemp + " градусов, можно идти без шапки");
        }

        int speed = 62;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        if (age >= 2 && age <=6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        else {
            if (age >= 7 && age <= 17) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
            } else {
                if (age >= 18 && age <= 24) {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
                } else {
                    if (age > 24) {
                        System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
                    }
                }
            }
        }

        int kidaAge = 15;
        boolean parents = false;
        if (kidaAge < 5) {
            System.out.println("Если возраст ребенка равен " + kidaAge + ", то ему нельзя кататься на аттракционе");
        }
        else {
            if (kidaAge >= 5 && kidaAge < 14) {
                if (parents == true) {
                    System.out.println("Если возраст ребенка равен " + kidaAge + ", то он может кататься только в сопровождении взрослого");
                } else {
                    System.out.println("Если возраст ребенка равен " + kidaAge + ", и взрослого нет, то кататься нельзя");
                }
            }
                else {
                    System.out.println("Если возраст ребенка равен " + kidaAge + ", может кататься без сопровождения взрослого");
                }
            }

        int peoples = 108;
        if (peoples >= 102) {
            System.out.println("Вагон уже полностью забит");
        }
        else {
            if (peoples >= 60) {
                System.out.println("В вагоне остались только стоячие места");
            }
            else {
                System.out.println("В вагоне имеются сидячие места");
            }
        }
        int one = 5;
        int two = 8 ;
        int three = 3;
        if (one > two) {
            if (one > three) {
                System.out.println(one);
            }
            else {
                System.out.println(two);
            }
        }
        else {
            if (two > three) {
                System.out.println(two);
            }
            else {
                System.out.println(three);
            }
        }
    }
}
