package javaweek4_homework;

/**
 * 16 Point
 * You have to represent a point in 2D space. Write a class with the name Point. The class needs two fields
 * (instance variables) with name x and y of type int.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor).
 * The second constructor has parameters x and y of type int and it needs to initialize the fields.
 * Write the following methods (instance methods):
 * * Method named getX without any parameters, it needs to return the value of x field.
 * * Method named getY without any parameters, it needs to return the value of y field.
 * * Method named setX with one parameter of type int, it needs to set the value of the x field.
 * * Method named setY with one parameter of type int, it needs to set the value of the y field.
 * * Method named distance without any parameters, it needs to return the distance between this Point and Point 0,0 as double.
 * * Method named distance with two parameters x, y both of type int, it needs to return the distance between this
 * Point and Point x,y as double.
 * * Method named distance with parameter another of type Point, it needs to return the distance between this
 * Point and another Point as double.
 * How to find the distance between two points?
 * To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
 * d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
 * Where √ represents square root.
 * TEST EXAMPLE
 * → TEST CODE:  Write the below code into the main method.
 * Point first = new Point(6, 5);
 * Point second = new Point(3, 1);
 * System.out.println("distance(0,0)= " + first.distance());
 * System.out.println("distance(second)= " + first.distance(second));
 * System.out.println("distance(2,2)= " + first.distance(2, 2));
 * Point point = new Point();
 * System.out.println("distance()= " + point.distance());
 * OUTPUT
 * distance(0,0)= 7.810249675906654
 * distance(second)= 5.0
 * distance(2,2)= 5.0
 * distance()= 0.0
 * NOTE: Use Math.sqrt to calculate the square root √.
 * NOTE: Try to avoid duplicated code.
 * NOTE: All methods should be defined as public NOT public static.
 * NOTE: In total, you have to write 7 methods.
 */
public class Programme_16_Point {
    //instance variable
    int x;
    int y;

    //Constructor with zero args
    Programme_16_Point() {
    }

    //parameterised constructor
    Programme_16_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int a) {
        this.x = a;
    }

    public void setY(int b) {
        this.y = b;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - getX()) * (x - getX()) + (y - getY()) * (y - getY()));
    }

    public double distance(Programme_16_Point secondPoint) {
        return distance(secondPoint.x, secondPoint.y);
    }

    public static void main(String[] args) {
        Programme_16_Point first = new Programme_16_Point(6, 5);
        Programme_16_Point second = new Programme_16_Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Programme_16_Point point = new Programme_16_Point();
        System.out.println("distance()= " + point.distance());
    }

    /**
     * Sum Calculator
     * Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with names firstNumber
     * and secondNumber both of type double.
     * Write the following methods (instance methods):
     * Method named getFirstNumber without any parameters, it needs to return the value of the firstNumber field.
     * Method named getSecondNumber without any parameters, it needs to return the value of the secondNumber field.
     * Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
     * *Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumber field.
     * Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of
     * firstNumber and secondNumber.
     * Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field
     * values of the secondNumber from the firstNumber.
     * Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the
     * field values of firstNumber and secondNumber.
     * Method named getDivisionResult without any parameters, it needs to return the result of dividing the field
     * values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.
     * TEST EXAMPLE
     * TEST CODE: Write the bellow code into main method
     * SimpleCalculator calculator = new SimpleCalculator();
     * calculator.setFirstNumber(5.0);
     * calculator.setSecondNumber(4);
     * System.out.println("add= " + calculator.getAdditionResult());
     * System.out.println("subtract= " + calculator.getSubtractionResult());
     * calculator.setFirstNumber(5.25);
     * calculator.setSecondNumber(0);
     * System.out.println("multiply= " + calculator.getMultiplicationResult());
     * System.out.println("divide= " + calculator.getDivisionResult());
     * OUTPUT
     * add= 9.0
     * subtract= 1.0
     * multiply= 0.0
     * divide= 0.0
     * TIPS:
     * add= 9.0 is printed because 5.0 + 4 is 9.0
     * subtract= 1.0 is printed because 5.0 - 4 is 1.0
     * multiply= 0.0 is printed because 5.25 * 0 is 0.0
     * divide= 0.0 is printed because secondNumber is set to 0
     */

    public static class Programme_18_SimpleCalculator {
        double firstNumber;
        double secondNumber;

        public double getFirstNumber() {
            return firstNumber;
        }

        public double getSecondNumber() {
            return secondNumber;
        }

        public void setFirstNumber(double firstNumber) {
            this.firstNumber = firstNumber;
        }

        public void setSecondNumber(double secondNumber) {
            this.secondNumber = secondNumber;
        }

        public double getAdditionResult() {
            return getFirstNumber() + getSecondNumber();
        }

        public double getSubtractionResult() {
            return getFirstNumber() - getSecondNumber();
        }

        public double getMultiplicationResult() {
            return getFirstNumber() * getSecondNumber();
        }

        public double getDivisionResult() {
            if (getSecondNumber() == 0) {
                return 0;
            } else
                return getFirstNumber() / getSecondNumber();
        }

        public static void main(String[] args) {
            Programme_18_SimpleCalculator calculator = new Programme_18_SimpleCalculator();
            calculator.setFirstNumber(5.0);
            calculator.setSecondNumber(4);
            System.out.println("add= " + calculator.getAdditionResult());
            System.out.println("subtract= " + calculator.getSubtractionResult());
            calculator.setFirstNumber(5.25);
            calculator.setSecondNumber(0);
            System.out.println("multiply= " + calculator.getMultiplicationResult());
            System.out.println("divide= " + calculator.getDivisionResult());
        }
    }
}
