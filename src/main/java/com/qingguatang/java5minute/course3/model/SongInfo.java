package com.qingguatang.java5minute.course3.model;

public class SongInfo {

    private String name;//歌名
    private String singer;//歌手
    private String albumName;//专辑名称
    private int commentCount;//评论数
    private String lyrics;//歌词
    private String albumImg;//专辑图片

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSinger() {

        return singer;
    }

    public void setSinger(String singer) {

        this.singer = singer;
    }

    public String getAlbumName() {

        return albumName;
    }

    public void setAlbumName(String albumName) {

        this.albumName = albumName;
    }

    public int getCommentCount() {

        return commentCount;
    }

    public void setCommentCount(int commentCount) {

        this.commentCount = commentCount;
    }

    public String getLyrics() {

        return lyrics;
    }

    public void setLyrics(String lyrics) {

        this.lyrics = lyrics;
    }

    public String getAlbumImg() {

        return albumImg;
    }

    public void setAlbumImg(String albumImg) {

        this.albumImg = albumImg;
    }
}
