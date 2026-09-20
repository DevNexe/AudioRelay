package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.LogInCallback;
import defpackage.cx1;
import defpackage.h81;
import defpackage.j81;
import defpackage.sd5;

/* JADX INFO: loaded from: classes3.dex */
public final class Purchases$logIn$2$2 extends cx1 implements j81<PurchasesError, sd5> {
    final /* synthetic */ LogInCallback $callback;
    final /* synthetic */ Purchases this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$logIn$2$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends cx1 implements h81<sd5> {
        final /* synthetic */ LogInCallback $callback;
        final /* synthetic */ PurchasesError $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LogInCallback logInCallback, PurchasesError purchasesError) {
            super(0);
            this.$callback = logInCallback;
            this.$error = purchasesError;
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
                logInCallback.onError(this.$error);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Purchases$logIn$2$2(Purchases purchases, LogInCallback logInCallback) {
        super(1);
        this.this$0 = purchases;
        this.$callback = logInCallback;
    }

    @Override // defpackage.j81
    public /* bridge */ /* synthetic */ sd5 invoke(PurchasesError purchasesError) {
        invoke2(purchasesError);
        return sd5.a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PurchasesError purchasesError) {
        this.this$0.dispatch(new AnonymousClass1(this.$callback, purchasesError));
    }
}
