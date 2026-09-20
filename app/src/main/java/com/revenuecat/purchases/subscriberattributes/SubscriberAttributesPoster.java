package com.revenuecat.purchases.subscriberattributes;

import android.net.Uri;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import defpackage.cs0;
import defpackage.cx1;
import defpackage.h81;
import defpackage.j81;
import defpackage.sd5;
import defpackage.y81;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class SubscriberAttributesPoster {
    private final Backend backend;

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster$postSubscriberAttributes$1, reason: invalid class name */
    public static final class AnonymousClass1 extends cx1 implements j81<PurchasesError, sd5> {
        final /* synthetic */ y81<PurchasesError, Boolean, List<SubscriberAttributeError>, sd5> $onErrorHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(y81<? super PurchasesError, ? super Boolean, ? super List<SubscriberAttributeError>, sd5> y81Var) {
            super(1);
            this.$onErrorHandler = y81Var;
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            this.$onErrorHandler.invoke(purchasesError, Boolean.FALSE, cs0.w);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster$postSubscriberAttributes$2, reason: invalid class name */
    public static final class AnonymousClass2 extends cx1 implements y81<PurchasesError, Integer, JSONObject, sd5> {
        final /* synthetic */ y81<PurchasesError, Boolean, List<SubscriberAttributeError>, sd5> $onErrorHandler;
        final /* synthetic */ h81<sd5> $onSuccessHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(h81<sd5> h81Var, y81<? super PurchasesError, ? super Boolean, ? super List<SubscriberAttributeError>, sd5> y81Var) {
            super(3);
            this.$onSuccessHandler = h81Var;
            this.$onErrorHandler = y81Var;
        }

        @Override // defpackage.y81
        public /* bridge */ /* synthetic */ sd5 invoke(PurchasesError purchasesError, Integer num, JSONObject jSONObject) {
            invoke(purchasesError, num.intValue(), jSONObject);
            return sd5.a;
        }

        public final void invoke(PurchasesError purchasesError, int i, JSONObject jSONObject) {
            sd5 sd5Var;
            if (purchasesError != null) {
                y81<PurchasesError, Boolean, List<SubscriberAttributeError>, sd5> y81Var = this.$onErrorHandler;
                boolean z = ((i >= 500) || (i == 404)) ? false : true;
                List<SubscriberAttributeError> attributeErrors = cs0.w;
                if (purchasesError.getCode() == PurchasesErrorCode.InvalidSubscriberAttributesError) {
                    attributeErrors = BackendHelpersKt.getAttributeErrors(jSONObject);
                }
                y81Var.invoke(purchasesError, Boolean.valueOf(z), attributeErrors);
                sd5Var = sd5.a;
            } else {
                sd5Var = null;
            }
            if (sd5Var == null) {
                this.$onSuccessHandler.invoke();
            }
        }
    }

    public SubscriberAttributesPoster(Backend backend) {
        this.backend = backend;
    }

    public final void postSubscriberAttributes(Map<String, ? extends Map<String, ? extends Object>> map, String str, h81<sd5> h81Var, y81<? super PurchasesError, ? super Boolean, ? super List<SubscriberAttributeError>, sd5> y81Var) {
        this.backend.performRequest("/subscribers/" + Uri.encode(str) + "/attributes", Collections.singletonMap("attributes", map), new AnonymousClass1(y81Var), new AnonymousClass2(h81Var, y81Var));
    }
}
