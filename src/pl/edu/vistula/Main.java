package pl.edu.vistula;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        float WeightStankiewicz = 98;
        float GravityStankiewicz = 0.38F;

        float MarsWeightStankiewicz = WeightStankiewicz * GravityStankiewicz;
        System.out.println("Waga na marsie: " + (MarsWeightStankiewicz));

        double FloatToDoubleStankiewicz = MarsWeightStankiewicz;

        //System.out.println("Zmiana wagi z float na double:" + FloatToDoubleStankiewicz);
        System.out.printf("Ogranicznie wagi do 4 miejsc po przecinku: %.4f %n",FloatToDoubleStankiewicz);

        int ChangeToIntStankiewicz = (int) MarsWeightStankiewicz;
        System.out.println("Rzutowanie na int: " + ChangeToIntStankiewicz);

        char ChangeToCharStankiewicz = (char) ChangeToIntStankiewicz;
        System.out.println("Rzutowanie na char: " + ChangeToCharStankiewicz);

        int CharToIntStankiewicz = ChangeToCharStankiewicz + 10;
        System.out.println("Dzianie na typie char: "+CharToIntStankiewicz);

    }
}
