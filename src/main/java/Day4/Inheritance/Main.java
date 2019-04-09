package Inheritance;

public class Main {
    public static void main(String[] args) {
        Komputer komputer = new Komputer("Pentium", 8, 300);
        System.out.println(komputer.getDiscSizeInGb());
        System.out.println(komputer.getProcesorName());
        System.out.println(komputer.getRam());
        System.out.println(komputer.powerOm());

        Laptop laptop = new Laptop("Celeron", 4, 0, false, 15);
        System.out.println(laptop.getDiscSizeInGb());
        System.out.println(laptop.getProcesorName());
        System.out.println(laptop.getRam());
        System.out.println(laptop.powerOm());

        Mark dell = new Mark(12, 200, 217);
        System.out.println(dell.getDiscSizeInGb());
        System.out.println(dell.getProcesorName());
        System.out.println(dell.getRam());
        System.out.println(dell.powerOm());

        Komputer laptopComputer = new Laptop("Celeron", 4, 0, false, 15);
        ((Laptop) laptopComputer).getScreenSize();

        Komputer dellComputer = new Mark(8, 500, 17);
        ((Mark) dellComputer).getScreenSize();
        dellComputer.powerOm();

        Komputer[] komputers = {komputer, laptop, dell, laptopComputer, dellComputer};
        for (Komputer temporaryCKomputer : komputers) {
            komputer.getRam();
        }
    }
}
