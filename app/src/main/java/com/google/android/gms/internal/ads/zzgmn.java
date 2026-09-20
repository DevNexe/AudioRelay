package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgmn;
import com.google.android.gms.internal.ads.zzgmo;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgmn<MessageType extends zzgmo<MessageType, BuilderType>, BuilderType extends zzgmn<MessageType, BuilderType>> implements zzgpw {
    public abstract zzgoj a(zzgmo zzgmoVar);

    @Override // 
    public abstract zzgmn zzaf();

    @Override // com.google.android.gms.internal.ads.zzgpw
    public final /* bridge */ /* synthetic */ zzgpw zzah(zzgpx zzgpxVar) {
        if (zzbh().getClass().isInstance(zzgpxVar)) {
            return a((zzgmo) zzgpxVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
