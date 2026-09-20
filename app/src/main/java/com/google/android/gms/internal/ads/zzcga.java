package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.zzg;
import defpackage.ft;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcga implements zzbcf {
    public final zzg b;
    public final zzcfx d;
    public final Object a = new Object();
    public final HashSet e = new HashSet();
    public final HashSet f = new HashSet();
    public boolean g = false;
    public final zzcfy c = new zzcfy();

    public zzcga(String str, zzg zzgVar) {
        this.d = new zzcfx(str, zzgVar);
        this.b = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbcf
    public final void zza(boolean z) {
        long jB = com.google.android.gms.ads.internal.zzt.zzB().b();
        zzcfx zzcfxVar = this.d;
        zzg zzgVar = this.b;
        if (!z) {
            zzgVar.zzt(jB);
            zzgVar.zzJ(zzcfxVar.d);
            return;
        }
        if (jB - zzgVar.zzd() > ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzaN)).longValue()) {
            zzcfxVar.d = -1;
        } else {
            zzcfxVar.d = zzgVar.zzc();
        }
        this.g = true;
    }

    public final zzcfp zzb(ft ftVar, String str) {
        return new zzcfp(ftVar, this, this.c.zza(), str);
    }

    public final void zzc(zzcfp zzcfpVar) {
        synchronized (this.a) {
            this.e.add(zzcfpVar);
        }
    }

    public final void zzd() {
        synchronized (this.a) {
            this.d.zzb();
        }
    }

    public final void zze() {
        synchronized (this.a) {
            this.d.zzc();
        }
    }

    public final void zzf() {
        synchronized (this.a) {
            this.d.zzd();
        }
    }

    public final void zzg() {
        synchronized (this.a) {
            this.d.zze();
        }
    }

    public final void zzh(com.google.android.gms.ads.internal.client.zzl zzlVar, long j) {
        synchronized (this.a) {
            this.d.zzf(zzlVar, j);
        }
    }

    public final void zzi(HashSet hashSet) {
        synchronized (this.a) {
            this.e.addAll(hashSet);
        }
    }

    public final boolean zzj() {
        return this.g;
    }

    public final Bundle zzk(Context context, zzfes zzfesVar) {
        HashSet hashSet = new HashSet();
        synchronized (this.a) {
            hashSet.addAll(this.e);
            this.e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.d.zza(context, this.c.zzb()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.f.iterator();
        if (it.hasNext()) {
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((zzcfp) it2.next()).zza());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        zzfesVar.zzc(hashSet);
        return bundle;
    }
}
