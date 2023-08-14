package org.example.service;

import org.example.entity.Comment;
import org.example.port.CommentRepository;
import org.example.port.CommentService;

import java.util.List;

public class CommentServiceImpl implements CommentService {

    private CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository){
        this.commentRepository=commentRepository;
    }


    @Override
    public Comment createComment(String title, String content) {
        Comment comment = new Comment(title,content);
        return commentRepository.save(comment);
    }

    @Override
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    @Override
    public Comment getCommentById(int id) {
        return commentRepository.findById(id);
    }

    @Override
    public void deleteComment(int id) {
        Comment comment = getCommentById(id);
        commentRepository.delete(comment);
    }
}
