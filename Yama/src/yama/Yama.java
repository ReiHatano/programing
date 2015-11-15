

package Yama;


public class Yama {

 
    public static void main(String[] args) {
        IMountain fuji = new Fujisan();
        IMountain aso = new Asosan();
        IMountain[] mountains = new IMountain[]{fuji, aso};
        for (IMountain mountain : mountains) {
            System.out.println(mountain.getName() + mountain.getHeight() + "m");
        }
    }
}
