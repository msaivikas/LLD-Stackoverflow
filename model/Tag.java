package model;

import java.util.UUID;

public class Tag {
    private String tag;
    private String tagId;
    public Tag(String tag){
        this.tag = tag;
        this.tagId = UUID.randomUUID().toString();
    }
    @Override
    public String toString(){
        return "Tag{" + tag + ", TagId=" + tagId + "}";
    }
}
