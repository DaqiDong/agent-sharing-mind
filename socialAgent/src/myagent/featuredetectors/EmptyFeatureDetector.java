/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myagent.featuredetectors;

import java.util.HashMap;
import java.util.Map;

import edu.memphis.ccrg.lida.pam.tasks.BasicDetectionAlgorithm;

/**
 *
 * @author Daqi
 */
public class EmptyFeatureDetector extends BasicDetectionAlgorithm{
    public static final int TOLERANCE = 5;

    /*
     * Size of the shape in pixels (MAX size of environment is this 10000).
     */
    private int soughtArea = 1000;
    /*
     * The white background color should not be counted in determined the number of pixels in the shape
     */
    private int backgroundColor = 0xFFFFFFFF;

    private Map<String, Object> smParams = new HashMap<String, Object>();

    /*
     * The white empty means whole pixels (100*100 = 10000) are white
     */
    @Override
    public void init() {
       super.init();
       smParams.put("mode","all");

       soughtArea = (Integer) getParam("area", 1000);
       backgroundColor = (Integer) getParam("backgroundColor", 0xFFFFFFFF);
    }

    @Override
    public double detect() {
        int[] layer = (int[]) sensoryMemory.getSensoryContent("visual",smParams);
        int area=0;
        for(int i=0;i<layer.length;i++){
            /*If each pixel is empty (color == backgroundColor)*/
            if(layer[i]==backgroundColor){
                area++;
            }
        }
        /*Here number of 100 is an abstract number that represents MAX size of environment*/
        area=(area*100)/layer.length;
        if(Math.abs(area-soughtArea) < TOLERANCE){
            return 1.0;
        }
        return 0.0;
    }
}
