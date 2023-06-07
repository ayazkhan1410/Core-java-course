package Seventh_chpter;

public class lect04_methods {
    public static void main(String[] args) {

        // concat

        // 1st method
        System.out.println(fname.concat(lname));

        // 2nd method
        // String fname = "Ayaz";
        // String lname = "Khan";
        // String fullname = fname + " " + lname;
        // System.out.println(fullname);

        // // sub string
        // String youtuber = "Ducky bhai";
        // String sen = youtuber.substring(0, 5);
        // System.out.println(sen);

        // // length
        // String youtuber = "Ducky bhai";
        // System.out.println(youtuber.length());

        // // Char at
        // String youtuber = "Duckybhai";
        // for (int i = 0; i < youtuber.length(); i++) {
        // System.out.println(youtuber.charAt(i));
        // }

        // touppercase
        // String name = "imran khan";
        // System.out.println(name.toUpperCase());

        // tolowercase
        // String name2 = "AYAZ KHAN";
        // System.out.println(name.toLowerCase());

        // equal to
        // System.out.println(name2.equals(name));

        // trim
        // String waqar = " ayaz ";
        // System.out.println(waqar.trim());

        // is empty
        // String d = "";
        // System.out.println(d.isEmpty());

        // index of
        // String ind = "Code with harry";
        // System.out.println(ind.indexOf('t'));

        // char at
        // String ind = "Code with harry";
        // System.out.println(ind.charAt(3));

        // starts with

        // System.out.println(str.startsWith("My"));

        // replace

        // System.out.println(str.replace("ayaz", "virat"));

        // replace all

        // System.out.println(str.replaceAll("My name is ayaz", "Subscribe my yt
        // channel"));

        // last index of

        // String str = "My name is ayaz";
        // System.out.println(str.lastIndexOf("is"));

        // compare to

        // String str = "Baber azam";
        // String str2 = "Baber azam";

        // // if str is equal to str2 then it return 0
        // // if str is less then to str2 then it return minus
        // // if str is bigger then str2 then it return plus

        // if (str.compareTo(str2) == 0) {
        // System.out.println("Both Scentence are equal");
        // } else if (str.compareTo(str2) < 0) {
        // System.out.println("str is less then to str2");
        // } else if (str.compareTo(str2) > 0) {
        // System.out.println("str is greater then to str2");
        // }

        // return unicode
        String str = "Cricket";
        int res = str.codePointAt(1);
        System.out.println(res);

    }
}
