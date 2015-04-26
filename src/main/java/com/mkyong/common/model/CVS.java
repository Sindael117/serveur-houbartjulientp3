package com.mkyong.common.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Julien on 24/04/2015.
 * Contient la liste de CV
 */

@XmlRootElement(name = "CVS")
public class CVS {

    private List<CV> cv;

    public CVS() {
        cv = new ArrayList<CV>();
        this.cv.add(new CV("Rachid","Dallas",32));
        this.cv.add(new CV("Patoche","Sebastien",40));
        this.cv.add(new CV("Houbart","Julien",23));
    }

    public List<CV> getcv() {
        return cv;
    }

    @XmlElement
    public void setcv(List<CV> cv) {
        this.cv = cv;
    }

    public CV CVbyId(int id){
        return cv.get(id);
    }
}
