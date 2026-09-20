import java.util.Arrays;

/**
 * Barksdale Organiation Management System
 * Tactical Overview of West Baltimore corners, stash counts, and BPD
 * Majorcrimes surveilance risk.
 * 
 * @author Stringer Bell, Copy Shop
 */

public class BaltimoreStreetOps {
    public static void main(String[] args) {
        boolean isWiretapActive = true;
        boolean omarSighted = false;
        boolean copsRaiding = false;

        // Type Casting

        // Widening (implicit): int -> double
        int rawVials = 450;
        double packageWeightGrams = rawVials;

        // Narrowing (explicit): double -> int (cutting product loses decimals)
        double wholesaleCut = 1250.85;
        int streetCutProfit = (int) wholesaleCut; // truncate .85 cents
        System.out.println("Wholesale Cut: $" + wholesaleCut + " -> Street Take: $" + streetCutProfit);

        // Math Class
        double raidRisk = Math.random() * 100;
        long roundedRisk = Math.round(raidRisk);

        int dangeloShortage = 350;
        int bodieShortage = 120;
        int maxShortage = Math.max(dangeloShortage, bodieShortage);

        System.out.println("Surveillance Risk: " + roundedRisk + "% | Highest Debt: $" + maxShortage);

        // 1D array: target corners
        String[] barksdaleCroners = { "Fayette & Monroe", "West Baltimore St", "Franklin Terrace Low-Rises" };
        System.out.println("Primary target corner: " + barksdaleCroners[0]);

        // 2D array: stash house floor grid storage package counts
        int[][] highRiseStash = {
                { 20, 50, 0 }, // floor 1 (rooms A, B, C)
                { 100, 150, 80 }, // floor 2 (...)
                { 0, 0, 300 } // floor 3 (roof stash)
        };
        System.out.println("Floor 2, Room B stash count: " + highRiseStash[1][1]);
    }
}