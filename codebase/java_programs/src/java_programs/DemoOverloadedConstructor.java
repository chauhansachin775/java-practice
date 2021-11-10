package java_programs;

import java.util.Scanner;

class BookInfo {
	// book information program
	private int bookId;
	private String pubName; // publisher name
	private String authName; // author name
	private String isbnNo;
	private String genre;
	private String type; // hard cove, paperback, ebook
	private double price; // dynamic nature
	private int noOfCopiesPrint; // dynamic nature(no. of copies printed)
	private int soldCopies; // dynamic nature

	static Scanner in = new Scanner(System.in);
	

	BookInfo() {
		System.out.println("enter book Id: ");
		this.bookId = in.nextInt();
		in.nextLine();
		System.out.println("enter the publisher name: ");
		this.pubName = in.nextLine();
		//in.nextLine();
		System.out.println("enter the author name: ");
		this.authName = in.nextLine();
		System.out.println("enter ISBN number: ");
		this.isbnNo = in.nextLine();
		System.out.println("enter genre: ");
		this.genre = in.nextLine();
		System.out.println("enter price: ");
		this.price = in.nextDouble();
		in.nextLine();
		System.out.println("enetr the type of the book: ");
		this.type = in.nextLine();
		System.out.println();
	}

	void display() {
		System.out.println("book Id: " + bookId);
		System.out.println("publisher name: " + pubName);
		System.out.println("author name: " + authName);
		System.out.println("ISBN number: " + isbnNo);
		System.out.println("genre: " + genre);
		System.out.println("price: " + price);
		System.out.println("type: " + type);
		System.out.println("no. of copies printed: " + noOfCopiesPrint);
		System.out.println("no. of sold copies: " + soldCopies);
	}

	void setNoOfCopiesPrint(int noOfCopiesPrint) {
		this.noOfCopiesPrint = noOfCopiesPrint;
	}

	int getNoOfCopiesPrint() {
		return this.getNoOfCopiesPrint();
	}

	void setSoldCopies(int soldCopies) {
		this.soldCopies = soldCopies;
	}

	int getsoldCopies() {
		return this.soldCopies;
	}
}

public class DemoOverloadedConstructor {
	public static void main(String[] args) {

		System.out.print("do you want to enter new book Info ? Y/N:\t");
		char newCnf = BookInfo.in.next().charAt(0);
		int i;
		if (newCnf == 'y' || newCnf == 'Y') {
			for (i = 1; i <= 5; i++) {
				System.out.println("entered new book Info-- \n");
				BookInfo bi = new BookInfo();
				bi.display();
				System.out.println();

				System.out.println("do you want to enter prints and selling Info? Y/N:\t");
				char ans = BookInfo.in.next().charAt(0);
				if (ans == 'Y' || ans == 'y') {
					System.out.println("enter the number of copies printed: ");
					int noOfCopiesPrint = BookInfo.in.nextInt();
					bi.setNoOfCopiesPrint(noOfCopiesPrint);

					System.out.println("enter the number of copies sold: ");
					int soldCopies = BookInfo.in.nextInt();
					bi.setSoldCopies(soldCopies);
					System.out.println();
					bi.display();
				}
				else {
					System.out.println("you have chosen no, thank you!!!");
				}
					
				System.out.println();

				System.out.println("do you want to enter any other book info ? Y/N");
				newCnf = BookInfo.in.next().charAt(0);
				if (newCnf == 'y' || newCnf == 'Y') {
					i++;
				} else {
					System.out.println("you have chosen no, thank you!!!");
					break;
					}
			}
		}

		else if (newCnf == 'n' || newCnf == 'N') {
			System.out.println("you have chosen NO, thank you!!");
		} else {
			System.out.println("you have chosen wrong option!!!");
		}

	}
}
