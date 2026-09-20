package com.google.android.gms.internal.ads;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbut extends zzcgs {
    public final zzbus b;

    public zzbut(zzbus zzbusVar, String str) {
        super(str);
        this.b = zzbusVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgs, com.google.android.gms.internal.ads.zzcgf
    public final boolean zza(String str) {
        zzcgn.zze("LeibnizHttpUrlPinger pinging URL: ".concat(String.valueOf(str)));
        if ("oda".equals(Uri.parse(str).getScheme())) {
            return true;
        }
        zzcgn.zze("URL does not match oda:// scheme, falling back on HttpUrlPinger");
        return super.zza(str);
    }
}
