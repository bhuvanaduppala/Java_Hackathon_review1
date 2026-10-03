import java.util.*;
class Solar{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter panel id");
        int panel_id = sc.nextInt();
        System.out.println("energy generated");
        double energy_generated = sc.nextDouble();
        System.out.println("enter no of solar panels");
        int solar_panel = sc.nextInt();
        System.out.println("enter system status");
        char system_status = sc.next().charAt(0);
        System.out.println("the panel id :"+panel_id);
        System.out.println("energy generated:"+energy_generated+"kWh");
        System.out.println("solar panel:"+solar_panel);
        System.out.println("system status:"+system_status);
    }

}