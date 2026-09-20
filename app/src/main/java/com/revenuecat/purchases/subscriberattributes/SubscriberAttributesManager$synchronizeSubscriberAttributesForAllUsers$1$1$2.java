package com.revenuecat.purchases.subscriberattributes;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import com.revenuecat.purchases.strings.AttributionStrings;
import defpackage.Md5A;
import defpackage.cx1;
import defpackage.h81;
import defpackage.hl3;
import defpackage.sd5;
import defpackage.y81;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$2 extends cx1 implements y81<PurchasesError, Boolean, List<? extends SubscriberAttributeError>, sd5> {
    final /* synthetic */ h81<sd5> $completion;
    final /* synthetic */ hl3 $currentSyncedAttributeCount;
    final /* synthetic */ String $syncingAppUserID;
    final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedAttributesForUser;
    final /* synthetic */ int $unsyncedStoredAttributesCount;
    final /* synthetic */ SubscriberAttributesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$2(SubscriberAttributesManager subscriberAttributesManager, String str, Map<String, SubscriberAttribute> map, hl3 hl3Var, h81<sd5> h81Var, int i) {
        super(3);
        this.this$0 = subscriberAttributesManager;
        this.$syncingAppUserID = str;
        this.$unsyncedAttributesForUser = map;
        this.$currentSyncedAttributeCount = hl3Var;
        this.$completion = h81Var;
        this.$unsyncedStoredAttributesCount = i;
    }

    @Override // defpackage.y81
    public /* bridge */ /* synthetic */ sd5 invoke(PurchasesError purchasesError, Boolean bool, List<? extends SubscriberAttributeError> list) {
        invoke(purchasesError, bool.booleanValue(), (List<SubscriberAttributeError>) list);
        return sd5.a;
    }

    public final void invoke(PurchasesError purchasesError, boolean z, List<SubscriberAttributeError> list) {
        if (z) {
            this.this$0.markAsSynced(this.$syncingAppUserID, this.$unsyncedAttributesForUser, list);
        }
        Md5A.h(new Object[]{this.$syncingAppUserID, purchasesError}, 2, AttributionStrings.ATTRIBUTES_SYNC_ERROR, LogIntent.RC_ERROR);
        hl3 hl3Var = this.$currentSyncedAttributeCount;
        int i = hl3Var.w + 1;
        hl3Var.w = i;
        h81<sd5> h81Var = this.$completion;
        if (h81Var == null || i != this.$unsyncedStoredAttributesCount) {
            return;
        }
        h81Var.invoke();
    }
}
