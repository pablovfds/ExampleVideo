package com.example.pblovctor.examplevideo;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    private static String apiKey = "AIzaSyChv260Fm8Rc7OuDDAuy7mdVIisOGkVAx4";
    private String video = "i3vO01xQ-DM";
    private YouTubePlayerView youTube;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        youTube = (YouTubePlayerView) findViewById(R.id.video_youtube);
        youTube.initialize(apiKey, this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean load) {
        Log.d("load", "log1");
        if (!load){
            Log.d("load", "log1");
            youTubePlayer.cueVideo(video);
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        Toast.makeText(MainActivity.this, "onInitializationFailure()", Toast.LENGTH_SHORT).show();
    }
}
