public class Main {

    public static void main(String[] args) throws Exception {
        normal();
//        forkJoin();

    }

    private static void normal() {
        long begin = System.currentTimeMillis();
        MyRecursiveTask myRecursiveTask1 = new MyRecursiveTask(1000);
        MyRecursiveTask myRecursiveTask2 = new MyRecursiveTask(2000);


        Object o1 = myRecursiveTask1.compute();
        Object o2 = myRecursiveTask2.compute();
        System.out.println("o1="+o1);
        System.out.println("o2="+o2);
        long end = System.currentTimeMillis();
        System.out.println(end-begin);
    }

    private static void forkJoin() throws Exception{
        long begin = System.currentTimeMillis();
        MyRecursiveTask myRecursiveTask1 = new MyRecursiveTask(1000);
        MyRecursiveTask myRecursiveTask2 = new MyRecursiveTask(2000);
        myRecursiveTask1.fork();
        myRecursiveTask2.fork();


        Object o1 = myRecursiveTask1.get();
        Object o2 = myRecursiveTask2.get();
        System.out.println("o1="+o1);
        System.out.println("o2="+o2);
        long end = System.currentTimeMillis();
        System.out.println(end-begin);
    }
}
