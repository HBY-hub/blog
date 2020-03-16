package com.hby.blog.service;

import com.hby.blog.po.Blog;
import com.hby.blog.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface BlogService {
    Blog getBlog(Long id);
    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);
    Page<Blog> listBlog(Pageable pageable);
    Page<Blog> listBlog(String query,Pageable pageable);
    Page<Blog> listBlog(Long id,Pageable pageable);
    Blog getAndConvert(Long id);
    List<Blog> listRecommendBlogTop(Integer size);
    Map<String,List<Blog>> archiveBlog();
    Long countBlog();
    Blog saveBlog(Blog blog);
    Blog updateBlog(Long id,Blog blog);
    void deleteBlog(Long id);
}
