import java.util.ArrayList;

/**
 * Created by root on 20.12.16.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        AccountFollowingYet accountFollowingYet = new AccountFollowingYet();
        Account account = new Account();
        Followers followers = new Followers();
        account.roboting("https://www.instagram.com/peacefulands/");
        followers.openFollowers();
        FollowerList followerList = new FollowerList();
        followerList.addFollowersToList();
        ArrayList list = followerList.getList();
        System.out.println(followerList.getList());
        System.out.println(followerList.getList().size());
        accountFollowingYet.addingFollowingAccountsToFile(list);

        /*Follow follow = new Follow();
        follow.startFollowPeople(followerList.getList());*/
    }
}
