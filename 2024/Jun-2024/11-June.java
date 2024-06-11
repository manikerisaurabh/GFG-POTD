public class 11-June{

static class Order {
    int tipDifference;
    int waiterATip;
    int waiterBTip;

    Order(int tipDifference, int waiterATip, int waiterBTip) {
        this.tipDifference = tipDifference;
        this.waiterATip = waiterATip;
        this.waiterBTip = waiterBTip;
    }

    }

    public static long maxTip(int n, int maxOrdersA, int maxOrdersB, int[] tipsA, int[] tipsB) {
        List<Order> orders = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            orders.add(new Order(Math.abs(tipsA[i] - tipsB[i]), tipsA[i], tipsB[i]));
        }

        orders.sort((o1, o2) -> o2.tipDifference - o1.tipDifference);

        long totalTips = 0;
        int ordersTakenByA = 0;
        int ordersTakenByB = 0;

        for (Order order : orders) {
            if ((order.waiterATip >= order.waiterBTip && ordersTakenByA < maxOrdersA) || ordersTakenByB == maxOrdersB) {
                totalTips += order.waiterATip;
                ordersTakenByA++;
            } else {
                totalTips += order.waiterBTip;
                ordersTakenByB++;
            }
        }

        return totalTips;
    }
}