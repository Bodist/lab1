package com.company;

public class Eggs extends Food {

    private String number;

    public Eggs (){
        super("Eggs");
    }

    public Eggs (String number){ //конструктор
        super("Eggs");
        this.number = number;
    }
    @Override
    public void consume(){
        if(this.number ==null)
            System.out.println(this+ " съедено");
        else
            System.out.println( number +" "+this+ " съедено");
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

}
