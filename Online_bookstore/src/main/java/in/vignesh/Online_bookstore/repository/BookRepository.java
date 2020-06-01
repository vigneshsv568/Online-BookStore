package in.vignesh.Online_bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vignesh.Online_bookstore.entry.Book;

public interface BookRepository extends JpaRepository<Book , Long>{
	

}
