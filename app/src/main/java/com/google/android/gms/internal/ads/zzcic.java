package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;
import defpackage.g96;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcic extends TextureView implements g96 {
    public final zzciq w;
    public final zzcja x;

    public zzcic(Context context) {
        super(context);
        this.w = new zzciq();
        this.x = new zzcja(context, this);
    }

    public void zzA(int i) {
    }

    public void zzB(String str, String[] strArr) {
        zzs(str);
    }

    public abstract int zza();

    public abstract int zzb();

    public abstract int zzc();

    public abstract int zzd();

    public abstract int zze();

    public abstract long zzf();

    public abstract long zzg();

    public abstract long zzh();

    public abstract String zzj();

    public abstract void zzn();

    public abstract void zzo();

    public abstract void zzp();

    public abstract void zzq(int i);

    public abstract void zzr(zzcib zzcibVar);

    public abstract void zzs(String str);

    public abstract void zzt();

    public abstract void zzu(float f, float f2);

    public void zzw(int i) {
    }

    public void zzx(int i) {
    }

    public void zzy(int i) {
    }

    public void zzz(int i) {
    }
}
