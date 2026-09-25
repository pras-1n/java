import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Barksdale Organiation Management System
 * Tactical Overview of West Baltimore corners, stash counts, and BPD
 * Majorcrimes surveilance risk.
 * 
 * @author Stringer Bell, Copy Shop
 */

enum BarksdaleRank {
    KINGPIN(5, "Top of the ladder. Never touches the package."),
    SECOND_IN_COMMAND(4, "Handles the money, business fronts, rules."),
    LIEUTENANT(3, "Controls regional towers and low-rises."),
    SOLDIER(2, "Enforces turf, drops muscles."),
    CORNER_BOY(1, "Works the block, holds the vials.");

    private final int authorityLevel;
    private final String description;

    BarksdaleRank(int authorityLevel, String description) {
        this.authorityLevel = authorityLevel;
        this.description = description;
    }

    public int getAuthorityLevel() {
        return authorityLevel;
    }

    public String getDescription() {
        return description;
    }
}

interface ConfidentialInformat {
    void provideStreetIntel();
}

// node for recursion demo
class TargetNode {
    String name;
    BarksdaleRank rank;
    TargetNode directSuperior;

    public TargetNode(String name, BarksdaleRank rank, TargetNode directSperior) {
        this.name = name;
        this.rank = rank;
        this.directSuperior = directSperior;
    }
}

public class MajorCrimesWiretap {
    private String caseName = "Barksdale Operation (Wiretap #01-A)";

    // inner class (non-static: has access to outer class members)
    public class WireTapRecorder {
        private String targetLine;

        public WireTapRecorder(String targetLine) {
            this.targetLine = targetLine;
        }

        public void logIntercept() {
            System.out.println("[" + caseName + "] Tapping line: " + targetLine);
        }
    }

    // recursion
    public static void traceChainOfCommand(TargetNode currentTarget) {
        if (currentTarget == null) {
            System.out.println(" -> [END OF CHAIN: Crown achieved or cut off]");
            return;
        }

        System.out.println(" Level " + currentTarget.rank.getAuthorityLevel() + "[" + currentTarget.rank + "]: "
                + currentTarget.name + " (" + currentTarget.rank.getDescription() + ")");

        traceChainOfCommand(currentTarget.directSuperior);
    }

    public static void main(String[] args) {
        System.out.println("=== BPD MAJOR CRIMES DIVISION - DETAIL ROOM ===\n");

        // inner class instantiation
        MajorCrimesWiretap detail = new MajorCrimesWiretap();
        MajorCrimesWiretap.WireTapRecorder lineOne = detail.new WireTapRecorder("Payphone: Monroe & Fayette");
        lineOne.logIntercept();

        // wrapper classes and autoboxing (primitive int directly into integer object)
        Integer wireTapId = 9021;
        Double interceptedBailAmount = 1500.75;

        // unboxing: wrapper object used automatically as primitive
        double adjustedBail = interceptedBailAmount + 500.0;

        // parsing using wrapper helper methods
        String pagerRawCode = "4105550199";
        long parsedPagerNumber = Long.parseLong(pagerRawCode);

        System.out.print("Wiretap Ref: #" + wireTapId + " | Raw Pager Intercept: " + parsedPagerNumber +
                " | Bail Target: $" + adjustedBail);

        // data time and api (java.time)

        LocalDateTime callStart = LocalDateTime.now();
        LocalDateTime callEnd = callStart.plusMinutes(3).plusSeconds(42);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        Duration callDuration = Duration.between(callStart, callEnd);

        System.out.println("Intercept Recorded: " + callStart.format(formatter));
        System.out.println("Duration: " + callDuration.toMinutes() + "m " + (callDuration.getSeconds() % 60) + "s");
    }
}

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

        if (roundedRisk > 75) {
            System.out.println("RISK HIGH: Stringer ordered everyone off the pagers. Pack up.");
        } else if (roundedRisk > 40) {
            System.out.println("Risk Moderate: Herc and Carver are looking. Move the stash.");
        } else {
            System.out.println("Rish Low: Business as usual. Joe's package is moving.");
        }

        // Switch Statements

        String soldier = "Bodie";

        switch (soldier) {
            case "Avon" -> System.out.println("Role: King. Directs muscle, avoids court.");
            case "Stringer" -> System.out.println("Role: CEO. Runs the money through B&B enterprises.");
            case "Bodie", "Poot" -> System.out.println("Role: Corner boys. Hold the low rises");
            case "Wee-Bey" -> System.out.println("Role: Enforcer. Keeps the muscle away from Barksdale.");
            default -> System.out.println("Role: Unknown associate / potential CI.");
        }

        // Branching (break & continue)

        System.out.println("\n--- Inspecting Stash Units on Floor 2 ---");
        int[] floorTwoRooms = highRiseStash[1];

        for (int i = 0; i < floorTwoRooms.length; i++) {
            if (floorTwoRooms[i] == 0) {
                System.out.println("Room " + i + " is empty. Skipping");
                continue;
            }

            if (isWiretapActive && i == 2) {
                System.out.println("BPD blue-and-white spotted outside Room " + i + "! Break inspection!");
                break;
            }

            System.out.println("Room " + i + " verified: " + floorTwoRooms[i] + " packs secured.");
        }
    }
}