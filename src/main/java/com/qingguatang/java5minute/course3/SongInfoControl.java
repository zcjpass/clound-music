package com.qingguatang.java5minute.course3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.qingguatang.java5minute.course3.model.SongInfo;

@Controller
public class SongInfoControl {

    @RequestMapping(value = "/songinfo")
    public String index(ModelMap modelMap){

        SongInfo songInfo = new SongInfo();

        songInfo.setName("hello");
        songInfo.setSinger("Adele");
        songInfo.setAlbumName("hello");
        songInfo.setCommentCount(20);
        songInfo.setAlbumImg("http://p3.music.126.net/PrO7oPvnjvH4xdujdGbf2w==/1407374890649284.jpg?param=177y177");
        songInfo.setLyrics("hello,i love you");

        modelMap.addAttribute("song",songInfo);

        return "index.html";
    }
}
