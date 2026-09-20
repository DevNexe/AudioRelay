package com.google.android.gms.internal.ads;

import android.net.Uri;
import defpackage.qg5;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class zzay {
    public final Uri zza;
    public final List zze;
    public final zzfuv zzg;

    @Deprecated
    public final List zzh;
    public final Object zzi;
    public final String zzb = null;
    public final zzas zzc = null;
    public final zzai zzd = null;
    public final String zzf = null;

    public /* synthetic */ zzay(Uri uri, List list, zzfuv zzfuvVar) {
        this.zza = uri;
        this.zze = list;
        this.zzg = zzfuvVar;
        zzfus zzfusVarZzi = zzfuv.zzi();
        if (zzfuvVar.size() > 0) {
            throw null;
        }
        this.zzh = zzfusVarZzi.zzg();
        this.zzi = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzay)) {
            return false;
        }
        zzay zzayVar = (zzay) obj;
        return this.zza.equals(zzayVar.zza) && zzel.zzT(null, null) && zzel.zzT(null, null) && zzel.zzT(null, null) && this.zze.equals(zzayVar.zze) && zzel.zzT(null, null) && this.zzg.equals(zzayVar.zzg) && zzel.zzT(null, null);
    }

    public final int hashCode() {
        return (this.zzg.hashCode() + qg5.a(this.zze, this.zza.hashCode() * 923521, 961)) * 31;
    }
}
