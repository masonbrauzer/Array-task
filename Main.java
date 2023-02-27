package app;

public class Main {
    static String[] stuff;
    static int cnt;
    public static void main(String[] args) {

        stuff = new String[]{"iMac (24-inch, M1, 2022)", "iMac (24-inch, M1, 2021)", "iMac (Retina 5K, 27-inch, 2020)",
                "iMac (Retina 5K, 27-inch, 2019)", "iMac (Retina 4K, 21.5-inch, 2019)"};

        for (String computers : stuff) {
            cnt++;
            System.out.println(cnt + ". " + computers + ";");
        }
    }
}