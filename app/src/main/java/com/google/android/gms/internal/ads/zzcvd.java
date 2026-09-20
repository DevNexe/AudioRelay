package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import defpackage.nc6;
import defpackage.oc6;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcvd {
    public final String a;
    public final zzbuo b;
    public final Executor c;
    public zzcvi d;
    public final nc6 e = new nc6(this);
    public final oc6 f = new oc6(this);

    public zzcvd(String str, zzbuo zzbuoVar, Executor executor) {
        this.a = str;
        this.b = zzbuoVar;
        this.c = executor;
    }

    public static /* bridge */ /* synthetic */ boolean a(zzcvd zzcvdVar, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(zzcvdVar.a);
    }

    public final void zzc(zzcvi zzcviVar) {
        zzbuo zzbuoVar = this.b;
        zzbuoVar.zzb("/updateActiveView", this.e);
        zzbuoVar.zzb("/untrackActiveViewUnit", this.f);
        this.d = zzcviVar;
    }

    public final void zzd(zzcmn zzcmnVar) {
        zzcmnVar.zzaf("/updateActiveView", this.e);
        zzcmnVar.zzaf("/untrackActiveViewUnit", this.f);
    }

    public final void zze() {
        zzbuo zzbuoVar = this.b;
        zzbuoVar.zzc("/updateActiveView", this.e);
        zzbuoVar.zzc("/untrackActiveViewUnit", this.f);
    }

    public final void zzf(zzcmn zzcmnVar) {
        zzcmnVar.zzaw("/updateActiveView", this.e);
        zzcmnVar.zzaw("/untrackActiveViewUnit", this.f);
    }
}
