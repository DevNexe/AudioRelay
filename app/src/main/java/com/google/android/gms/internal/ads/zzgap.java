package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgap {
    public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static zzgao zza(String str) throws GeneralSecurityException {
        for (zzgao zzgaoVar : a) {
            if (zzgaoVar.zza()) {
                return zzgaoVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
