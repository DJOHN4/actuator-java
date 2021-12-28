package com.comptivia.trade.protfoliomanager.repository;

import com.comptivia.trade.protfoliomanager.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
    
}
