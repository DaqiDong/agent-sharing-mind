package myagent.modules;

import edu.memphis.ccrg.lida.environment.EnvironmentImpl;
import java.awt.image.BufferedImage;
import java.util.Map;
import static myagent.modules.ButtonEnvironment.ENVIRONMENT_HEIGHT;
import static myagent.modules.ButtonEnvironment.ENVIRONMENT_WIDTH;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.memphis.ccrg.lida.environment.EnvironmentImpl;
import edu.memphis.ccrg.lida.framework.tasks.FrameworkTaskImpl;
import edu.memphis.ccrg.lida.framework.tasks.TaskManager;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Daqi
 */
public class InnerEnvironment extends EnvironmentImpl {
    private static final Logger logger = Logger.getLogger(InnerEnvironment.class.getCanonicalName());

    private double description_level;
    private BackgroundTask backgroundTask;
    private final int DEFAULT_TICKS_PER_RUN = 100;
    private int ticksPerRun = DEFAULT_TICKS_PER_RUN;


    @Override
    public void init() {

        ticksPerRun = (Integer)getParam("ticksPerRun",DEFAULT_TICKS_PER_RUN);
        backgroundTask = new InnerEnvironment.BackgroundTask(ticksPerRun);
        taskSpawner.addTask(backgroundTask);
    }
    @Override
    public void resetState() {
        description_level = 0.0;
    }

    @Override
    public void processAction(Object action) {
        // no inner actions yet
    }

    @Override
    public Object getState(Map<String, ?> params) {
        
//        String innerSensing = (String)params.get("innerSensing");
//        
//        if("description".equalsIgnoreCase(innerSensing)){
//            Map<String, Object> innerStates = new HashMap<String, Object>();
//        
//            //build-in the inner description needs 
//            innerStates.put("description",description_level);
//
//            logger.log(Level.INFO, "InnerEnvironment: {1}",
//                            description_level);
//            return innerStates;
//            
//        }
//        
//        return null;
//        
        //todo: need a proper data structure to represent the inner stuffs
        return 1.0;
    }
    
    private class BackgroundTask extends FrameworkTaskImpl {

        public BackgroundTask(int ticksPerRun) {
            super(ticksPerRun);
        }

        @Override
        protected void runThisFrameworkTask() {
            driveEnvironment();
        }
    }

    public void driveEnvironment() {
        
        description_level = 1.0;
        
    }
    
}
