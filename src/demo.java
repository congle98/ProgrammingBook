import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProgrammingBook books[] = new ProgrammingBook[10];
        books[0] = new ProgrammingBook("01","javabook",500,2,"công","java","code");
        books[1] = new ProgrammingBook("02","pythonbook",800,2,"toàn","python","code");
        books[2] = new ProgrammingBook("03","python1book",600,2,"công","python","code");
        books[3] = new ProgrammingBook("04","java1book",1000,4,"huy","java","code");
        books[4] = new ProgrammingBook("05","java2book",2000,2,"tiến","java","code");
        books[5] = new ProgrammingBook("06","python3book",1200,2,"hoàng","python","code");
        books[6] = new ProgrammingBook("07","javaScriptBook",1300,2,"hà","javaScript","code");
        books[7] = new ProgrammingBook("08","javaScript1Book",1500,2,"hà","javaScript","code");
        books[8] = new ProgrammingBook("09","javaScript1Book2",1700,2,"tùng","javaScript","code");
        books[9] = new ProgrammingBook("10","htmlBook",1800,2,"thắng","html","code");

        int totalPrice=0;
        int countJava=0;


//         tổng tiền cả 10 đầu sách
        for (int i = 0; i < books.length; i++) {
            totalPrice+= books[i].getPrice();
        }
        System.out.println(totalPrice);

        //đếm số sách có language là java:
        for (int i = 0; i < books.length; i++) {
            if(books[i].getLanguage()=="java"){
                countJava++;
            }
        }
        System.out.println(countJava);

        //tìm sách có giá tiền nhỏ hơn
        System.out.println("Mời nhập giá tiền: ");
        int price = sc.nextInt();
        for (int i = 0; i < books.length; i++) {
            if(books[i].getPrice()<price){
                System.out.println(books[i].getName());
            }
        }

    }
}
