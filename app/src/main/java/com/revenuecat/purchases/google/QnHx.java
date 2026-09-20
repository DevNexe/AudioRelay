package com.revenuecat.purchases.google;

import defpackage.ah3;
import defpackage.j81;
import defpackage.t81;
import defpackage.x81;
import defpackage.xg3;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class QnHx implements xg3, ah3 {
    public final /* synthetic */ t81 w;
    public final /* synthetic */ Object x;

    public /* synthetic */ QnHx(t81 t81Var, Object obj) {
        this.w = t81Var;
        this.x = obj;
    }

    public final void a(com.android.billingclient.api.NUlFixed nUl) {
        ((x81) this.w).invoke(nUl, (String) this.x);
    }

    @Override // defpackage.ah3
    public final void b(com.android.billingclient.api.NUlFixed nUl, List list) {
        BillingWrapper.m14getPurchaseType$lambda16$lambda15$lambda14((j81) this.w, (String) this.x, nUl, list);
    }

    @Override // defpackage.xg3
    public final void e(com.android.billingclient.api.NUlFixed nUl, List list) {
        BillingWrapper.C14351.C01111.m24invoke$lambda3((j81) this.w, (j81) this.x, nUl, list);
    }
}
