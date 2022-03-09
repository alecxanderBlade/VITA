package com.example.vita;

import android.view.animation.Interpolator;

public class BounceInterpolator implements Interpolator {


    private double Amplitude=1;
    private double Frequnecy=10;

    BounceInterpolator(double amplitude, double frequnecy){
        Amplitude = amplitude;
        Frequnecy= frequnecy;
    }



    @Override
    public float getInterpolation(float time) {
        return (float)(-1*Math.pow(Math.E, -time/Amplitude)*Math.cos(Frequnecy*time));
    }
}
