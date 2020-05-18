package lab6.ch2;

public class Main {
    public static void main(String[] args) {
        Running rl = new Running(20, "Red");
        Running rr = new Running(20, "Red");
        Heels hr = new Heels(21, "Red");
        Heels hl = new Heels(21, "Red");


        try {
            Pair<Running> runningPair = new Pair<Running>(rl, rr);
            Pair<Heels> heelsPair = new Pair<Heels>(hr,hl);
            System.out.println(runningPair);
            System.out.println(heelsPair);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
