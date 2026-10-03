import java.util.Scanner;

public class Methods {
    static  double TotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter morning energy generated in kWh: ");
        double morningEnergy = scanner.nextDouble();
        System.out.print("Enter evening energy generated in kWh: ");
        double eveningEnergy = scanner.nextDouble();
        double totalEnergy = TotalEnergy(morningEnergy, eveningEnergy);
        System.out.println("Total Energy Generated: " + totalEnergy + " kWh");
    }
}