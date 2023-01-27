package org.example;

import java.util.Scanner;

public class Credit implements cloneable
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
    Credit cr()
    {
        try
        {
            return (Credit) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            System.out.println("cloned");
            return this;
        }
    }


    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the card num:");
        Integer a=s.nextInt();
        Credit r=new Credit(a);
        Credit m=(Credit) r.cr();
        m.eq();
        m.show();

    }
}
