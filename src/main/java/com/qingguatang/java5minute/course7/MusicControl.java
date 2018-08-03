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

        musics.put("35847388","http://120.198.224.101/cache/m10.music.126.net/20180803165451/72a8ffa866c0fedfc739a0f3b1804b1e/ymusic/de9a/6885/e183/effb8f74546c98fd619d51f22e2bfaaf.mp3?ich_args2=1299-03162900002462_e428c2d5c2e0c8728df003b8884939aa_10012302_9c89672fd5cbf5d89e3b518939a83798_7696b7a6256c7fa0adb6e781453f525c");

    }
}
