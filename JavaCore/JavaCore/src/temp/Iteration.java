package temp;

public class Iteration {
    public static void main(String[] args) {
        // Iteration.Flowcharts1();
        // Iteration.Flowcharts2();
        // Iteration.Flowcharts3();
        // Iteration.Flowcharts5();
        Iteration.Coins1(5f, 100f);
    }

    static void Flowcharts1() {
        for (int A = 100; A <= 200; A++) {
            System.out.println(A);
        }
    }

    static void Flowcharts2() {
        for (int A = 100; A <= 200; A++) {
            if (A%2 == 0) {
                System.out.println(A + " - ");
            } else {
                System.out.println(A + " * ");
            }
        }
    }

    static void Flowcharts3() {
        for (int A = 1; A <= 10; A++) {
            for (int X = 1; X <= 10; X++) {
                System.out.println(A);
            }
        }
    }

    static void Flowcharts5() {
        for (int A = 1; A <= 10; A++) {
            for (int X = 1; X <= A; X++) {
                System.out.print(A + " ");
            }
            System.out.println("");
        }
    }

    // This is unwieldy code, but is meant to look this way for the purposes of the exercise.
    static void Coins1(float cost, float payment) {
        System.out.println(String.format("Customer was charged £%s and paid £%s.", cost, payment));
        float remainingPayment = payment - cost;
        if (remainingPayment >= 0) {
            String[] currencyNames = {"£50 note", "£20 note", "£10 note", "£5 note", "£2 coin", "£1 coin", "50p coin", "20p coin", "10p coin", "5p coin", "2p coin", "1p coin"};
            float[] currencyValues = {50f, 20f, 10f, 5f, 2f, 1f, 0.5f, 0.2f, 0.1f, 0.05f, 0.02f, 0.01f};
            int[] currencyAmounts = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

            System.out.println(String.format("Customer will be returned %s of change in:", remainingPayment));
            for (int i = 0; i < currencyNames.length; i++) {
                while (remainingPayment >= currencyValues[i]) {
                    remainingPayment -= currencyValues[i];
                    currencyAmounts[i] += 1;
                }
                if (currencyAmounts[i] > 0) {
                    System.out.println(String.format("%o %s(s)", currencyAmounts[i], currencyNames[i]));
                }
            }
        } else {
            System.out.println("Customer hasn't paid enough to cover the cost!");
        }
    }
}
