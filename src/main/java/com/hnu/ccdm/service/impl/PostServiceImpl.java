package com.hnu.ccdm.service.impl;

import com.hnu.ccdm.entity.Post;
import com.hnu.ccdm.entity.PostExample;
import com.hnu.ccdm.mapper.PostMapper;
import com.hnu.ccdm.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostMapper postMapper;

    @Override
    public int addPost(Post post) {
        return postMapper.insert(post);
    }

    @Override
    public Post getPostById(String id) {
        return postMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Post> getPostList() {
        return postMapper.selectByExampleWithBLOBs(new PostExample());
    }

    @Override
    public int deletePostById(String id) {
        return postMapper.deleteByPrimaryKey(id);
    }
}
