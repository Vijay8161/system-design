package com.pm.systemdesign.structural.composite;

//4.Client
public class Main {
    public static void main(String[] args) {
        // Create leaf objects (files)
        FileSystemComponent file1 = new File("doc.txt",1024);
        FileSystemComponent file2 = new File("image.png",2048);

        // Create a composite object (directory)
        Directory directory = new Directory("My Documents");

        // Add leaf objects to the directory
        directory.addComponent(file1);
        directory.addComponent(file2);

        // Display the directory (including its contents)
        directory.display();
    }
}
