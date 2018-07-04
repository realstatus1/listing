package com;

public class Robot {
    public enum Direction {UP,DOWN,LEFT,RIGHT};

    private int x = 2;
    private int y;
    private Direction direction = Direction.UP;

    public Direction getDirection() {
        // текущее направление взгляда
        return this.direction;
    }

    public int getX() {
        // текущая координата X
        return this.x;
    }

    public int getY() {
        // текущая координата Y
        return this.y;
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
        switch (getDirection()) {
            case UP: this.direction = Direction.LEFT; break;
            case DOWN: this.direction = Direction.RIGHT; break;
            case LEFT: this.direction = Direction.DOWN; break;
            case RIGHT: this.direction = Direction.UP; break;
            default: System.out.println("Robot can't change direction to the left.");
        }

    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
        switch (getDirection()) {
            case UP: this.direction = Direction.RIGHT; break;
            case DOWN: this.direction = Direction.LEFT; break;
            case LEFT: this.direction = Direction.UP; break;
            case RIGHT: this.direction = Direction.DOWN; break;
            default: System.out.println("Robot can't change directionto the right.");
        }
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
        if (getDirection() == Direction.UP){
            this.y += 1;
        }
        if (getDirection() == Direction.DOWN){
            this.y -= 1;
        }
        if (getDirection() == Direction.RIGHT){
            this.x += 1;
        }
        if (getDirection() == Direction.LEFT){
            this.x -= 1;
        }
    }
}
