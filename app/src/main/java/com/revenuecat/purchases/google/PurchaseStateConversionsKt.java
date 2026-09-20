package com.revenuecat.purchases.google;

import com.revenuecat.purchases.models.PurchaseState;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class PurchaseStateConversionsKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchaseState.values().length];
            iArr[PurchaseState.UNSPECIFIED_STATE.ordinal()] = 1;
            iArr[PurchaseState.PURCHASED.ordinal()] = 2;
            iArr[PurchaseState.PENDING.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int toGooglePurchaseState(PurchaseState purchaseState) {
        int i = WhenMappings.$EnumSwitchMapping$0[purchaseState.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final PurchaseState toRevenueCatPurchaseState(int i) {
        if (i == 0) {
            return PurchaseState.UNSPECIFIED_STATE;
        }
        if (i != 1) {
            return i != 2 ? PurchaseState.UNSPECIFIED_STATE : PurchaseState.PENDING;
        }
        return PurchaseState.PURCHASED;
    }
}
