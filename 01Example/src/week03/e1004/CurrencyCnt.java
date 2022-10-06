package week03.e1004;

//화폐 매수 알고리즘
public class CurrencyCnt {
    public static void main(String[] args) {
        //현금으로 돈을 받고 25000원을 거슬러 주어야 합니다.
        //5만원짜리는 몇 장, 1만원짜리는 몇 장, 5천원짜리는 몇 장을 거슬러 주어야 할까요?

        int refund = 25000;
        int[] currencyUnit = {50000, 10000, 5000};

        for (int i = 0; i < currencyUnit.length; i++) {
            int cnt = refund / currencyUnit[i];
            refund = refund % currencyUnit[i];

            System.out.println(currencyUnit[i] + "원: " + cnt + "장");
        }
    }
}