//создать лист пользователей для пробы их подписиков

import java.util.ArrayList;

/**
 * Created by root on 20.12.16.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        String nameOfFileMyFollowers = "myfollowers.txt";
        String nameOfFileIFolllows = "ifollow.txt";
        MyAccount myAccount = new MyAccount();
        Follow follow = new Follow();
        Account account = new Account();
        CompareFile compareFile = new CompareFile();
        Followers followers = new Followers();
        RandomUser randomUser = new RandomUser();
        FollowerList followerList = new FollowerList();
        ArrayList<String> list1 = new ArrayList<String>();

        list1.add("https://www.instagram.com/postmorttem/");
        //compareFile.Compare(nameOfFileMyFollowers,nameOfFileIFolllows);
        for (int i = 0; i < list1.size(); i++) {
           //Thread.sleep(2000000);
            account.roboting(list1.get(0));
            followers.openFollowers();
            followerList.addFollowersToList();
            ArrayList list = followerList.getList();
            System.out.println(list);
            System.out.println(list.size());
          //  myAccount.addingFollowingAccountsToFile(list, nameOfFileMyFollowers);
            follow.startFollowPeople(followerList.getList());
            //  System.out.println(123123);
             Thread.sleep(2000000);
            //  }
        /*account.roboting("https://www.instagram.com/whos.mlr/");
        followers.openFollowers();
        followerList.addFollowersToList();
        ArrayList list = followerList.getList();
        myAccount.addingFollowingAccountsToFile(list);*/
        /*Follow follow = new Follow();
        follow.startFollowPeople(followerList.getList());*/
        }
    }
}
