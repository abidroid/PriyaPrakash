package com.intellilogics.priyaprakash;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.videoView);
        mediaController = new MediaController(this);
    }

    public void playVideo(View view) {

        Uri uri = Uri.parse("android.resource://com.intellilogics.priyaprakash/" + R.raw.priya);

        videoView.setVideoURI(uri);

        videoView.setMediaController(mediaController);

        mediaController.setAnchorView(videoView);

        videoView.start();
    }
}
