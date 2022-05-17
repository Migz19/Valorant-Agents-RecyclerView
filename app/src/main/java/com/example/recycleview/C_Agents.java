package com.example.recycleview;

import android.widget.Button;

import java.util.ArrayList;

public class C_Agents {

    private String name,caption;
    private int timeline_image,profimage;
    //private Button button1;
    public C_Agents(String agent,String caption, int img2 ,int img1){
        this.timeline_image=img1;
        this.name=agent;
        this.profimage=img2;
        this.caption=caption;

    }


    public String getName(){
        return name;
    }
    public int getTimeline_image(){
        return timeline_image ;
    }
    public int getProfile_image(){
        return profimage;
    }
    public String getCaption(){
        return caption;
    }


    }

