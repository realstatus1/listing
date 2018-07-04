package com;


public class Stepik {

    public static void main(String[] args) {
        Robot robot = new Robot();
        moveRobot(robot, -4, -7);
        System.out.println("Robot change direction to the " + robot.getDirection() + ", and he on X = " + robot.getX() + ", and Y = " + robot.getY());
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();
        if (toX > x){
            switch (robot.getDirection()){
                case UP: robot.turnRight(); for (int i = 0; i < (toX-x); i++){ robot.stepForward();} break;
                case RIGHT: for (int i = 0; i < (toX - x); i++){ robot.stepForward();} break;
                case LEFT: robot.turnRight(); robot.turnRight(); for (int i = 0; i < (toX - x); i++){ robot.stepForward();} break;
                case DOWN: robot.turnLeft(); for (int i = 0; i < (toX - x); i++){ robot.stepForward();} break;
            }
        }
        if (toX < x){
            switch (robot.getDirection()){
                case UP: robot.turnLeft(); for (int i = 0; i < (x - toX); i++){ robot.stepForward();} break;
                case RIGHT: robot.turnLeft(); robot.turnLeft(); for (int i = 0; i < (x - toX); i++){robot.stepForward();}break;
                case LEFT: for (int i = 0; i < (x - toX); i++){robot.stepForward();}break;
                case DOWN: robot.turnRight(); for (int i = 0; i < (x - toX); i++){ robot.stepForward();} break;
            }
        }
        if (toY > y){
            switch (robot.getDirection()){
                case UP: for (int i = 0; i < (toY - y); i++){ robot.stepForward();} break;
                case RIGHT: robot.turnLeft(); for (int i = 0; i < (toY - y); i++){ robot.stepForward();} break;
                case LEFT: robot.turnRight(); for (int i = 0; i < (toY - y); i++){ robot.stepForward();} break;
                case DOWN: robot.turnLeft(); robot.turnLeft(); for (int i = 0; i < (toY - y); i++){ robot.stepForward();} break;
            }
        }
        if (toY < y){
            switch (robot.getDirection()){
                case UP: robot.turnLeft(); robot.turnLeft(); for (int i = 0; i < (y - toY); i++){ robot.stepForward();} break;
                case RIGHT: robot.turnRight(); for (int i = 0; i < (y - toY); i++){robot.stepForward();}break;
                case LEFT: robot.turnLeft(); for (int i = 0; i < (y - toY); i++){robot.stepForward();}break;
                case DOWN: for (int i = 0; i < (y - toY); i++){ robot.stepForward();} break;
            }
        }
    }
}
