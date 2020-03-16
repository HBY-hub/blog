package com.hby.blog.service;

import com.hby.blog.po.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);
    Comment saveComment(Comment comment);
}
