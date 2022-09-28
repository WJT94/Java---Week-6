package temp;

public class Iteration {
    public static void main(String[] args) {
        // Iteration.Flowcharts1();
        // Iteration.Flowcharts2();
        // Iteration.Flowcharts3();
        Iteration.Flowcharts5();
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
            int fiftyPound = 0;
            int twentyPound = 0;
            int tenPound = 0;
            int fivePound = 0;
            int twoPound = 0;
            int onePound = 0;
            int fiftyPence = 0;
            int twentyPence = 0;
            int tenPence = 0;
            int fivePence = 0;
            int twoPence = 0;
            int onePenny = 0;

            while (remainingPayment >= 50f) {
                remainingPayment -= 50f;
                fiftyPound += 1;
            }
            while (remainingPayment >= 20f) {
                remainingPayment -= 20f;
                twentyPound += 1;
            }
            while (remainingPayment >= 10f) {
                remainingPayment -= 10f;
                tenPound += 1;
            }
            while (remainingPayment >= 5f) {
                remainingPayment -= 5f;
                fivePound += 1;
            }
            while (remainingPayment >= 2f) {
                remainingPayment -= 2f;
                twoPound += 1;
            }
            while (remainingPayment >= 1f) {
                remainingPayment -= 1f;
                onePound += 1;
            }
            while (remainingPayment >= 0.5f) {
                remainingPayment -= 0.5f;
                fiftyPence += 1;
            }
            while (remainingPayment >= 0.2f) {
                remainingPayment -= 0.2f;
                twentyPence += 1;
            }
            while (remainingPayment >= 0.1f) {
                remainingPayment -= 0.1f;
                tenPence += 1;
            }
            while (remainingPayment >= 0.05f) {
                remainingPayment -= 0.05f;
                fivePence += 1;
            }
            while (remainingPayment >= 0.02f) {
                remainingPayment -= 0.02f;
                twoPence += 1;
            }
            while (remainingPayment >= 0.01f) {
                remainingPayment -= 0.01f;
                onePenny += 1;
            }

            System.out.println("Customer will be returned change in:");
            if (fiftyPound > 0) { System.out.println(String.format("%o £50 note(s)", fiftyPound)); }
            if (twentyPound > 0) { System.out.println(String.format("%o £20 note(s)", twentyPound)); }
            if (tenPound > 0) { System.out.println(String.format("%o £10 note(s)", tenPound)); }
            if (fivePound > 0) { System.out.println(String.format("%o £5 note(s)", fivePound)); }
            if (twoPound > 0) { System.out.println(String.format("%o £2 coin(s)", twoPound)); }
            if (onePound > 0) { System.out.println(String.format("%o £1 coin(s)", onePound)); }
            if (fiftyPence > 0) { System.out.println(String.format("%o 50p coin(s)", fiftyPence)); }
            if (twentyPence > 0) { System.out.println(String.format("%o 20p coin(s)", twentyPence)); }
            if (tenPence > 0) { System.out.println(String.format("%o 10p coin(s)", tenPence)); }
            if (fivePence > 0) { System.out.println(String.format("%o 5p coin(s)", fivePence)); }
            if (twoPence > 0) { System.out.println(String.format("%o 2p coin(s)", twoPence)); }
            if (onePenny > 0) { System.out.println(String.format("%o 1p coin(s)", onePenny)); }

        } else {
            System.out.println("Customer hasn't paid enough to cover the cost!");
        }
    }
}
