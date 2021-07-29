import processing.core.PApplet;

public class TryProcessing extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 840;
    int start=0;
    int start2=0;
    int start3=0;
    int start4=0;

    public static void main(String[] args)
    {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        getEllipse(HEIGHT*1/5, 50, 1);
        getEllipse2(HEIGHT*2/5, 50, 2);
        getEllipse3(HEIGHT*3/5, 50, 3);
        getEllipse4(HEIGHT*4/5, 50, 4);

    }

    private void getEllipse(int i, int i2, int x) {
        ellipse(start, i, i2, i2);
        start+=x;
    }

    private void getEllipse2(int i, int i2, int x) {
        ellipse(start2, i, i2, i2);
        start2+=x;
    }

    private void getEllipse3(int i, int i2, int x) {
        ellipse(start3, i, i2, i2);
        start3+=x;
    }

    private void getEllipse4(int i, int i2, int x) {
        ellipse(start4, i, i2, i2);
        start4+=x;
    }
}
