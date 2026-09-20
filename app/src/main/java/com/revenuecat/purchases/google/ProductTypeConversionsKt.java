package com.revenuecat.purchases.google;

import com.revenuecat.purchases.ProductType;
import defpackage.ur1;

/* JADX INFO: loaded from: classes3.dex */
public final class ProductTypeConversionsKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductType.values().length];
            iArr[ProductType.INAPP.ordinal()] = 1;
            iArr[ProductType.SUBS.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ProductType toProductType(String str) {
        if (ur1.a(str, "inapp")) {
            return ProductType.INAPP;
        }
        return ur1.a(str, "subs") ? ProductType.SUBS : ProductType.UNKNOWN;
    }

    public static final String toSKUType(ProductType productType) {
        int i = WhenMappings.$EnumSwitchMapping$0[productType.ordinal()];
        if (i == 1) {
            return "inapp";
        }
        if (i != 2) {
            return null;
        }
        return "subs";
    }
}
