package com.learn.ssm.chapter9;

import java.io.*;

public class Pond implements Serializable {
    private static final long serialVersionUID = 3639285949140443689L;
    private transient Duck duck = new Duck();

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pond{" +
                "duck=" + duck +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        Pond myPond = new Pond();
        myPond.setSize(1);
        try {
            FileOutputStream fs = new FileOutputStream("Pond.txt");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(myPond);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fi = new FileInputStream("Pond.txt");
            ObjectInputStream os = new ObjectInputStream(fi);
            Pond restorePond = (Pond) os.readObject();
            System.out.println(restorePond.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Duck {
}
