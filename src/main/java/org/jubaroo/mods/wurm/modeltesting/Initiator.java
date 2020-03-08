package org.jubaroo.mods.wurm.modeltesting;

import org.gotti.wurmunlimited.modloader.interfaces.Configurable;
import org.gotti.wurmunlimited.modloader.interfaces.ItemTemplatesCreatedListener;
import org.gotti.wurmunlimited.modloader.interfaces.WurmServerMod;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Initiator implements WurmServerMod, Configurable, ItemTemplatesCreatedListener {
    private static Logger logger = Logger.getLogger(Initiator.class.getName());
    boolean bDebug = false;

    private void Debug(String x) {
        if (this.bDebug) {
            System.out.println(this.getClass().getSimpleName() + ": " + x);
            System.out.flush();
            logger.log(Level.INFO, x);
        }
    }

    public void configure(Properties properties) {
        this.bDebug = Boolean.parseBoolean(properties.getProperty("debug", Boolean.toString(this.bDebug)));
        try {
            String logsPath = Paths.get("mods") + "/logs/";
            File newDirectory = new File(logsPath);
            if (!newDirectory.exists()) {
                newDirectory.mkdirs();
            }
            FileHandler fh = new FileHandler(logsPath + this.getClass().getSimpleName() + ".log", 10240000, 200, true);
            if (this.bDebug) {
                fh.setLevel(Level.INFO);
            } else {
                fh.setLevel(Level.WARNING);
            }
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);
        } catch (IOException ie) {
            System.err.println(this.getClass().getName() + ": Unable to add file handler to logger");
        }
        this.Debug("Debugging messages are enabled.");
    }

    @Override
    public void onItemTemplatesCreated() {
        logger.info("Creating Item Mod items.");
        try {
            Items.registerMiscBulkItems();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getVersion() {
        return "v1.0";
    }

}
