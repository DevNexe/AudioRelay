package com.google.android.gms.internal.ads;

import defpackage.ok4;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdoz {
    public static final zzdoz zza = new zzdoz(new zzdox());
    public final zzbnb a;
    public final zzbmy b;
    public final zzbno c;
    public final zzbnl d;
    public final zzbsg e;
    public final ok4 f;
    public final ok4 g;

    public zzdoz(zzdox zzdoxVar) {
        this.a = zzdoxVar.a;
        this.b = zzdoxVar.b;
        this.c = zzdoxVar.c;
        this.f = new ok4(zzdoxVar.f);
        this.g = new ok4(zzdoxVar.g);
        this.d = zzdoxVar.d;
        this.e = zzdoxVar.e;
    }

    public final zzbmy zza() {
        return this.b;
    }

    public final zzbnb zzb() {
        return this.a;
    }

    public final zzbne zzc(String str) {
        return (zzbne) this.g.getOrDefault(str, null);
    }

    public final zzbnh zzd(String str) {
        return (zzbnh) this.f.getOrDefault(str, null);
    }

    public final zzbnl zze() {
        return this.d;
    }

    public final zzbno zzf() {
        return this.c;
    }

    public final zzbsg zzg() {
        return this.e;
    }

    public final ArrayList zzh() {
        ok4 ok4Var = this.f;
        ArrayList arrayList = new ArrayList(ok4Var.y);
        for (int i = 0; i < ok4Var.y; i++) {
            arrayList.add((String) ok4Var.i(i));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        ArrayList arrayList = new ArrayList();
        if (this.c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.f.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.e != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
