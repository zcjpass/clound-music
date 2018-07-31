package com.qingguatang.java5minute.course5;

import com.qingguatang.java5minute.course4.model.Comment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;


@Controller
public class CommentPostControl {


    private static Map<String, List<Comment>> comments = new HashMap<>();


    @RequestMapping(value = "/comment/post")
    public String post(@RequestParam(value = "songId")String songId, Comment comment){

        Date commentTime = new Date();
        comment.setCommentTime(commentTime);

        comments.computeIfAbsent(songId,k->new ArrayList<>()).add(comment);

        List<Comment> commentList = comments.get(songId);
        Collections.sort(commentList, new Comparator<Comment>(){
            @Override
            public int compare(Comment o1, Comment o2) {

                if(o1.getCommentTime().after(o2.getCommentTime())) {

                    return -1;
                }
                return 1;
            }
        });
        return "redirect:/comments";
    }
    public List<Comment> getComments(String songId){
        return comments.get(songId);
    }
}
