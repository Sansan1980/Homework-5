import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        /*
        Задача 1
У банка появилось мобильное приложение. Поэтому теперь, когда пользователь заходит на сайт с телефона,
ему предлагается скачать приложение с учетом того, какая операционная система у пользователя.
Напишите программу, которая определяет, чем пользуется клиент (iOS или Android), и выдает соответствующее сообщение:
Для iOS — «Установите версию приложения для iOS по ссылке».
Для Android — «Установите версию приложения для Android по ссылке».
Объявите переменную clientOS, которая равна 0 или 1 (0 — iOS, 1 — Android).

       */
        System.out.println(" Задача № 1");

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        /*
        Задача 2
Усложним предыдущую задачу. Теперь нам нужно знать не только операционную систему телефона, но и год его создания.
Ваша задача — написать программу, которая выдает соответствующее сообщение клиенту при наличии двух условий.
Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить информацию об облегченной версии:
Для iOS оно будет звучать так: «Установите облегченную версию приложения для iOS по ссылке».
Для Android: «Установите облегченную версию приложения для Android по ссылке».
Для пользователей телефонов 2015 года выпуска и позже нужно вывести обычное предложение об установке приложения.
Для года создания телефона используйте переменную clientDeviceYear, в которой необходимо указать 2015 год.
Важно: вложенность больше двух этажей не допускается (условный оператор внутри условного оператора).
         */
        System.out.println(" Задача № 2");

        clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015) {
            switch (clientOS) {
                case 1:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 0:
                    System.out.println("Установите версию приложения для Android по ссылке ");
                    break;
            }
        } else {
            switch (clientOS) {
                case 1:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 0:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке ");
                    break;
            }
        }

        System.out.println(" Задача № 3");
        /*
        Задача 3
Напишите программу, которая определяет, является ли год високосным или нет.
Переменную года назовите year, в которую можно подставить значение интересующего нас года. Например, 2021.
Программа должна определять, високосный год или нет, и выводить соответствующее сообщение:
 « …. год является високосным» или «... год не является високосным».
Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый.
Также високосным является каждый четырехсотый год. Год должен быть больше, чем 1584 (в котором был введен високосный год).
         */
        int year = 2000;
        int limitYear = 1584;


        if (year >= 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("год " + year + " является високосным !");
        } else {
            System.out.println(" год " + year + " неявляется високосным ! ");
        }

         /*
    Задача 4
В банке для клиентов организовывается доставка карт на дом. Чтобы известить клиента о том, когда будет доставлена его карта,
нужно знать расстояние от офиса до адреса доставки.
Правила доставки такие:
Доставка в пределах 20 км занимает сутки.
Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
Свыше 100 км доставки нет.
То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
Напишите программу, которая выдает сообщение в консоль: "Потребуется дней: " + срок доставки.
Объявите целочисленную переменную  = 95, которая содержит дистанцию до клиента.
     */
       /*
        System.out.println(" Задача №4");
        int deliveryDistance = 120;

        if (deliveryDistance > 100) {
            String time = " Нет доставки !!!";
            System.out.println(" Потребуется дней:" + time);
        }

        if (deliveryDistance <= 20) {
            int time = 1;
            System.out.println(" Потребуется дней:" + time);
        }
        if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            int time = 2;
            System.out.println(" Потребуется дней:" + time);
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            int time = 3;
            System.out.println(" Потребуется дней:" + time);
        }
       */
        System.out.println(" Задача №4");
        int deliveryDistance = 120;
        if (deliveryDistance <= 20) {
            int time = 1;
            System.out.println(" Потребуется дней:" + time);
        } else
        if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            int time = 2;
            System.out.println(" Потребуется дней:" + time);
        } else
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            int time = 3;
            System.out.println(" Потребуется дней:" + time);
        } else
        if (deliveryDistance > 100) {
            String time = " Нет доставки !!!";
            System.out.println(" Потребуется дней:" + time);
        }

         /*
        Задача 5
Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит.
Например, 1-й месяц (он же январь) принадлежит к сезону зима.
Для написания программы используйте оператор switch. Для обозначения номера месяца используйте переменную monthNumber = 12.
Пропишите условие, при котором программа не будет выполняться (номер месяца больше 12).
         */

        System.out.println(" Задача №5");
        int monthNumber = 6;
        switch (monthNumber) {
            case 12, 1, 2:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("неверный номер");
        }

        System.out.println(" Задача  №2");
        // решение задачи №2 из видеолекции
        /*
        Задача 2
Усложним предыдущую задачу. Теперь нам нужно знать не только операционную систему телефона, но и год его создания.
Ваша задача — написать программу, которая выдает соответствующее сообщение клиенту при наличии двух условий.
Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить информацию об облегченной версии:
Для iOS оно будет звучать так: «Установите облегченную версию приложения для iOS по ссылке».
Для Android: «Установите облегченную версию приложения для Android по ссылке».
Для пользователей телефонов 2015 года выпуска и позже нужно вывести обычное предложение об установке приложения.
Для года создания телефона используйте переменную clientDeviceYear, в которой необходимо указать 2015 год.
Важно: вложенность больше двух этажей не допускается (условный оператор внутри условного оператора).
         */
         clientOS = 0;
        clientDeviceYear = 2016;
        int limitYearRelease = 2015;
        if (clientOS == 0 && clientDeviceYear >= limitYearRelease) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear <= limitYearRelease) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= limitYearRelease) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }


    }
}




















