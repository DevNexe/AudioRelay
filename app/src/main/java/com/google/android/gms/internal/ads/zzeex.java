package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeex implements zzdem, zzddb {
    public static final Object y = new Object();
    public static int z;
    public final zzg w;
    public final zzefh x;

    public zzeex(zzefh zzefhVar, zzg zzgVar) {
        this.x = zzefhVar;
        this.w = zzgVar;
    }

    public final void a(boolean z2) {
        int i;
        int iIntValue;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfj)).booleanValue() && !this.w.zzP()) {
            Object obj = y;
            synchronized (obj) {
                i = z;
                iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfk)).intValue();
            }
            if (i >= iIntValue) {
                return;
            }
            this.x.zzd(z2);
            synchronized (obj) {
                z++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        a(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final void zzn() {
        a(true);
    }
}
