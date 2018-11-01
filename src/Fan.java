public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private static final double RADIUS_TEN = 10;
    private static final double RADIUS_FIVE = 5;
    private static final String YELLOW = "Yellow";
    private int speed = SLOW;
    private boolean on = false;
    private double radius = RADIUS_FIVE;
    private String color = "Blue";
    private String temp;

    private void setSpeed(int speed) {
        this.speed = speed;
    }

    private void setOn(boolean on) {
        this.on = on;
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }

    private void setColor(String color) {
        this.color = color;
    }

    private int getSpeed(){return speed;}
    private boolean getOn(){return on;}
    private double getRadius(){return radius;}
    private String getColor(){return color;}

    private Fan() {}

    private String display(){
      if (on){
          temp = "Speed: " + getSpeed() + ", radius: " + getRadius() + ", color: " + getColor() + ", fan is on!";
      } else temp = "Speed: " + getSpeed() + ", radius: " + getRadius() + ", color: " + getColor() + ", fan is off!";
      return temp;
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(FAST);
        fan1.setRadius(RADIUS_TEN);
        fan1.setColor(YELLOW);
        fan1.setOn(true);
        System.out.println(fan1.display());
        Fan fan2 = new Fan();
        fan2.setSpeed(MEDIUM);
        System.out.println(fan2.display());
    }
}
