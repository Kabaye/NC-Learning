package edu.netcracker.small_learning_things.test_small_things_here;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Base base = new Base();
        List<A> as = new ArrayList<>();
        as.add(new A().setBs(new ArrayList<>()));
        as.add(new A().setBs(new ArrayList<>()));
        as.add(new A().setBs(new ArrayList<>()));
        ArrayList<B> bs = new ArrayList<>();
        bs.add(null);
        bs.add(new B().setB("TestB"));
        as.add(new A().setBs(bs));

        bs = new ArrayList<>();
        bs.add(null);
        bs.add(new B().setB("TestB 2"));
        as.add(new A().setBs(bs));

        base.setAs(as);

        List<B> list = base.getAs().stream()
                .flatMap(a -> a.getBs().stream())
                .toList();
        System.out.println(list);
    }

    public static String getAmount(String priceModificationValue) {
        if (Objects.isNull(priceModificationValue)
            || "0".equals(priceModificationValue)) {
            return "0";
        } else {
            return switch (priceModificationValue.length()) {
                case 1 -> "0.00" + priceModificationValue;
                case 2 -> "0.0" + priceModificationValue;
                case 3 -> "0." + priceModificationValue;
                default -> priceModificationValue.substring(0, priceModificationValue.length() - 3) + "."
                           + priceModificationValue.substring(priceModificationValue.length() - 3);
            };
        }
    }

}
