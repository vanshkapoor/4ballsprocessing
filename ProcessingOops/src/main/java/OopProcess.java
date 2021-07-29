import processing.core.PApplet;

public class OopProcess extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int STARTPOINT = 0;
    Circle circle1, circle2, circle3, circle4;

    public static void main(String[] args) {
        PApplet.main("OopProcess", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }


    @Override
    public void setup() {
        super.setup();
        circle1 = new Circle(STARTPOINT, 50, 1, 1*HEIGHT/5);
        circle2 = new Circle(STARTPOINT, 50, 2, 2*HEIGHT/5);
        circle3 = new Circle(STARTPOINT, 50, 3, 3*HEIGHT/5);
        circle4 = new Circle(STARTPOINT, 50, 4, 4*HEIGHT/5);
    }


    @Override
    public void draw() {
        circle1.draw();
        circle2.draw();
        circle3.draw();
        circle4.draw();
    }

    public class Circle{
        int start;
        int diameter;
        int speed;
        int distance;

        public Circle(int start, int diameter, int speed, int distance) {
            this.start = start;
            this.diameter = diameter;
            this.speed = speed;
            this.distance = distance;
        }

        void draw()
        {
            ellipse(start, distance, diameter, diameter);
            start+=speed;
        }
    }
}
