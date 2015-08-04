package leacock.mrnom.framework.impl;

import java.io.IOException;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.AudioManager;
import android.media.SoundPool;

import leacock.mrnom.framework.Audio;
import leacock.mrnom.framework.Music;
import leacock.mrnom.framework.Sound;


public class AndroidAudio implements Audio{

    AssetManager assets;
    SoundPool soundPool;

    public AndroidAudio(Activity activity){

        activity.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        this.assets=activity.getAssets();
        this.soundPool=new SoundPool(20, AudioManager.STREAM_MUSIC, 0);

    }

    public Music newMusic(String filename){

        try{
            AssetFileDescriptor assetFileDescriptor = assets.openFd(filename);
            return new AndroidMusic(assetFileDescriptor);
        } catch (IOException e){
            throw new RuntimeException("Couldn't load music " + filename);
        }

    }

    public Sound newSound(String filename){

        try{
            AssetFileDescriptor assetDescriptor=assets.openFd(filename);
            int soundId=soundPool.load(assetDescriptor, 0);
            return new AndroidSound(soundPool, soundId);
        } catch (IOException e){
            throw new RuntimeException("Couldnt load sound "+filename);
        }


    }


}
