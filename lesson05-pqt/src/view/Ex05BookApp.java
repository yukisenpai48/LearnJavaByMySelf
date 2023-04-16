package view;

import java.util.Arrays;

import bean.Book;
import bean.ClassicalBook;
import bean.ReferenceBook;

public class Ex05BookApp {
	public static void main(String[] args) {
		Book[] books = initial();
		Book[] bookByPublisher = findBooks("Nhi Đồng", books);
		showBooks(bookByPublisher);

		System.out.println("=================");
		Book[] bookByLtPrice = findBooks(50, books);
		showBooks(bookByLtPrice);

		System.out.println("=================");
		Book[] bookByRangePrice = findBooks(40, 80, books);
		showBooks(bookByRangePrice);
		
		System.out.println("=================");
		System.out.println(totalBill(books));
	}

	private static double totalBill(Book... books) {
		double total = 0;
		for (Book book : books) {
			double price = book.getPrice();
			if (book.getId().startsWith("SGK")) {
				ClassicalBook cBook = (ClassicalBook)book;
				if (!cBook.isStatus()) {
					price *= 0.7;
				}
			} else {
				ReferenceBook rBook = (ReferenceBook)book;
					price *= (1 + rBook.getTax()/100);
			}
			total += price;
		}
		return total;
	}
	
	private static void showBooks(Book[] books) {
		for (Book book : books) {
			System.out.println(book);
		}
	}

	private static Book[] findBooks(double priceFrom, double priceUntil, Book[] books) {
		Book[] resultBooks = new Book[books.length];
		int index = 0;
		for (Book book : books) {
			if (book.getPrice() >= priceFrom && book.getPrice() <= priceUntil) {
				resultBooks[index++] = book;
			}
		}
		return Arrays.copyOfRange(resultBooks, 0, index);
	}

	private static Book[] findBooks(double ltPrice, Book[] books) {
		Book[] resultBooks = new Book[books.length];
		int index = 0;
		for (Book book : books) {
			if (book.getPrice() < ltPrice) {
				resultBooks[index++] = book;
			}
		}
		return Arrays.copyOfRange(resultBooks, 0, index);
	}

	private static Book[] findBooks(String publisher, Book[] books) {
		Book[] resultBooks = new Book[books.length];
		int index = 0;
		for (Book book : books) {
			if (publisher.equals(book.getPublisher())) {
				resultBooks[index++] = book;
			}
		}
		return Arrays.copyOfRange(resultBooks, 0, index);
	}

	private static Book[] initial() {
		return new Book[] { new ClassicalBook("SGK123", 22d, "Nhi Đồng", true),
				new ClassicalBook("SGK124", 32d, "Nhi Đồng", false), new ClassicalBook("SGK125", 65d, "Lạc Việt", true),
				new ReferenceBook("STKR13", 44d, "Lạc Việt", 5), new ReferenceBook("STKR43", 69d, "Nhi Đồng", 12),
				new ReferenceBook("STKR15", 60d, "Sao Mai", 7) };
	}

}
