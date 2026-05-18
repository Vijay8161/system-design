package com.pm.systemdesign.creational.objectpool;

public class ConnectionResource {
    private static int counter = 0;
    private int id;

    public ConnectionResource()
    {
        id = ++counter;
        System.out.println("Creating Resource #" + id);
    }

    public void use()
    {
        System.out.println("Using Resource #" + id);
    }

    public void close()
    {
        System.out.println("Closing Resource #" + id);
    }
}
