package com.google.android.gms.internal.ads;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgux extends zzgum {
    public /* synthetic */ zzgux() {
        super(1);
    }

    public final zzgux zzb(Object obj, zzgve zzgveVar) {
        zzguz.zza("Network", SubscriberAttributeKt.JSON_NAME_KEY);
        zzguz.zza(zzgveVar, "provider");
        this.a.put("Network", zzgveVar);
        return this;
    }

    public final zzguy zzc() {
        return new zzguy(this.a);
    }
}
