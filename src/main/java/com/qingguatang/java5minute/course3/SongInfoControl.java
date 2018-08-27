package com.qingguatang.java5minute.course3;

import com.qingguatang.java5minute.course5.CommentPostControl;
import com.qingguatang.java5minute.course4.model.Comment;
import com.qingguatang.java5minute.course3.model.SongInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SongInfoControl {

        private static Map<String,SongInfo> songInfoMap = new HashMap<>();
        @Autowired
        private CommentPostControl commentPostControl;

        @RequestMapping(value = "/songinfo")
        public String index(String songId, ModelMap modelMap){

            if(songId == null){
                songId = "35847388";
            }
            SongInfo songInfo = songInfoMap.get(songId);
            modelMap.addAttribute("song", songInfo);
            List<Comment> comments = commentPostControl.getComments(songId);
            modelMap.addAttribute("comments", comments);

            return "index";
        }

        @RequestMapping(value = "/songinfo/get")
        public SongInfo get(String songId){

            SongInfo songInfo  = songInfoMap.get(songId);
            return songInfo;
        }

        @PostConstruct
        public void init(){
            SongInfo songInfo = new SongInfo();
            songInfo.setId("35847388");
            songInfo.setName("hello");
            songInfo.setSinger("Adele");
            songInfo.setAlbumName("hello");
            songInfo.setCommentCount(10);
            songInfo.setAlbumImg("https://p4.music.126.net/PrO7oPvnjvH4xdujdGbf2w==/1407374890649284.jpg?param=177y177");
            songInfo.setLyrics("hello,it is me");
            songInfoMap.put("35847388",songInfo);

            songInfo = new SongInfo();
            songInfo.setId("16435049");
            songInfo.setName("Someone Like You");
            songInfo.setSinger("Adele");
            songInfo.setAlbumName("21");
            songInfo.setCommentCount(12960);
            songInfo.setAlbumImg("https://p1.music.126.net/-g2ieFBmoy7T8crwFaAdxQ==/109951163077007716.jpg?param=130y130");
            songInfo.setLyrics("I let it fall, my heart");
            songInfoMap.put("16435049",songInfo);

        }
}
