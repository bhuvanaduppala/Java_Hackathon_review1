import java.util.*;

class Condition{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the energy generated");
        double energy_generated = sc.nextDouble();
        if(energy_generated>=10){
            System.out.println("good energy is generated");
        }else{
            System.out.println("low energy is generated");
        }
    }

}