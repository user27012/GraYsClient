package net.graysenko.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ProcessNameToCheck = "javaw.exe";

        ArrayList<String> passes = new ArrayList<>();

        passes.add("admin");
        passes.add("password");
        passes.add("root");

        ArrayList<String> users = new ArrayList<>();

        users.add("admin");
        users.add("GraYs");
        users.add("root");

        System.out.println("░█▀▀░█▀▄░█▀█░█░█░█▀▀░░░█▀▀░█░░░█▀▀░▀█▀░█▀█░▀█▀\n" +
                "░█░█░█▀▄░█▀█░░█░░▀▀█░░░█░░░█░░░█▀▀░░█░░█░█░░█░\n" +
                "░▀▀▀░▀░▀░▀░▀░░▀░░▀▀▀░░░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░▀░░▀░");

        System.out.println("ⒼⒸ Добро пожаловать в GraYs Client 1.16.5 - 1.20 ☠");
        System.out.println("");
        if (isProcessRunning(ProcessNameToCheck)) {
            System.out.println("ⒼⒸ Майнкрафт запущен и успешно найден ✅");
        } else {
            System.out.println("ⒼⒸ 101 - Майнкрафт не запущен или не найден.. ❌ ");
            for (int i = 1; i<= 3; i++){
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("ⒼⒸ Нас заметили! Уходим через - " + i + " 🏃");
            }
            System.exit(101);
        }
        System.out.print("ⒼⒸ Введите имя пользователя: ");
        String user = sc.next();
        if (users.contains(user)){
            System.out.println("ⒼⒸ Добро пожаловать - " + user + " ✅");
        }else {
            System.out.println("ⒼⒸ 202 - Неверное имя или пароль.. ❌");
            for (int i = 1; i<= 3; i++){
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("ⒼⒸ Нас заметили! Уходим через - " + i + " 🏃");
            }
            System.exit(202);
        }
        System.out.print("ⒼⒸ Введите пароль: ");
        String pas = sc.next();
        if (passes.contains(pas) && ("root".equalsIgnoreCase(user) || "admin".equalsIgnoreCase(user))) {
            System.out.println("ⒼⒸ Добро пожаловать, сер, что желаете сделать? ☠ \n" +
                    "1 - Начать атаку \uD83D\uDC89 \n" +
                    "2 - Админ панель \uD83D\uDCBB \n" +
                    "3 - Контакты \uD83D\uDCF3");
            byte ins = sc.nextByte();
            if (ins == 3) {
                System.out.println("ⒼⒸ Ютуб - https://www.youtube.com/@mandarinchik8667 \uD83C\uDFA6");
                System.out.println("ⒼⒸ Дискорд - _grays ☎");
                System.out.println("ⒼⒸ Вернутся - 1");
            } else if (ins == 1) {
                inject();
            } else if (ins == 2) {
                admin();
            }
        }else if (passes.contains(pas) && !("root".equalsIgnoreCase(user) || "admin".equalsIgnoreCase(user))) {
            defal();
        } else {
            System.err.println("ⒼⒸ Нет такого варианта ответа! ❌");
        }


    }

    public static void admin(){
        Scanner scan = new Scanner(System.in);
        System.out.println("ⒼⒸ Админ панель \uD83E\uDEAA");
        System.out.println("");
        System.out.println("ⒼⒸ Сброс пароля - 1 \uD83D\uDCBD \n" +
                "ⒼⒸ Сброс HWID - 2 \uD83D\uDCBB \n" +
                "ⒼⒸ Просмотр аккаунтов - 3 \uD83D\uDCD3 \n" +
                "ⒼⒸ Редактирование клиента - 4 ⚙\uFE0F \n" +
                "ⒼⒸ Вернутся обратно - 5");
        String oi = scan.next();
        switch (oi){
            case"1":
                System.out.println("ⒼⒸ В разработке... ⚙\uFE0F");
                break;
            case "2":
                tonhw();
                sleep(2000);
                break;
            case "3":
                System.out.println("ⒼⒸ В разработке... ⚙\uFE0F");
                break;
            case "4":
                System.out.println("ⒼⒸ В разработке... ⚙\uFE0F");
                break;
            case "5":
                System.out.println("ⒼⒸ В разработке... ⚙\uFE0F");
                break;
            default:
                System.err.println("ⒼⒸ Нет такого варианта ответа ❌");
                sleep(1000);
                admin();

        }

    }

    public static void defal(){
        Scanner s = new Scanner(System.in);
        System.out.println("ⒼⒸ Добро пожаловать, сер, что желаете сделать? ☠ \n" +
                "1 - Начать атаку \uD83D\uDC89 \n" +
                "2 - Контакты \uD83D\uDCF3 \n" +
                "3 - Выход \uD83D\uDEAA");
        Byte in = s.nextByte();
        if (in == 1){
            inject();
        } else if (in == 2){
            System.out.println("ⒼⒸ Ютуб - https://www.youtube.com/@mandarinchik8667 \uD83C\uDFA6");
            System.out.println("ⒼⒸ Дискорд - _grays ☎");
            System.out.println("ⒼⒸ Вернутся - 1");
            int b = s.nextInt();
            if (b == 1){defal();}
            else {
                System.err.println("ⒼⒸ Действия не найдено ❌");
                sleep(1000);
                defal();
            }
        } else if (in == 3) {
            System.out.println("ⒼⒸ Спасибо за посещение!");
            sleep(2000);
            System.exit(2);
        }
    }

    public static void inject(){
        Random rn = new Random();
        int ra = rn.nextInt(10);
        System.out.println("ⒼⒸ Проверяем ваш HWID.. ⌛");
        sleep(4000);
        tohw();
        System.out.println("ⒼⒸ Начало атаки../ \uD83D\uDC89");
        for (int i = 0; i<=ra; i++){
            sleep(1000);
            System.out.println("ⒼⒸ Атака в процессе.. ⌛");
        }
        System.out.println("ⒼⒸ Успех! ✅");
        sleep(2000);
        System.exit(0);

    }

    public static void tohw(){
        UUID uuid = UUID.randomUUID();
        System.out.println("ⒼⒸ Ваш HWID: " + uuid + " ✅");
    }

    public static void tonhw(){
        UUID uuid = UUID.randomUUID();
        System.out.println("ⒼⒸ Ваш новый HWID: " + uuid + " ✅");
        admin();
    }

    public static void sleep(int time){
        try {
            Thread.sleep(time);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static boolean isProcessRunning(String processName) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("tasklist.exe");
            Process process = processBuilder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.contains(processName)) {
                    return true;
                }
            }

            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}