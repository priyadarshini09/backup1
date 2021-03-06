
package com.stackroute.newintentparser.exude.common;

public class ExudeRequest {
    
    String data;
    String type;
    boolean keepDuplicate = false;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isKeepDuplicate() {
        return keepDuplicate;
    }

    public void setKeepDuplicate(boolean keepDuplicate) {
        this.keepDuplicate = keepDuplicate;
    }

}
