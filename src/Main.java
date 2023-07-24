import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int a = 10; a > 0; a = a - 1) {
            System.out.println(a);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int s = 0; s <= 17; s = s + 2) {
            System.out.println(s);
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int t = 10; t >= -10; t = t - 1) {
            System.out.println(t);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        for (int d = 1904; d <= 2096; d = d + 4) {
            System.out.println(d + " год являетсяь високосным");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int e = 7; e <= 98; e = e + 7) {
            System.out.println(e);
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int z = 1; z <= 512; z = z * 2) {
            System.out.println(z);
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " Сумма накопления равна " + total);
        }


    }

    public static void task9() {
        System.out.println("Задача 9");
        int salary = 29000;
        double salaryWithProcents = salary + salary /100;
        double total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + salaryWithProcents;
            System.out.println("Месяц " + i + " Сумма накопления равна " + total);

        }

    }
    public static void task10(){
        System.out.println("Задача 10");
        int  i = 2;
        for (int j = 1; j<=10; j++) {
                System.out.println(i + "*" + j + " = " + (i*j));
            }
        }
}





