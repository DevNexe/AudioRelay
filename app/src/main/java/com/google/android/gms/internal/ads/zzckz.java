package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.r96;
import defpackage.s96;
import defpackage.u96;
import defpackage.ul3;
import defpackage.v96;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public abstract class zzckz implements ul3 {
    public final Context w;
    public final String x;
    public final WeakReference y;

    public zzckz(zzciw zzciwVar) {
        Context context = zzciwVar.getContext();
        this.w = context;
        this.x = com.google.android.gms.ads.internal.zzt.zzq().zzc(context, zzciwVar.zzp().zza);
        this.y = new WeakReference(zzciwVar);
    }

    public static /* bridge */ /* synthetic */ void a(zzckz zzckzVar, HashMap map) {
        zzciw zzciwVar = (zzciw) zzckzVar.y.get();
        if (zzciwVar != null) {
            zzciwVar.zzd("onPrecacheEvent", map);
        }
    }

    @Override // defpackage.ul3
    public void release() {
    }

    public abstract void zzb();

    public final void zzc(String str, String str2, String str3, String str4) {
        zzcgg.zza.post(new v96(this, str, str2, str3, str4));
    }

    public final void zze(String str, String str2, long j) {
        zzcgg.zza.post(new u96(this, str, str2, j));
    }

    public final void zzf(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        zzcgg.zza.post(new s96(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    public final void zzg(String str, String str2, long j, long j2, boolean z, long j3, long j4, long j5, int i, int i2) {
        zzcgg.zza.post(new r96(this, str, str2, j, j2, j3, j4, j5, z, i, i2));
    }

    public void zzh(int i) {
    }

    public void zzn(int i) {
    }

    public void zzo(int i) {
    }

    public void zzp(int i) {
    }

    public abstract boolean zzq(String str);

    public boolean zzr(String str, String[] strArr) {
        return zzq(str);
    }

    public boolean zzs(String str, String[] strArr, zzckr zzckrVar) {
        return zzq(str);
    }
}
