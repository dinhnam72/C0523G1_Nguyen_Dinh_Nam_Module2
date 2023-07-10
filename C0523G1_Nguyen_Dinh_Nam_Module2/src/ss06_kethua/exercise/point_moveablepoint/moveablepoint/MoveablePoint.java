package ss06_kethua.exercise.point_moveablepoint.moveablepoint;

import ss06_kethua.exercise.point_moveablepoint.point.Point;

public class MoveablePoint extends Point {
    private float xSpeeed;
    private float ySpeeed;

    public MoveablePoint() {

    }

    public MoveablePoint(float xSpeeed, float ySpeeed) {
        this.xSpeeed = xSpeeed;
        this.ySpeeed = ySpeeed;
    }

    public MoveablePoint(float x, float y, float xSpeeed, float ySpeeed) {
        super(x, y);
        this.xSpeeed = xSpeeed;
        this.ySpeeed = ySpeeed;
    }

    public float getxSpeeed() {
        return xSpeeed;
    }

    public void setxSpeeed(float xSpeeed) {
        this.xSpeeed = xSpeeed;
    }

    public float getySpeeed() {
        return ySpeeed;
    }

    public void setySpeeed(float ySpeeed) {
        this.ySpeeed = ySpeeed;
    }

    public void setSpeed(float xSpeeed, float ySpeeed) {
        setxSpeeed(xSpeeed);
        setySpeeed(ySpeeed);
    }

    public float[] getSpeed() {
        float arrSpeed[] = {getxSpeeed(), getySpeeed()};
        return arrSpeed;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "( x= " + getX() + ",y= " + getY() + ")" +
                "speed=( " + " xSpeeed=" + xSpeeed +
                ", ySpeeed=" + ySpeeed + ")" +
                '}';
    }

    public MoveablePoint move() {
        super.setXY(super.getX() + getxSpeeed(), super.getY() + getySpeeed());
        return this;

    }
}
