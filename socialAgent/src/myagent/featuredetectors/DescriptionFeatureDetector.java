/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myagent.featuredetectors;

import edu.memphis.ccrg.lida.pam.tasks.BasicDetectionAlgorithm;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import myagent.modules.InnerSensoryMemory;

/**
 *
 * @author Daqi
 */
public class DescriptionFeatureDetector extends BasicDetectionAlgorithm{
    private static final Logger logger = Logger.getLogger(DescriptionFeatureDetector.class.getCanonicalName());
    
    private Map<String, Object> smParams = new HashMap<String, Object>();
    
    @Override
    public void init() {
       super.init();
       smParams.put("mode","description");

    }
    @Override
    public double detect() {
        
//        Object rt_val = sensoryMemory.getSensoryContent("innerSensing",smParams);
//                
//        //logger.log(Level.INFO, "DescriptionFeatureDetector: {1}", (Double)rt_val);
//        //System.out.print("DescriptionFeatureDetector 1111111111111111");
//        return (Double) rt_val;
        
        //todo: just built in the inner sensed feeling kind stuff, need to dynamically handle that
        return 1.0;
    }
    
}
