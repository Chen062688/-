package com.chenzhen.blog.mapper;

import com.chenzhen.blog.pojo.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author MIS
* @description 针对表【t_comment】的数据库操作Mapper
* @createDate 2022-09-11 18:21:11
* @Entity com.chenzhen.blog.pojo.Comment
*/
@Mapper
public interface CommentMapper extends BaseMapper<Comment> {


    List<Comment> getRootCommentList(@Param("blogId") Long blogId);

    int saveComment(Comment comment);

    List<Comment> getReplyList(@Param("rootCommentId") Long rootCommentId,@Param("blogId") Long blogId);
}




