package com.qingguatang.java5minute.course7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;


@Controller
public class MusicControl {

    private static final Map<String,String> musics = new HashMap<>();
    @RequestMapping(value = "/song/music")
    @ResponseBody
    public String getMusicSrc(String songId){
        return musics.get(songId);
    }
    @PostConstruct
    public void init(){
        musics.put("35847388","https://m10.music.126.net/20180822234122/8888b56dacae16150dd26928d2372d2e/ymusic/de9a/6885/e183/effb8f74546c98fd619d51f22e2bfaaf.mp3");
        musics.put("16435049","https://m10.music.126.net/20180822234323/03087845b8b8972d4cbb56a4558e626b/ymusic/de9a/6885/e183/effb8f74546c98fd619d51f22e2bfaaf.mp3");

    }
}
