public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println(Review.sentimentVal("back"));

        System.out.println(Review.totalSentiment("SimpleReview.txt"));

        System.out.println(Review.starRating("SimpleReview.txt"));

        System.out.println(Review.fakeReview("SimpleReview.txt"));
    }

}
