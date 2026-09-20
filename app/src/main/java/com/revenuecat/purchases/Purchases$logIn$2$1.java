package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.LogInCallback;
import defpackage.cx1;
import defpackage.h81;
import defpackage.sd5;
import defpackage.x81;

/* JADX INFO: loaded from: classes3.dex */
public final class Purchases$logIn$2$1 extends cx1 implements x81<CustomerInfo, Boolean, sd5> {
    final /* synthetic */ LogInCallback $callback;
    final /* synthetic */ String $newAppUserID;
    final /* synthetic */ Purchases this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$logIn$2$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends cx1 implements h81<sd5> {
        final /* synthetic */ LogInCallback $callback;
        final /* synthetic */ boolean $created;
        final /* synthetic */ CustomerInfo $customerInfo;
        final /* synthetic */ Purchases this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LogInCallback logInCallback, CustomerInfo customerInfo, boolean z, Purchases purchases) {
            super(0);
            this.$callback = logInCallback;
            this.$customerInfo = customerInfo;
            this.$created = z;
            this.this$0 = purchases;
        }

        @Override // defpackage.h81
        public /* bridge */ /* synthetic */ sd5 invoke() {
            invoke2();
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            LogInCallback logInCallback = this.$callback;
            if (logInCallback != null) {
                logInCallback.onReceived(this.$customerInfo, this.$created);
            }
            this.this$0.customerInfoHelper.sendUpdatedCustomerInfoToDelegateIfChanged(this.$customerInfo);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Purchases$logIn$2$1(Purchases purchases, String str, LogInCallback logInCallback) {
        super(2);
        this.this$0 = purchases;
        this.$newAppUserID = str;
        this.$callback = logInCallback;
    }

    @Override // defpackage.x81
    public /* bridge */ /* synthetic */ sd5 invoke(CustomerInfo customerInfo, Boolean bool) {
        invoke(customerInfo, bool.booleanValue());
        return sd5.a;
    }

    public final void invoke(CustomerInfo customerInfo, boolean z) {
        Purchases purchases = this.this$0;
        purchases.dispatch(new AnonymousClass1(this.$callback, customerInfo, z, purchases));
        Purchases purchases2 = this.this$0;
        Purchases.fetchAndCacheOfferings$default(purchases2, this.$newAppUserID, purchases2.getState$purchases_latestDependenciesRelease().getAppInBackground(), null, 4, null);
    }
}
