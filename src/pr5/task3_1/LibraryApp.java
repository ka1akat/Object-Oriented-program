package pr5.task3_1;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import pr5.task3.Book;

public class LibraryApp {
	public static void main(String[] args) {
		ArrayList<Book> books = loadBooks();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
            System.out.println("\nMenu:");
            System.out.println("A - Add book");
            System.out.println("L - List books");
            System.out.println("S - Save");
            System.out.print("Choose: ");
            
            String choice = scan.nextLine().toUpperCase();
            
            if(choice.equals("A")) {
                System.out.print("Enter title: ");
                String title = scan.nextLine();

                System.out.print("Enter author: ");
                String author = scan.nextLine();
                
                Book book = new Book(title,author);
                books.add(book);
                System.out.println("Book added.");
            
            }else if(choice.equals("L")) {
            	if(books.isEmpty()) {
            		System.out.println("Library is empty.");
            	}else {
            		for(Book book : books) {
            			book.visit();
            			System.out.println(book);
            		}
            	}
            }else if(choice.equals("S")) {
            	saveBooks(books);
                System.out.println("Books saved. Goodbye");
                break;
            }else {
                System.out.println("Wrong choice");
            }    
		}
        scan.close();
		
		
	}
	
	public static ArrayList<Book> loadBooks(){
		File file = new File("src/pr5/task3_1/library1.dat");
		
		if(!file.exists()) {
			return new ArrayList<Book>();
		}
		
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))){
			return (ArrayList<Book>) in.readObject();
			
		} catch(IOException | ClassNotFoundException e){
			System.out.println("Error loading books: " + e.getMessage());
            return new ArrayList<Book>();
		}
		
	}
	public static void saveBooks(ArrayList<Book> books) {
		try(ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream("src/pr5/task3_1/library1.dat"))) {
			out.writeObject(books);
		} catch (IOException e) {
            System.out.println("Error saving books: " + e.getMessage());
        }
		
	}

}
