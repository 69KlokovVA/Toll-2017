// источник https://www.codeflow.site/ru/article/java-thread-yield
public class ThreadYield {
    public static void main(String[]args) {
        Runnable r = () -> {
            int counter = 0;
            while (counter < 2) {
                System.out.println(Thread.currentThread()
                        .getName());
                counter++;
                Thread.yield(); //Как следует из официальной документации, yield () предоставляет механизм для информирования «планировщика» о том,
                // что текущий поток готов отказаться от своего текущего использования процессора, но хотел бы, чтобы его запланировали как можно скорее.
            }
        };
        new Thread(r).start();
        new Thread(r).start();
    }
}