package com.pm.systemdesign.creational.objectpool;

public class Client {
    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool();
        ConnectionResource r1 = pool.takeOut();
        r1.use();
        pool.takeIn(r1);
        ConnectionResource r2 = pool.takeOut();
        r2.use();
        pool.takeIn(r2);
    }
}
