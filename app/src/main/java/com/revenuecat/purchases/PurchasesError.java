package com.revenuecat.purchases;

import defpackage.i5;
import defpackage.kg0;

/* JADX INFO: loaded from: classes3.dex */
public final class PurchasesError {
    private final PurchasesErrorCode code;
    private final String message;
    private final String underlyingErrorMessage;

    public PurchasesError(PurchasesErrorCode purchasesErrorCode, String str) {
        this.code = purchasesErrorCode;
        this.underlyingErrorMessage = str;
        this.message = purchasesErrorCode.getDescription();
    }

    public final PurchasesErrorCode getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getUnderlyingErrorMessage() {
        return this.underlyingErrorMessage;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PurchasesError(code=");
        sb.append(this.code);
        sb.append(", underlyingErrorMessage=");
        sb.append(this.underlyingErrorMessage);
        sb.append(", message='");
        return i5.b(sb, this.message, "')");
    }

    public /* synthetic */ PurchasesError(PurchasesErrorCode purchasesErrorCode, String str, int i, kg0 kg0Var) {
        this(purchasesErrorCode, (i & 2) != 0 ? null : str);
    }
}
