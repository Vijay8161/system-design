package com.pm.systemdesign.creational.objectpool;

import java.util.Enumeration;
import java.util.Hashtable;

// Object Pool
public abstract class ObjectPool<T> {
    private final long deadTime;
    private final Hashtable<T,Long> lock;
    private final Hashtable<T,Long> unlock;

    public ObjectPool(){
        deadTime = 50000;
        lock = new Hashtable<>();
        unlock = new Hashtable<>();
    }

    abstract T create();

    abstract boolean validate(T o);

    abstract void dead(T o);

    public synchronized T takeOut(){
        long now = System.currentTimeMillis();
        T t;
        if(!unlock.isEmpty()){
            Enumeration<T> e = unlock.keys();
            while(e.hasMoreElements()){
                t = e.nextElement();
                if((now - unlock.get(t)) > deadTime){
                    unlock.remove(t);
                    dead(t);
                    t = null;
                } else {
                    if(validate(t)) {
                        unlock.remove(t);
                        lock.put(t,now);
                        return t;
                    } else {
                        unlock.remove(t);
                        dead(t);
                        t = null;
                    }
                }
            }
        }
        t = create();
        lock.put(t,now);
        return t;
    }

    public synchronized void takeIn(T t){
        lock.remove(t);
        unlock.put(t,System.currentTimeMillis());
    }
}
