public class Main
{
    public static void main(String[] args)
    {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6Ext();
        Task7Ext();
    }
    public static void Task1()
    {
        System.out.println("Задача 1");

        char clientOS = 1;

        if(clientOS == 0)
        {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else
        {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
    }
    public static void Task2()
    {
        System.out.println("Задача 2");
        int yearProduction = 2014;
        char clientOS = 1;

        if (yearProduction < 2015 && clientOS == 0)
        {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (yearProduction >= 2015 && clientOS == 0)
        {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (yearProduction < 2015 && clientOS == 1)
        {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else
        {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
    }
    public static void Task3()
    {
        System.out.println("Задача 3");

        int year = 1600;

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
        {
            System.out.println(year + " год является високосным");
        }
        else
        {
            System.out.println(year + " год не является високосным");
        }

        System.out.println();
    }
    public static void Task4()
    {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance <= 20)
        {
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else if (deliveryDistance > 20 && deliveryDistance <=60)
        {
            deliveryTime += 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else if (deliveryDistance > 60 && deliveryDistance <=100)
        {
            deliveryTime += 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else
        {
            System.out.println("Доставки нет");
        }
        System.out.println();
    }
    public static void Task5()
    {
        System.out.println("Задача 5");

        int monthOfYear = 12;

        switch(monthOfYear)
        {
            case 1:
            case 2:
            case 12 :
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
        System.out.println();
    }
    public static void Task6Ext()
    {
        System.out.println("Задача 6 повышенная сложность");
        int age = 19;
        int salary = 58_000;
        double limit;
        if(age >= 23)
        {
            limit = salary * 3;
        }
        else
            limit = salary * 2;

        if(salary >= 80_000)
        {
            limit *= 1.5;
        }
        else if(salary >= 50_000)
        {
            limit *= 1.2;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
        System.out.println();
    }

    public static void Task7Ext()
    {
        System.out.println("Задача 7 повышенная сложность");
        int age = 25;
        int salary = 60_000;
        int wantedSum = 330_000;
        boolean creditAprove = true;
        double creditRate = 0.1;

        if(age < 23)
        {
            creditRate += 0.01;
        }
        else if(age < 30)
        {
            creditRate += 0.005;
        }
        if(salary > 80_000)
        {
            creditRate -= 0.007;
        }
        double monthlyMaxPay = salary/2;
        double monthlyPay = (wantedSum + wantedSum * creditRate)/12;

        if(monthlyMaxPay >= monthlyPay)
        {
            creditAprove = true;
        }
        else
        {
            creditAprove = false;
        }

        if (creditAprove)
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + monthlyMaxPay + " рублей. Платеж по кредиту " + monthlyPay + " рублей. Одобрено");
        else
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + monthlyMaxPay + " рублей. Платеж по кредиту " + monthlyPay + " рублей. Отказано");


    }
}