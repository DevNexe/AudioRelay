package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Signature;

/* JADX INFO: loaded from: classes3.dex */
public final class zzglw implements zzglx {
    @Override // com.google.android.gms.internal.ads.zzglx
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
