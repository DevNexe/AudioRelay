package com.google.android.gms.internal.ads;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;

/* JADX INFO: loaded from: classes3.dex */
public final class zzguu extends zzgum {
    public /* synthetic */ zzguu(int i) {
        super(i);
    }

    public final zzguu zzb(Object obj, zzgve zzgveVar) {
        zzguz.zza(obj, SubscriberAttributeKt.JSON_NAME_KEY);
        zzguz.zza(zzgveVar, "provider");
        this.a.put(obj, zzgveVar);
        return this;
    }

    public final zzguv zzc() {
        return new zzguv(this.a);
    }
}
