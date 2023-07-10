package ss06_kethua.exercise.point_moveablepoint.point;

public class Point {
    private float x;
    private float y;
    public Point(){

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY (float x,float y){
        setX(x);
        setY(y);
    }
    public float[] getXY(){
        float arr[] = {x,y};
        return arr;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
