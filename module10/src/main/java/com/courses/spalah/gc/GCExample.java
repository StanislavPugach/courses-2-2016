package com.courses.spalah.gc;

/**
 * @author Ievgen Tararaka
 */
public class GCExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start APP");
        GCExample[] gcs = new GCExample[10];

        for (int i = 0; i < gcs.length; i++) { // создаем объекты
            GCExample g = new GCExample();
            gcs[i] = g;
        }

        for (int i = 0; i < gcs.length / 2; i++) { // обнуляем ссылки на половину объектов
            gcs[i] = null;
        }
        Thread.sleep(1000);
        System.gc(); // вызов сборщика мусора
        Thread.sleep(1000);
        System.out.println("Finish APP");
    }

    @Override
    protected void finalize() throws Throwable { // finalize() вызывается перед удалением объекта сборщиком мусора
        System.out.println("Теперь я - мусор и меня пытаются удалить " + this);
    }
}
