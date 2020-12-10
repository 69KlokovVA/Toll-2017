/**
 * BusinessTest2.java
 * This program tests for deadlock situation.
 * @author www.codejava.net
 */

/*
Пример Deadlock

- Поток 1 входит в метод foo () и получает lock1 . В то же время поток 2 входит в метод bar () и получает lock2 .
        - Поток 1 пытается получить lock2, который в настоящее время удерживается потоком 2, следовательно, поток 1 блокируется.
        - Поток 2 пытается получить lock1, который в настоящее время удерживается потоком 1, следовательно, поток 2 блокируется.
        Оба потока блокируют друг друга навсегда, возникает тупик и программа зависает.
*/

public class BusinessTest2 {
    public static void main(String[] args) {
        Business business = new Business();

        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                public void run() {
                    business.foo();
                }
            }).start();
        }

        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                public void run() {
                    business.bar();
                }
            }).start();
        }
    }
}