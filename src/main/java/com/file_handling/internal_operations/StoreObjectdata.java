package com.file_handling.internal_operations;

import java.io.*;

public class StoreObjectdata  {
    public static void main(String[] args)  {
        try{
        Person p1= new Person(8908,"Rahul","Nagpur",8829380);
        FileOutputStream fout= new FileOutputStream("Myinfo.txt");
        ObjectOutputStream obj= new ObjectOutputStream(fout);
        obj.writeObject(p1);
        obj.close();
        fout.close();
        System.out.println("Data Entered Successfully");
        }
        catch(Exception e){
            System.out.println(e);

        }
    }



}

class Person implements Serializable{
    private int id;
    private String name;
    private String address;
    private long phone;

    Person(int id,String name,String address,long phone){
        this.id = id;
        this.name=name;
        this.address=address;
        this.phone=phone;

    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                '}';
    }
}
