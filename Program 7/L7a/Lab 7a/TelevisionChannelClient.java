//Sean Blanchard
//10/23/18
//COMP150 Lab 7a
//Test methods in TelevisionChannel


public class TelevisionChannelClient {
    public static void main(String[] args){

        //Call Television Channel -> create sports channel

        TelevisionChannel sports = new TelevisionChannel("ESPN", 47, true);
        System.out.println("Channel: " + sports.getName() + " Channel Number: " + sports.getNumber() + " Is it on Cable: " + sports.isCable());
        System.out.println("The number of digets in the channel is: " + sports.business());

        //Call TelevisionChannel -> create news channel

        TelevisionChannel news = new TelevisionChannel("FOX", 4, false);
        System.out.println("Channel: " + news.getName() + " Channel Number: " + news.getNumber() + " Is it on Cable: " + news.isCable());
        System.out.println("The number of digets in the channel is: " + news.business());


    }

}
