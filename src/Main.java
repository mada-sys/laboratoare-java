public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println();
        int i = 0;
        System.out.println(i);
        System.out.println();
        float x = 3.2f;
        double y = 3.24;
        System.out.println(x);
        System.out.println(y);
        byte z = 127;
        System.out.println(z);
        x = (float) y;
        System.out.println(x);
        Double z1 = 2.2d;
        double z2 = 125;

        System.out.println(Double.valueOf(z2));
        System.out.println(Double.valueOf(z2));


        int[] months_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"ianuarie", "februarie", "martie", "aprilie", "mai", "iunie", "iulie", "august", "septembrie", "octombrie", "noiembrie", "decembrie"};
        for (int id = 0; id < months_days.length; id++)///ex1
            System.out.println(months[id] + " " + months_days[id]);
        System.out.println();



        for (int id = 0; id < months_days.length; id++)///ex2
            if (months_days[id] == 31)
                System.out.println(months[id]);
        System.out.println();



        for (int id = 0; id < months_days.length; id++)///ex3
            if (months_days[id] < 31)
                System.out.println(months[id] + " " + months_days[id]);
        System.out.println();


        int suma_zile = 0;///ex4
        for (int id = 0; id < months_days.length; id++)
            if (months_days[id] < 31)
                suma_zile += months_days[id];
        System.out.println("Numarul de zile este:" + " " + suma_zile);
        System.out.println();


        for (int id = 0; id < months_days.length; id++) {       ///ex5
        String abbreviatedMonth = months[id].substring(0, 3);
        System.out.println(abbreviatedMonth + " - " + months_days[id]);
    }
}
}