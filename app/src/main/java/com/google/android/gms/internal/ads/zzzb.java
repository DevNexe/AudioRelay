package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzzb {
    public final String zza;

    public zzzb(String str) {
        this.zza = str;
    }

    public static zzzb zza(zzed zzedVar) {
        String str;
        zzedVar.zzG(2);
        int iZzk = zzedVar.zzk();
        int i = iZzk >> 1;
        int iZzk2 = (zzedVar.zzk() >> 3) | ((iZzk & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        return new zzzb(str + ".0" + i + (iZzk2 < 10 ? ".0" : ".") + iZzk2);
    }
}
