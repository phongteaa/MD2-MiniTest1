package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ProgrammingBook[] programmingBooks = new ProgrammingBook[5];
        programmingBooks[0] = new ProgrammingBook(123, "Welcome to Java", "Joe Biden", 10.0, "Java", "Spring");
        programmingBooks[1] = new ProgrammingBook(0, "C", "Obama", 70.0, "C", "WTF");
        programmingBooks[2] = new ProgrammingBook(666, "Python for Kids", "Nguyen Dong Chinh", 60.0, "Python", "Django");
        programmingBooks[3] = new ProgrammingBook(47, "PHP Guide", "Trinh Van Quyet", 0.1, "PHP", "Laravel");
        programmingBooks[4] = new ProgrammingBook(10, "Learn Javascript", "Phuong Hang", 200.0, "JS", "Angular");

        FictionBook[] fictionBooks = new FictionBook[5];
        fictionBooks[0] = new FictionBook(22, "Lam giau khong kho", "FLC Group", 1000.0, "Thieu nhi");
        fictionBooks[1] = new FictionBook(23, "Friday", "Tay", 100.0, "Khoa hoc");
        fictionBooks[2] = new FictionBook(24, "Mon ngon", "Phong", 236.0, "Nau an");
        fictionBooks[3] = new FictionBook(25, "Kiem tien", "XXX", 42.0, "Kinh doanh");
        fictionBooks[4] = new FictionBook(26, "Bao ve ban than", "John Cena", 99.0, "Vo thuat");

        System.out.println(programmingBooks[0]);
        System.out.println(fictionBooks[4]);

        double totalPrice1 = 0;
        int count = 0;
        for (ProgrammingBook pb : programmingBooks) {
            totalPrice1 += pb.getPrice();
            if (pb.getLanguage().equals("Java"))
                count++;
        }

        double totalPrice2 = 0;
        for (FictionBook fb : fictionBooks) {
            totalPrice2 += fb.getPrice();
        }

        System.out.println(totalPrice1 + totalPrice2);
        System.out.println(count);
    }
}
