package com.pm.systemdesign.creational.objectpool;

public class ConnectionPool extends ObjectPool<ConnectionResource>{
    @Override
    protected ConnectionResource create() {
        return new ConnectionResource();
    }

    @Override
    protected boolean validate(ConnectionResource o) {
        return o != null;
    }

    @Override
    protected void dead(ConnectionResource o) {
        o.close();
    }
}
