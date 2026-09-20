package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgls implements zzglx {
    @Override // com.google.android.gms.internal.ads.zzglx
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
