import dao.StackoverflowDao;
import model.*;

public class Main {
    public static void main(String[] args) {

        StackoverflowDao stackoverflowDao = new StackoverflowDao();
        Guest guest = new Guest();
        Account account1 = new Account("Alice", "alice@email.com");
        Member member1 = new Member(account1);
        Account account2 = new Account("Bob", "bob@email.com");
        Member member2 = new Member(account2);
        Question question1 = new Question("question1 text lorem ipsum", member1);
        Question question2 = new Question("question2 text input la la la ta da on", member2);
        stackoverflowDao.addQuestion(question1);
        stackoverflowDao.addQuestion(question2);
        Answer answer1 = new Answer("answer1 text input box cat", member2);
        Comment comment1 = new Comment("comment1 text bike car jeep", member2);
        stackoverflowDao.addAnswer(question1.getEntityId(), answer1);
        stackoverflowDao.addCommentToQuestion(question1.getEntityId(), comment1);

        System.out.println(stackoverflowDao.getAllQuestions());
        Question question3 = new Question("question3", member1);
        stackoverflowDao.addQuestion(question3);

        System.out.println(stackoverflowDao.search("question3"));
    }
}