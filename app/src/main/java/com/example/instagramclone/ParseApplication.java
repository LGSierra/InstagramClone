package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
            .applicationId("YPZyb3BtYgJ2hP2Vg2pZSADBvqXul6popVqEoLZ6")
            .clientKey("CrpoomIQdFRfgq6f2wf0xptjOEqrpeOJNya6drLm")
            .server("https://parseapi.back4app.com")
            .build()
            );
    }
}
