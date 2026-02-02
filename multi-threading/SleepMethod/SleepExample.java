class SleepExample extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Count : " + i);
                Thread.sleep(1000); // pause for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
 public static void main(String[] args) {
        SleepExample t1 = new SleepExample();
        t1.start();
    }
}