package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // Задача 1
        int clientOs = 1;
        if (clientOs == 1) {
            System.out.println("Install version of app for Android by link");
        } else
            System.out.println("Install version of app for iOS by link"); // Пока буду писать по английски, как дойдут руки до исправления ошибки в Идее.

        //Задача 2
        int clientDeviceYear = 2014;
        if (clientDeviceYear >= 2015 && clientOs == 1)
         {
                System.out.println("Install version of app for Android by link"); //Стандартная установка для андроида
            }
         else
         if (clientDeviceYear >= 2015 && clientOs < 1) {
            System.out.println("Install version of app for iOS by link");//Стандартная версия iOS
        }

if (clientDeviceYear < 2015 && clientOs == 1){
    System.out.println("Install the light version of app for Android by link");//Облегченная Android
} else
    if (clientDeviceYear < 2015 && clientOs < 1){
        System.out.println("Install the light version of app for iOS by link");//Облегченная iOS
}
    //Задача 3
int year = 2021;
    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))// Честно скажу, сам очень долго пытался, но нашел эту формулу на форуме, сделал ее без команды boolean и scan
        {
            System.out.println("Year is leap");
        } else
            System.out.println("Year is not leap");
        //Задача 4
char deliveryDistance = 95;
if (deliveryDistance < 20) {
    System.out.println("It will take 1 day");
} else if ((deliveryDistance >= 20) && (deliveryDistance < 60)) {
    System.out.println("It will take 2 days");
}else if ((deliveryDistance >= 60) && (deliveryDistance < 100)){
    System.out.println("It will take 3 days");
}
//Задача 5
        int monthNumber = 12;
switch (monthNumber) {
    case 1:
    case 2:
    case 12:
        System.out.println("Winter");
        break;
    case 3:
    case 4:
    case 5:
        System.out.println("Spring");
        break;
    case 6:
    case 7:
    case 8:
        System.out.println("Summer");
        break;
    case 9:
    case 10:
    case 11:
        System.out.println("Autumn");
        break;
    default:
        System.out.println("This month does not exist.");
}
        }
    }