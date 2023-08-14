package org.example.port;

import org.example.entity.Comment;

import java.util.List;

public interface CommentService {

    Comment createComment(String title,String content);
    List<Comment> getAllComments();
    Comment getCommentById(int id);
    void deleteComment(int id);


}
