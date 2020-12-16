package com.gabigutu.factory;

import com.gabigutu.factory.IVideoPlayer;

public class MediaPlayerOnlyMusic implements IVideoPlayer {

    private boolean playVideos;

    public MediaPlayerOnlyMusic() {
        playVideos = false;
    }

    @Override
    public void playVideo() {
    }
}
