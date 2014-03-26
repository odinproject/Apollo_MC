/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apollo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sound.sampled.*;
import javax.sound.midi.*;

import talonos.minersurvey.ModMinerSurvey;
import talonos.minersurvey.SurveyCommand;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


/**
 *
 * @author Martin
 */
@Mod(modid = Apollo.modid, name = "Apollo Music Generation", version = "0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Apollo 
{

    public static final String modid = "Apollo_Music";
      
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	ApolloPlayer p = new ApolloPlayer();
    	p.play();
        
    }
      
}
