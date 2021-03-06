package com.example.site00.repos;

import com.example.site00.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {
    List <Message> findByTag(String tag);
}
