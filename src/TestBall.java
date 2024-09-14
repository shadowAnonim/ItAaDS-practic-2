public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(1, 1);
        System.out.println("Начальные координаты:");
        System.out.println(ball.getX() + " " + ball.getY());

        ball.setX(10);
        System.out.println("Новые координаты:");
        System.out.println(ball);

        ball.setY(-2);
        System.out.println("Новые координаты:");
        System.out.println(ball);

        ball.setXY(-7, 4);
        System.out.println("Новые координаты:");
        System.out.println(ball);

        ball.move(2, 4);
        System.out.println("Новые координаты:");
        System.out.println(ball);
    }
}
