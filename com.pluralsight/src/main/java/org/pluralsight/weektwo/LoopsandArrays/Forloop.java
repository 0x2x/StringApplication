package org.pluralsight.weektwo.LoopsandArrays;

public class Forloop {
    static void main() throws InterruptedException  {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
            if(i == 1) {
                System.out.println("Blast OFF");
            }
        }
    }
}
