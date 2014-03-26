/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apollo;

import apollo.composer.Composer;
import apollo.orchestra.Orchestra;

import java.util.Timer;
import java.util.TimerTask;

import javax.sound.midi.Instrument;
import javax.sound.midi.Soundbank;
import javax.swing.JFrame;

/**
 * I get the feeling this class is doomed to be messy, at least for now. So be it.
 * @author Martin
 */
public class ApolloPlayer 
{   
    
    private Composer composer;
    private Orchestra orchestra;
    
    public ApolloPlayer()
    {
        init();
    }
    
    public void init()
    {   
        
        orchestra = new Orchestra();
        composer = new Composer(orchestra);
    }
    
    public void play() 
    {
        composer.update();
        composer.update();
        composer.update();
        orchestra.play();
        Timer uploadCheckerTimer = new Timer(true);

        uploadCheckerTimer.scheduleAtFixedRate(
            new TimerTask() 
            {
                @Override
                public void run() 
                {
                    // All the work of selecting a chord and playing it happen in the composer
                    composer.update();
                }
            }, 0, 80);
    }
}