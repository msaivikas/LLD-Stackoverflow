package model;


import java.util.ArrayList;
import java.util.List;

public class Question extends Entity {
    private List<Answer> answers;
    private List<Comment> comments;
    private Integer bounty;
    private List<Tag> tags;
    private Boolean isOpen;
    public Question(String content, Member owner){
        super(content,owner);
        this.answers = new ArrayList<>();
        this.comments = new ArrayList<>();
        this.bounty = 0;
        this.isOpen = true;
        this.tags = new ArrayList<>();
    }
    public Integer getBounty(){
        return bounty;
    }
    public void setBounty(Integer bounty){
        this.bounty = bounty;
    }
    public Boolean getIsOpen(){
        return isOpen;
    }
    public void setIsOpen(Boolean open){
        isOpen = open;
    }
    public List<Answer> getAnswers(){
        return answers;
    }
    public void addAnswer(Answer answer){
        this.answers.add(answer);
    }
    public List<Comment> getComments(){
        return comments;
    }
    public void addComment(Comment comment){
        this.comments.add(comment);
    }
    public List<Tag> getTags(){
        return tags;
    }
    public void addTag(Tag tag){
        this.tags.add(tag);
    }
    @Override
    public String toString(){
        return "Question{" +
                "Content=" + super.getContent() +
                ", Answers=" + answers +
                ", Comments=" + comments +
                ", Bounty=" + bounty +
                ", isOpen=" + isOpen +
                ", Tags=" + tags +
                ", Owner=" + super.getOwner();
    }
}
