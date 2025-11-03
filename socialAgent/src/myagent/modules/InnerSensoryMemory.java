/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myagent.modules;

import edu.memphis.ccrg.lida.sensorymemory.SensoryMemoryImpl;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daqi
 */
public class InnerSensoryMemory extends SensoryMemoryImpl{
    private static final Logger logger = Logger.getLogger(InnerSensoryMemory.class.getCanonicalName());
    
    Double sensorData = 1.0;
    
    private Map<String,Object> sensorParam = new HashMap<String, Object>();
    
    @Override
    public void init() {

        sensorParam.put("innerSensing","description");

    }
    @Override
    public void decayModule(long ticks) {
        //NA
    }

    @Override
    public void runSensors() {

        sensorData = (Double)environment.getState(sensorParam);
        
    }

    @Override
    public Object getSensoryContent(String modality, Map<String, Object> params) {
     
        //todo: need a proper data structure to represent the inner stuffs
        return sensorData;
    }
    
}
