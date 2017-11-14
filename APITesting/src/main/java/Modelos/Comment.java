package Modelos;

import APIS.CommonApi;

public class Comment implements CommonApi{

    //TODO replace names with corrects one.
    private int commId;
    private int id;
    private String head;
    private String text;
    private String foot;

    public int getCommId() {
        return commId;
    }

    public int getId() {
        return id;
    }

    public String getHead() {
        return head;
    }

    public String getText() {
        return text;
    }

    public String getFoot() {
        return foot;
    }
}
