package org.example;

import java.util.Scanner;

public class Credit implements Cloneable
{
    Integer cardno;
    String name;
    Integer date;

    Integer cardnum;

    Credit(Integer a)
    {
        name="ragul";
        cardno=1234;
        date=2025;
        this.cardnum=a;

    }
    void eq()
    {
        System.out.println(cardno.equals(cardnum));
    }
    void show()
    {
        System.out.println(name);
        System.out.println(cardnum);
        System.out.println(date);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the card num:");
        Integer a=s.nextInt();
        Credit r=new Credit(a);
        Credit m=(Credit) r.clone();
        m.eq();
        m.show();

    }
}