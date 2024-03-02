public class App {
    public static void main(String[] args) throws Exception {
        Director dir1 = new Director();
        IBuilder builder1 = new shape1();
        IBuilder builder2 = new shape2();

        System.out.println(dir1.BuildShape(builder1).BilgiGoster());
        System.out.println(dir1.BuildShape(builder2).BilgiGoster());
    }
}
