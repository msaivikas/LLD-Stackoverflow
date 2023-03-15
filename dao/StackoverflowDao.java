package dao;

import model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class StackoverflowDao implements Search {
    private Map<String, Question> questionIdToQuestionMap;
    private Map<String, Answer> answerIdToAnswerMap;
    private Map<String, Comment> commentIdToCommentMap;
    public StackoverflowDao(){
        this.questionIdToQuestionMap = new HashMap<>();
        this.answerIdToAnswerMap = new HashMap<>();
        this.commentIdToCommentMap = new HashMap<>();
    }
    public Question getQuestion(String questionId){
        return this.questionIdToQuestionMap.get(questionId);
    }
    public Entity getEntity(String entityId){
        return this.getEntity(entityId);
    }
    public List<Question> getAllQuestions(){
        return new ArrayList<>(this.questionIdToQuestionMap.values());
    }
    public void addQuestion(Question question){
        this.questionIdToQuestionMap.put(question.getEntityId(), question);
    }
    public void addAnswer(String questionId, Answer answer){
        Question question = questionIdToQuestionMap.get(questionId);
        if(question!=null) question.addAnswer(answer);
        answerIdToAnswerMap.put(answer.getEntityId(), answer);
    }
    public void addCommentToQuestion(String questionId, Comment comment){
        Question question = questionIdToQuestionMap.get(questionId);
        if(question!=null) question.addComment(comment);
        commentIdToCommentMap.put(comment.getEntityId(), comment);
    }
    public void addCommentToAnswer(String answerId, Comment comment){
        Answer answer = answerIdToAnswerMap.get(answerId);
        if(answer!=null) answer.addComment(comment);
        commentIdToCommentMap.put(comment.getEntityId(), comment);
    }
    public void addTagToQuestion(String questionId, Tag tag){
        Question question = questionIdToQuestionMap.get(questionId);
        if(question!=null) question.addTag(tag);
    }
    public void upVote(StackoverflowDao stackoverflowDao, String entityId){
        stackoverflowDao.getEntity(entityId).upVote();
    }
    public void downVote(StackoverflowDao stackoverflowDao, String entityId){
        stackoverflowDao.getEntity(entityId).downVote();
    }
    public List<Question> search(String query){
        List<Question> questions = new ArrayList<>();
        for(Question question:questionIdToQuestionMap.values()){
            if(question.getContent().equals(query)){
                questions.add(question);
            }
        }
        return questions;
    }
}
