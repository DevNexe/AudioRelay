package com.google.android.gms.internal.ads;

import defpackage.ey5;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgmg {
    public static final ey5 a = new ey5(3);

    public static byte[] zza(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) a.get()).nextBytes(bArr);
        return bArr;
    }
}
