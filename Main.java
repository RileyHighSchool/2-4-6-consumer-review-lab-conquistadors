import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Boolean ifPos;

        String trueOrFalse = sc.nextLine();
        if (trueOrFalse.equals("true")){
            ifPos = true;
        }
        else if (trueOrFalse.equals("false")){
            ifPos = false;
        }

        System.out.println(Review.sentimentVal("back"));

        System.out.println(Review.totalSentiment("SimpleReview.txt"));

        System.out.println(Review.starRating("SimpleReview.txt"));

        System.out.println(Review.fakeReview("SimpleReview.txt", ifPos));

        System.out.println(Review.commentToYou("CommentTemplate.txt", ifPos));

    }

}
