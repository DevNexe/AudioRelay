package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import defpackage.GM;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfq extends zzfo {
    public final int zzd;
    public final String zze;
    public final Map zzf;
    public final byte[] zzg;

    public zzfq(int i, String str, IOException iOException, Map map, zzfa zzfaVar, byte[] bArr) {
        super(GM.a("Response code: ", i), iOException, zzfaVar, AdError.INTERNAL_ERROR_2004, 1);
        this.zzd = i;
        this.zze = str;
        this.zzf = map;
        this.zzg = bArr;
    }
}
