public class ThreadPriority extends Thread
{
    public void run()
    {
        for (int i=1; i<=10; i++)
        System.out.println("running..."+this.getName());
    }
    public static void main(String args[])
    {

        ThreadPriority t0=new ThreadPriority();
        ThreadPriority t1=new ThreadPriority();
        ThreadPriority t2=new ThreadPriority();
        t0.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t0.start();
        t1.start();
        t2.start();
    }
}

/*
        running...Thread-0
        running...Thread-0
        running...Thread-0
        running...Thread-0
        running...Thread-0
        running...Thread-0
        running...Thread-0
        running...Thread-0
        running...Thread-0
        running...Thread-0
        running...Thread-2
        running...Thread-1
        running...Thread-1
        running...Thread-1
        running...Thread-2
        running...Thread-1
        running...Thread-1
        running...Thread-1
        running...Thread-1
        running...Thread-1
        running...Thread-1
        running...Thread-1
        running...Thread-2
        running...Thread-2
        running...Thread-2
        running...Thread-2
        running...Thread-2
        running...Thread-2
        running...Thread-2
        running...Thread-2
*/
