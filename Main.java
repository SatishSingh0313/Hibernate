package com.many.to.many;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Persistence;


@Entity
 class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "author_book",
        joinColumns = @JoinColumn(name = "author_id"),
        inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    
    private Set<Book> books = new HashSet<Book>();

	public Long getId() {
		return id;
	}

	public Author() {
		super();
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}}



@Entity
 class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToMany(mappedBy = "books")
    private Set<Author> authors = new HashSet<Author> ();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	public Book() {
		super();
	}
    
}

class Main{
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("satish");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Author author1 = new Author();
		author1.setName("John Doe");

		Author author2 = new Author();
		author2.setName("Jane Smith");

		Book book1 = new Book();
		book1.setTitle("Introduction to Hibernate");

		Book book2 = new Book();
		book2.setTitle("Advanced Hibernate Techniques");

		author1.getBooks().add(book1);
		author1.getBooks().add(book2);

		author2.getBooks().add(book2);

		
		et.begin();
		em.persist(author1);
		em.persist(author2);
		em.persist(book1);
		em.persist(book2);
		et.commit();

	}
}