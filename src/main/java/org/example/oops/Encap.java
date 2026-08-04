package org.example.oops;

public class Encap {
    private int id;
    private String name;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class driver{
    public static void main(String[] args) {
        Encap encap = new Encap();
        encap.setId(10);
        encap.setName("abc");
        System.out.println(encap.getId());
        System.out.println(encap.getName());
    }
}
