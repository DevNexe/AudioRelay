package com.revenuecat.purchases.google;

import com.revenuecat.purchases.ProductType;
import defpackage.ah3;
import defpackage.j81;
import defpackage.xg3;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class F1 implements xg3, ah3 {
    public final /* synthetic */ j81 w;
    public final /* synthetic */ j81 x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ F1(j81 j81Var, BillingWrapper billingWrapper, com.android.billingclient.api.QnHx qnHx, j81 j81Var2) {
        this.w = j81Var;
        this.y = billingWrapper;
        this.z = qnHx;
        this.x = j81Var2;
    }

    public /* synthetic */ F1(String str, ProductType productType, j81 j81Var, j81 j81Var2) {
        this.y = productType;
        this.w = j81Var;
        this.z = str;
        this.x = j81Var2;
    }

    @Override // defpackage.ah3
    public final void b(com.android.billingclient.api.NUlFixed nUl, List list) {
        BillingWrapper.C14361.m25invoke$lambda1(this.w, (BillingWrapper) this.y, (com.android.billingclient.api.QnHx) this.z, this.x, nUl, list);
    }

    @Override // defpackage.xg3
    public final void e(com.android.billingclient.api.NUlFixed nUl, List list) {
        BillingWrapper.C14311.m23invoke$lambda2$lambda1((ProductType) this.y, this.w, (String) this.z, this.x, nUl, list);
    }
}
