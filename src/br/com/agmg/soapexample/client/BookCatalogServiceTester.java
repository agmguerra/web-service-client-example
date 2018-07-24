package br.com.agmg.soapexample.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import br.com.agmg.soaexample.stubcode.Book;
import br.com.agmg.soaexample.stubcode.BookCatalog;
import br.com.agmg.soaexample.stubcode.BookCatalogService;

public class BookCatalogServiceTester {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("http://guerra-pc:8080/web-service-example/BookCatalogService?wsdl");
			BookCatalogService bookCatSrv = new BookCatalogService(url);
			BookCatalog bookCat = bookCatSrv.getBookCatalogPort();
			
			List<Book> lista  = bookCat.getBooks();
			lista.forEach(book -> System.out.println(book.getTitle()));

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
