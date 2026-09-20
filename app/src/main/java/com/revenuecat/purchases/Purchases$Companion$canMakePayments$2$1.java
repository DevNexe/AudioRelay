package com.revenuecat.purchases;

import android.os.Handler;
import com.android.billingclient.api.NUlFixed;
import com.android.billingclient.api.QnHx;
import com.revenuecat.purchases.google.BillingResultExtensionsKt;
import com.revenuecat.purchases.interfaces.Callback;
import defpackage.fa;
import defpackage.oh0;
import defpackage.tp3;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Purchases$Companion$canMakePayments$2$1 implements fa {
    final /* synthetic */ QnHx $billingClient;
    final /* synthetic */ Callback<Boolean> $callback;
    final /* synthetic */ List<BillingFeature> $features;
    final /* synthetic */ Handler $mainHandler;

    /* JADX WARN: Multi-variable type inference failed */
    public Purchases$Companion$canMakePayments$2$1(Handler handler, Callback<Boolean> callback, QnHx qnHx, List<? extends BillingFeature> list) {
        this.$mainHandler = handler;
        this.$callback = callback;
        this.$billingClient = qnHx;
        this.$features = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onBillingServiceDisconnected$lambda-2, reason: not valid java name */
    public static final void m8onBillingServiceDisconnected$lambda2(QnHx qnHx, Callback callback) {
        try {
            qnHx.c();
        } catch (IllegalArgumentException unused) {
        } finally {
            callback.onReceived(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onBillingSetupFinished$lambda-1, reason: not valid java name */
    public static final void m9onBillingSetupFinished$lambda1(NUlFixed nUl, Callback callback, QnHx qnHx, List list) {
        try {
            if (!BillingResultExtensionsKt.isSuccessful(nUl)) {
                callback.onReceived(Boolean.FALSE);
                qnHx.c();
                return;
            }
            List list2 = list;
            boolean z = true;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (!BillingResultExtensionsKt.isSuccessful(qnHx.d(((BillingFeature) it.next()).getPlayBillingClientName()))) {
                        z = false;
                        break;
                    }
                }
            }
            qnHx.c();
            callback.onReceived(Boolean.valueOf(z));
        } catch (IllegalArgumentException unused) {
            callback.onReceived(Boolean.FALSE);
        }
    }

    @Override // defpackage.fa
    public void onBillingServiceDisconnected() {
        this.$mainHandler.post(new tp3(3, this.$billingClient, this.$callback));
    }

    @Override // defpackage.fa
    public void onBillingSetupFinished(NUlFixed nUl) {
        this.$mainHandler.post(new oh0(nUl, this.$callback, this.$billingClient, this.$features, 1));
    }
}
