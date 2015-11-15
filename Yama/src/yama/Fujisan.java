package Yama;

/**
 *
 * @author logostron10
 */
class Fujisan implements IMountain {

    public Fujisan() {
    }

   
    @Override
    public String getName() {
        return "富士山";
    }

 
    @Override
    public int getHeight() {
        return 3776;
    }
    
    public void nipponichi() {
        System.out.println("日本一！");
    }
}