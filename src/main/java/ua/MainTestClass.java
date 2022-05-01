package ua;

import ua.dao.PublisherMySqlDao;
import ua.dao.UserMySqlDao;
import ua.domain.Publisher;
import ua.domain.Topics;
import ua.domain.User;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainTestClass {
    public static void main(String[] args) {
        UserMySqlDao userMySqlDao = new UserMySqlDao();
//        Publisher publisher = new Publisher("Express", Topics.DAILYNEWS);
        PublisherMySqlDao publisherMySqlDao = new PublisherMySqlDao();

//        publisherMySqlDao.signUp(publisher);


        List<Publisher> publisherList = publisherMySqlDao.getAll();
        for (Publisher publishers : publisherList) {
            System.out.println(publishers.toString());
        }

//        List<User> userList = userMySqlDao.getAll();
//        for (User users : userList) {
//            System.out.println(users.toString());
//        }

//        User getUser = userMySqlDao.get("bibob@ail.com");
//        System.out.println(getUser.toString());

//        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$"); //todo
//        Matcher matcher = pattern.matcher("123Qwerty@");
//        System.out.println(matcher.matches());
    }
}
