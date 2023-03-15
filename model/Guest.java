package model;

import dao.StackoverflowDao;

import java.util.List;

public class Guest{
    public List<Question> searchQuestions(StackoverflowDao stackoverflowDao){
        return stackoverflowDao.getAllQuestions();
    }
    public Question getQuestion(StackoverflowDao stackoverflowDao, String questionId){
        return stackoverflowDao.getQuestion(questionId);
    }
}
