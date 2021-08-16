/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronize;

/**
 *
 * @author AnhTTV
 */
class Q {
int n;

synchronized int get() {
try {
notify();
wait();
} catch (InterruptedException e) {
System.out.println("InterruptedException caught");
}
System.out.println("Got: " + n);
try{
            Thread.sleep(500);
        }catch(InterruptedException e){}
return n;
}

synchronized void put(int n) {
try {
notify();
wait();
} catch (InterruptedException e) {
System.out.println("InterruptedException caught");
}
this.n = n;
System.out.println("Put: " + n);
try{
            Thread.sleep(500);
        }catch(InterruptedException e){}
}
}

class Producer implements Runnable {
Q q;

Producer(Q q) {
this.q = q;
new Thread(this, "Producer").start();
}

public void run() {
int i = 0;
while (true) {
q.put(i++);
}
}
}

class Consumer implements Runnable {
Q q;

Consumer(Q q) {
this.q = q;
new Thread(this, "Consumer").start();
}

public void run() {
while (true) {
q.get();
}
}
}

class PCFixed {
public static void main(String args[]) {
Q q = new Q();
new Producer(q);
new Consumer(q);
System.out.println("Press Control-C to stop.");
}
}   
