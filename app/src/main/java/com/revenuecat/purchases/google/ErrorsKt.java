package com.revenuecat.purchases.google;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class ErrorsKt {
    public static final PurchasesError billingResponseToPurchasesError(int i, String str) {
        PurchasesErrorCode purchasesErrorCode;
        switch (i) {
            case -3:
            case -1:
            case 2:
            case 6:
                purchasesErrorCode = PurchasesErrorCode.StoreProblemError;
                break;
            case -2:
            case 3:
            case 8:
                purchasesErrorCode = PurchasesErrorCode.PurchaseNotAllowedError;
                break;
            case 0:
                purchasesErrorCode = PurchasesErrorCode.UnknownError;
                break;
            case 1:
                purchasesErrorCode = PurchasesErrorCode.PurchaseCancelledError;
                break;
            case 4:
                purchasesErrorCode = PurchasesErrorCode.ProductNotAvailableForPurchaseError;
                break;
            case 5:
                purchasesErrorCode = PurchasesErrorCode.PurchaseInvalidError;
                break;
            case 7:
                purchasesErrorCode = PurchasesErrorCode.ProductAlreadyPurchasedError;
                break;
            default:
                purchasesErrorCode = PurchasesErrorCode.UnknownError;
                break;
        }
        return new PurchasesError(purchasesErrorCode, str);
    }

    public static final String getBillingResponseCodeName(int i) {
        Field field;
        Field[] declaredFields = com.android.billingclient.api.QnHx.InterfaceC0068QnHx.class.getDeclaredFields();
        int length = declaredFields.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                field = null;
                break;
            }
            field = declaredFields[i2];
            if (field.getInt(field) == i) {
                break;
            }
            i2++;
        }
        String name = field != null ? field.getName() : null;
        return name == null ? String.valueOf(i) : name;
    }
}
