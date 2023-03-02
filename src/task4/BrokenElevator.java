package task4;

public class BrokenElevator {
    public static void main(String[] args) {
        int floors = 200;
        int stepUp = 50;
        int stepDown = 1;
        int liftsCount = numberOfLift(floors, stepUp, stepDown);
        System.out.println("Количество подъемов: " + liftsCount);
    }


    public static int numberOfLift(int floors, int stepUp, int stepDown) {
        int leftFloors = floors;
        int liftsCount = 0;

        while (leftFloors > 0) {

            liftsCount++;
            leftFloors -= stepUp;



            if (leftFloors <= 0) {
                break;
            }

            leftFloors += stepDown;
        }

        return liftsCount;
    }



    }
