package cond.ex;

public class MovieRateEx {
    public static void main(String[] args) {
        double rating = 7.1;
//        if (rating <= 7) {
//            System.out.println("'어바웃타임'을 추천합니다.");
//            System.out.println("'토이 스토리'을 추천합니다.");
//            System.out.println("'고질라'을 추천합니다.");
//        } else if (rating <= 8) {
//            System.out.println("'어바웃타임'을 추천합니다.");
//            System.out.println("'토이 스토리'을 추천합니다.");
//        } else {
//            System.out.println("'어바웃타임'을 추천합니다.");
//        }

        /**
         * 조건에 맞는 여러 결과가 나와야 하므로, 독립된 if문을 사용한다
         */
        if (rating <= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }
        if (rating <= 8) {
            System.out.println("'토이 스토리'을 추천합니다.");
        }
        if (rating <= 7) {
            System.out.println("'고질라'을 추천합니다.");
        }
    }
}
