package org.example.repository;

import org.example.entity.CommentEntity;
import org.springframework.data.repository.CrudRepository;

public interface CommentEntityRepository extends CrudRepository<CommentEntity,Integer> {
}
