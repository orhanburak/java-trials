public class OverloadingChall {

    public static void main(String[] args) {

        System.out.println("Height of the person is : " + convertToCentimeters(6,0));

    }

    public static double convertToCentimeters(int inches){

        double centimeter = inches * (2.54);

        return centimeter;
    }

   /* public static double convertToCentimeters(int feet, int inches){

        int totalInches = (feet*12) + inches;

        return convertToCentimeters(totalInches);
    }
    */
    public static double convertToCentimeters(int feet, int inches){

        return ((feet*12) + inches)*2.54;
    }
}
