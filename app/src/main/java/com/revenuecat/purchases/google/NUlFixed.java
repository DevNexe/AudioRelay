package com.revenuecat.purchases.google;

import defpackage.ah3;
import defpackage.j81;
import defpackage.om4;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class NUlFixed implements om4, ah3 {
    public final /* synthetic */ j81 w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ NUlFixed(j81 j81Var, com.android.billingclient.api.QnHx qnHx, String str) {
        this.w = j81Var;
        this.x = qnHx;
        this.y = str;
    }

    public /* synthetic */ NUlFixed(Set set, j81 j81Var, j81 j81Var2) {
        this.x = set;
        this.w = j81Var;
        this.y = j81Var2;
    }

    @Override // defpackage.om4
    public final void a(com.android.billingclient.api.NUlFixed nUl, List list) {
        BillingWrapper.C14371.C01121.m27invoke$lambda4((Set) this.x, this.w, (j81) this.y, nUl, list);
    }

    @Override // defpackage.ah3
    public final void b(com.android.billingclient.api.NUlFixed nUl, List list) {
        BillingWrapper.m13getPurchaseType$lambda16$lambda15(this.w, (com.android.billingclient.api.QnHx) this.x, (String) this.y, nUl, list);
    }
}
