package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzrh implements zzsi {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final zzsp c = new zzsp();
    public final zzpi d = new zzpi();
    public Looper e;
    public zzcn f;
    public zzmz g;

    public void a() {
    }

    public void b() {
    }

    public final void c(zzcn zzcnVar) {
        this.f = zzcnVar;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzsh) arrayList.get(i)).zza(this, zzcnVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final /* synthetic */ zzcn zzG() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzg(Handler handler, zzpj zzpjVar) {
        zzpjVar.getClass();
        this.d.zzb(handler, zzpjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzh(Handler handler, zzsq zzsqVar) {
        zzsqVar.getClass();
        this.c.zzb(handler, zzsqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzi(zzsh zzshVar) {
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(zzshVar);
        if ((!zIsEmpty) && hashSet.isEmpty()) {
            a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzk(zzsh zzshVar) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(zzshVar);
        if (zIsEmpty) {
            b();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzm(zzsh zzshVar, zzfx zzfxVar, zzmz zzmzVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.e;
        boolean z = true;
        if (looper != null && looper != looperMyLooper) {
            z = false;
        }
        zzdd.zzd(z);
        this.g = zzmzVar;
        zzcn zzcnVar = this.f;
        this.a.add(zzshVar);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.b.add(zzshVar);
            zzn(zzfxVar);
        } else if (zzcnVar != null) {
            zzk(zzshVar);
            zzshVar.zza(this, zzcnVar);
        }
    }

    public abstract void zzn(zzfx zzfxVar);

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzp(zzsh zzshVar) {
        ArrayList arrayList = this.a;
        arrayList.remove(zzshVar);
        if (!arrayList.isEmpty()) {
            zzi(zzshVar);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        zzq();
    }

    public abstract void zzq();

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzr(zzpj zzpjVar) {
        this.d.zzc(zzpjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzs(zzsq zzsqVar) {
        this.c.zzm(zzsqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final /* synthetic */ boolean zzu() {
        return true;
    }
}
