public class SpeedConverter {
    public static void main(String[] args) {

        printConversion(2.0);
        printConversion(0.0);
        printConversion(-2.0);
        printConversion(-4.0);
        printConversion(10.25);
        printConversion(100.4);
    }
    public static long toMilesPerHour(double kilometersPerHour){

        double result = (double) (kilometersPerHour / (1.609));

        long rounded = Math.round(result);

        if(kilometersPerHour<0) {

            return -1;
        }
        else {

            return rounded;
        }
    }
    public static void printConversion(double kilometersPerHour){

        if(kilometersPerHour<0){
            System.out.println("Invalid Value");
        }

        else{
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) +" mi/h");
        }
    }
}
