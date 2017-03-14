/**
 * @Title XN619050Res.java 
 * @Package com.cdkj.pipe.dto.res 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年3月13日 下午8:18:40 
 * @version V1.0   
 */
package com.cdkj.pipe.dto.res;

import com.cdkj.pipe.domain.Assign;
import com.cdkj.pipe.domain.Hear;

/** 
 * @author: haiqingzheng 
 * @since: 2017年3月13日 下午8:18:40 
 * @history:
 */
public class XN619050Res {

    private Hear hear;

    private Assign assign;

    public Hear getHear() {
        return hear;
    }

    public void setHear(Hear hear) {
        this.hear = hear;
    }

    public Assign getAssign() {
        return assign;
    }

    public void setAssign(Assign assign) {
        this.assign = assign;
    }
}
