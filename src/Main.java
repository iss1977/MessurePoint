import measurePoint.Measurepoint;

public class Main {
    public static void main(String[] args) {
        Measurepoint p1 = new Measurepoint(3,20,50);
        Measurepoint p2 = new Measurepoint(3,20,50);
        System.out.println("Compared:"+p1.equals(p2));
    }
}
