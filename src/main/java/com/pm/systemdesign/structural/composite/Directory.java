package com.pm.systemdesign.structural.composite;

import java.util.ArrayList;
import java.util.List;

//3. Composite
public class Directory extends FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name){
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Directory " + name);
        for(FileSystemComponent component : components){
            component.display();
        }
    }

    public void addComponent(FileSystemComponent component){
        components.add(component);
    }
}
