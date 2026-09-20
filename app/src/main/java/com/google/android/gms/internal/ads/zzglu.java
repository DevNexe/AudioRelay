package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes3.dex */
public final class zzglu implements zzglx {
    @Override // com.google.android.gms.internal.ads.zzglx
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
