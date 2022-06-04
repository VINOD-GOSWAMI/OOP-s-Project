package org.example.oopConcepts.projects.NewYearGift;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NewYearGift {
    private static final Logger logger = LogManager.getLogger(NewYearGift.class);

    public static void main(String[] args) {
        ChildrenGift gift = new ChildrenGift();
        gift.packetOfDairyMilk(4);
        gift.packetOfiveStar(7);
        gift.packetOfLaddu(3);
        gift.packetOfKajuKatali(9);
        gift.totalWeight();
        gift.totalCostOfGift();
        gift.sort();
    }
}
