/**
 * Created by root on 20.12.16.
 */
public class Main {
    public static void main(String[] args) throws Exception  {
        Account openFollowers = new Account();
        Followers followers = new Followers();
        openFollowers.roboting("https://www.instagram.com/uglys0ul/");
       followers.openFollowers();
        FollowerList followerList = new FollowerList();
        followerList.addFollowersToList();
        System.out.println(followerList.getList());
       Follow follow  = new Follow();
        follow.startFollowPeople(followerList.getList());

        /*URL url = new URL("https://www.instagram.com/meryluigi0607/");
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(url.openStream()));
        BufferedWriter writer = new BufferedWriter
                (new FileWriter("data.html"));
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.contains("<script type=\"text/javascript\">window._sharedData")){
            System.out.println(line);}
            writer.write(line);
            writer.newLine();
        }
        reader.close();
        writer.close();*/

    }
}
