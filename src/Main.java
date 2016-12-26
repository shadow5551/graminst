import java.util.ArrayList;
//создать лист пользователей для пробы их подписиков
/**
 * Created by root on 20.12.16.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        AccountFollowingYet accountFollowingYet = new AccountFollowingYet();
        Account account = new Account();
        Followers followers = new Followers();
        FollowerList followerList = new FollowerList();
        ArrayList<String> list1 = new ArrayList<String>();

        //for (int i = 0; i < list1.size(); i++) {
          //  Thread.sleep(2000000);
           // account.roboting(list1.get(i));
            //followers.openFollowers();
            followerList.addFollowersToList();
           ArrayList list = followerList.getList();
        System.out.println(list);
            accountFollowingYet.addingFollowingAccountsToFile(list);
            //Follow follow = new Follow();
            //follow.startFollowPeople(followerList.getList());
            System.out.println(123123);
           // Thread.sleep(2000000);
      //  }
        /*account.roboting("https://www.instagram.com/whos.mlr/");
        followers.openFollowers();
        followerList.addFollowersToList();
        ArrayList list = followerList.getList();
        accountFollowingYet.addingFollowingAccountsToFile(list);*/
        /*Follow follow = new Follow();
        follow.startFollowPeople(followerList.getList());*/
    }
}
