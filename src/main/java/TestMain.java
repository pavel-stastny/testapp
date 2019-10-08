
public class TestMain {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Test openshift");

        Thread.sleep(1000*10);

        System.out.println("Test openshift after 10 seconds .. ");

        Thread.sleep(1000*60);
        System.out.println("Test openshift after minute .. ");


        Thread.sleep(1000*60*5);
        System.out.println("Test openshift after 5 minutes  .. ");

        Thread.sleep(1000*60*15);
        System.out.println("Test openshift after 15 minutes  .. ");
    }
}
