/**
 * Created by root on 20.12.16.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Account account = new Account();
        Followers followers = new Followers();
        account.roboting("https://www.instagram.com/borvntodie/");
        followers.openFollowers();
        FollowerList followerList = new FollowerList();
        followerList.addFollowersToList();
        System.out.println(followerList.getList());
        Follow follow = new Follow();
        follow.startFollowPeople(followerList.getList());
    }
}
