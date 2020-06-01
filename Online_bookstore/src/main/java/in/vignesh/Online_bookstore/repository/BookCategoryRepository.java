package in.vignesh.Online_bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.vignesh.Online_bookstore.entry.BookCategory;


@RepositoryRestResource(collectionResourceRel="bookCategories" , path="book-category")


public interface BookCategoryRepository extends JpaRepository<BookCategory , Long> {

}
