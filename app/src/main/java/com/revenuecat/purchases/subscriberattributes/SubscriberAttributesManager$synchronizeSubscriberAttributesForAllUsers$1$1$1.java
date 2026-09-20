package com.revenuecat.purchases.subscriberattributes;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.AttributionStrings;
import defpackage.Md5A;
import defpackage.cs0;
import defpackage.cx1;
import defpackage.h81;
import defpackage.hl3;
import defpackage.sd5;
import defpackage.ur1;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$1 extends cx1 implements h81<sd5> {
    final /* synthetic */ h81<sd5> $completion;
    final /* synthetic */ String $currentAppUserID;
    final /* synthetic */ hl3 $currentSyncedAttributeCount;
    final /* synthetic */ String $syncingAppUserID;
    final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedAttributesForUser;
    final /* synthetic */ int $unsyncedStoredAttributesCount;
    final /* synthetic */ SubscriberAttributesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$1(SubscriberAttributesManager subscriberAttributesManager, String str, Map<String, SubscriberAttribute> map, String str2, hl3 hl3Var, h81<sd5> h81Var, int i) {
        super(0);
        this.this$0 = subscriberAttributesManager;
        this.$syncingAppUserID = str;
        this.$unsyncedAttributesForUser = map;
        this.$currentAppUserID = str2;
        this.$currentSyncedAttributeCount = hl3Var;
        this.$completion = h81Var;
        this.$unsyncedStoredAttributesCount = i;
    }

    @Override // defpackage.h81
    public /* bridge */ /* synthetic */ sd5 invoke() {
        invoke2();
        return sd5.a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.markAsSynced(this.$syncingAppUserID, this.$unsyncedAttributesForUser, cs0.w);
        Md5A.h(new Object[]{this.$syncingAppUserID}, 1, AttributionStrings.ATTRIBUTES_SYNC_SUCCESS, LogIntent.RC_SUCCESS);
        if (!ur1.a(this.$currentAppUserID, this.$syncingAppUserID)) {
            this.this$0.getDeviceCache().clearSubscriberAttributesIfSyncedForSubscriber(this.$syncingAppUserID);
        }
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
