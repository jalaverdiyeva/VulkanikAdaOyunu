import java.util.Scanner;

public class VulkanikAdaOyunu {

    static Scanner sc=new Scanner(System.in);
    static int energy=100;
    static int score=0;
    static String name;

    public static void main(String[] args) {

        intro();
        zone1();
        zone2();
        zone3();
        zone4();
        ending();
    }

    // ---------------------------- INTRO ----------------------------
    static void intro() {
        System.out.println();
        System.out.println("🌋 🔥‘Vulkanik Adadan Qaçış’ oyununa xoş gəldiniz🔥");
        System.out.print("                     SENIN adın: ");
        name = sc.nextLine();

        System.out.println("\nSalam, " + name + "! Hech gizli adada oyanmısan...");
        System.out.println("                 Vulkan hər an püskürə bilər. Qaçmağa başla!🔥\n");
    }

    // ---------------------------- ZONE 1 ----------------------------
    static void zone1() {
        System.out.println("                 🌋 ZONA1");
        System.out.println("                           – Riyaziyyat Kanyonu♟🧗🏼");
        System.out.println("Sual: 12 * 4 - (18 / 3) + 27 - 5 neçə edir❓");
        System.out.print("                  (buraya cavaboni elave et)-> ");

        int ans = sc.nextInt();

        if (ans == 64) {
            System.out.println("😃 doğruuuu");
            score+=20;
        } else {
            System.out.println("😅 yanlış!");
            energy-=10;
        }
        System.out.println("(enerjin->> " + energy + " ve balin->> " + score + ")");
    }

    // ---------------------------- ZONE 2 ----------------------------
    static void zone2() {
        System.out.println("                 🌋 ZONA2");
        System.out.println("                           – Qaranlıq Mağara♟🧗🏼");
        System.out.println("mağaradan çıxmaq üçün 5 addım atmalısan...");

        for (int i=1; i<=5; i++) {
            System.out.println("Addım " + i + "..."+"galiq enerji->"+energy);
            energy-=3;
        }

        System.out.println();
        System.out.println("             🤸🏻‍♀️mağaradan çıxdın!");
        System.out.println("(enerjin->> " + energy + " ve balin->> " + score + ")");
        System.out.println();
    }

    // ---------------------------- ZONE 3 ----------------------------
    static void zone3() {
        System.out.println("                 🌉 Zona 3");
        System.out.println("                           – Qırıq Körpü🌪️");
        System.out.println("            sola (L) yaaa sağa (R)?");
        System.out.println("                                     🥲hansı tərəfi gedek");
        System.out.print("(buya sechimini elave et)-> ");
        char choice = sc.next().charAt(0);

        if (choice == 'L' || choice == 'l') {
            System.out.println(" elaaaaa Sağ qapı! +15 bal");
            score += 15;
        } else {
            System.out.println("❌ Yanlış yol! -15 enerji");
            energy -= 15;
        }

        System.out.println("Enerji: " + energy + " | Bal: " + score + "\n");
    }

    // ---------------------------- ZONE 4 ----------------------------
    static void zone4() {
        System.out.println("                 🌉🔥 Zona 4");
        System.out.println("                           – Vulkan Qapıları🌪️");
        System.out.println("3 qapıdan biri açardır. (1, 2, 3)");

        int door;
        do {
            System.out.print("Qapı seç: ");
            door = sc.nextInt();

            if (door < 1 || door > 3) {
                System.out.println("Yalnız 1-3 arasında seç!");
            }

        } while (door < 1 || door > 3);

        switch (door) {
            case 2:
                System.out.println("✔ Doğru qapı! +25 bal");
                score += 25;
                break;

            default:
                System.out.println("❌ Yanlış qapı! -20 enerji");
                energy -= 20;
        }

        System.out.println("Enerji: " + energy + " | Bal: " + score + "\n");
    }

    // ---------------------------- ENDING ----------------------------
    static void ending() {
        System.out.println("🚁 Helikopterə yaxınlaşırsan...");

        if (energy <= 0) {
            System.out.println("💀 Enerjin bitdi... Vulkan səni udur.");
            return;
        }

        if (score >= 60) {
            System.out.println("🏆 Təbriklər " + name + "! Adadan tam uğurla qaçdın!");
        } else if (score >= 30) {
            System.out.println("⚠️ Çətinliklə də olsa, sağ qaldın və helikopterə çatdın.");
        } else {
            System.out.println("💀 Balın çox aşağı idi... Vulkan püskürdü və sən gecikdin.");
        }
    }
}
