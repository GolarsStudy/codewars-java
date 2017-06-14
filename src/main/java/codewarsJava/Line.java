// http://www.codewars.com/kata/555615a77ebc7c2c8a0000b8
package codewarsJava;

public class Line {

    public static String Tickets(int[] peopleInLine) {
        Vasya vasya = new Vasya();

        for (int i : peopleInLine) {
            if (!vasya.saleTicket(i)) {
                return "NO";
            }
        }
        return "YES";
    }

    private static class Vasya {
        private int b25 = 0;
        private int b50 = 0;

        private boolean saleTicket(int ticket) {
            switch (ticket) {
                case 25: {
                    this.b25++;
                    return true;
                }
                case 50: {
                    this.b50++;
                    return this.giveMoneyBackFifty();
                }
                case 100: {
                    return this.giveMoneyBackOneHundred();
                }
            }
            return true;
        }

        private boolean giveMoneyBackOneHundred() {
            if (this.b50 >= 1 && this.b25 >= 1) {
                this.b50--;
                this.b25--;
                return true;
            }

            if (this.b25 < 3) {
                return false;
            }

            this.b25 -= 3;
            return true;
        }

        private boolean giveMoneyBackFifty() {
            if (this.b25 < 1) {
                return false;
            }
            this.b25 -= 1;
            return true;
        }
    }
}
