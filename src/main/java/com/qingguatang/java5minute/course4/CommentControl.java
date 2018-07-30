package com.qingguatang.java5minute.course4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.qingguatang.java5minute.course4.model.Comment;
import java.util.List;
import java.util.ArrayList;

@Controller
public class CommentControl {

    @RequestMapping(value = "/comments")
    public String comments(ModelMap modelMap){

        List<Comment> comments = getComment();

       modelMap.addAttribute("comments",comments);

       return "comments";
    }
    private List<Comment> getComment(){

        List<Comment> comments = new ArrayList<>();

        Comment comment = new Comment();

        comment.setIcon("http://p1.music.126.net/vGKrH1IzLT27xF8TPEGE7Q==/109951163411337685.jpg?param=50y50");
        comment.setNickName("AriLuv:");
        comment.setContent("hello！一转眼四年了！终于等到王者的归来~阿呆的全球屠榜又要开始啦！在此献上我的鸡腿！嘻嘻~");
        comment.setCommentTime("2015年10月23日");
        comment.setLikeNum(10);

        comments.add(comment);

        return comments;
    }
}
