public class Tester {
    public static void main(String[] args) {
        Grid g = new Grid(25, 10, 10);
        // System.out.println(g.get(0,0));
        g.calculateNumMines();
        System.out.println(g.toString());
    }
}
