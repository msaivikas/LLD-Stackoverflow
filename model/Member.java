package model;

import dao.StackoverflowDao;

public class Member extends Guest{
    private final Account account;
    public Member(Account account){
        this.account = account;
    }
    public void addQuestion(StackoverflowDao stackoverflowDao, Question question){
        stackoverflowDao.addQuestion(question);
    }
    public void addAnswer(StackoverflowDao stackoverflowDao,String questionId, Answer answer){
        stackoverflowDao.addAnswer(questionId, answer);
    }
    public void addCommentToQuestion(StackoverflowDao stackoverflowDao, String questionId, Comment comment){
        stackoverflowDao.addCommentToQuestion(questionId, comment);
    }
    public void addCommentToAnswer(StackoverflowDao stackoverflowDao, String answerId, Comment comment){
        stackoverflowDao.addCommentToAnswer(answerId, comment);
    }
    @Override
    public String toString(){
        return "Member{" + "account=" + account + "}";
    }
}
