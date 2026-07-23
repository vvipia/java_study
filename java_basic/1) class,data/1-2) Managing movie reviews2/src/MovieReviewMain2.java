public class MovieReviewMain2 {
    public static void main(String[] args) {
        ProductOrder[] movieReview = new ProductOrder[2];

        movieReview[0] = new ProductOrder();
        movieReview[1] = new ProductOrder();

        movieReview[0].title = "인셉션";
        movieReview[0].review = "인생은 무한 루프";

        movieReview[1].title = "어바웃 타임";
        movieReview[1].review = "인생 시간 영화!";

        for (ProductOrder review : movieReview) {
            System.out.println("영화 제목: " + review.title + ", 리뷰: " + review.review);
        }
    }
}