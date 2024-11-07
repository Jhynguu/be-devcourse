class Book {
    String title;
    String author;
    String price;

    Book(String title, String author, String price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

public class ArrayEx01 {
    public static void main(String[] args) {
        int[] intArray = new int[3];
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;

        for(int data : intArray) {
            System.out.println(data);
        }

        // 참조 자료형 배열
        Book book1 = new Book("Java", "홍길동", "1000");
        Book book2 = new Book("JSP", "박문수", "2000");
        Book book3 = new Book("Spring", "이몽룡", "3000");

        Book[] bookArray = new Book[3];
        bookArray[0] = book1;
        bookArray[1] = book2;
        bookArray[2] = book3;

        System.out.println("권수 : " + bookArray.length);
        System.out.print(bookArray[0].title);
        System.out.println(bookArray[0].author);

        // for 통해서 전체 데이터 출력
        for (int i = 1; i < bookArray.length; i++) {
            System.out.print(bookArray[i].title);
            System.out.println(bookArray[i].author);
        }

        // 향샹된 for
        for (Book data : bookArray) {
            System.out.println("제목 : " + data.title + ", 저자 : " + data.author + ", 가격 : "+ data.price);
        }
    }
}