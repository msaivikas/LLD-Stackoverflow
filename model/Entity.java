package model;

import java.util.UUID;

public class Entity {
    private final String entityId;
    private String content;
    private Member owner;
    private int voteCount;

    public Entity( String content, Member owner){
        this.entityId = UUID.randomUUID().toString();
        this.owner = owner;
        this.content = content;
        this.voteCount = 0;
    }
    public String getEntityId(){
        return entityId;
    }
    public String getContent(){
        return content;
    }
    public void setContent(String content){
        this.content = content;
    }

    public Member getOwner() {
        return owner;
    }
    public void upVote(){
        voteCount++;
    }
    public void downVote(){
        voteCount--;
    }

    @Override
    public String toString(){
        return "Entity{" +
                "entityId='" + entityId + '\'' +
                ", content='" + content + '\'' +
                "owner='" + owner + "}";
    }
}
