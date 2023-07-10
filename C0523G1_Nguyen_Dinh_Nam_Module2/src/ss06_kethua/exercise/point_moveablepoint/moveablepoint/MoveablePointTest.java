package ss06_kethua.exercise.point_moveablepoint.moveablepoint;

public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);
        moveablePoint = new MoveablePoint(3,5);
        System.out.println(moveablePoint);
        moveablePoint = new MoveablePoint(2,5,7,8);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
        moveablePoint.setSpeed(4.6f,7.8f);
        System.out.println(moveablePoint.move());

    }
}
