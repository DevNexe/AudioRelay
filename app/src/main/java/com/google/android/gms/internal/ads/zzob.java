package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzob implements zzne {
    public zznc a;
    public zznc b;
    public zznc c;
    public zznc d;
    public ByteBuffer e;
    public ByteBuffer f;
    public boolean g;

    public zzob() {
        ByteBuffer byteBuffer = zzne.zza;
        this.e = byteBuffer;
        this.f = byteBuffer;
        zznc zzncVar = zznc.zza;
        this.c = zzncVar;
        this.d = zzncVar;
        this.a = zzncVar;
        this.b = zzncVar;
    }

    public final ByteBuffer a(int i) {
        if (this.e.capacity() < i) {
            this.e = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.e.clear();
        }
        ByteBuffer byteBuffer = this.e;
        this.f = byteBuffer;
        return byteBuffer;
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final zznc zza(zznc zzncVar) {
        this.c = zzncVar;
        this.d = zzi(zzncVar);
        return zzg() ? this.d : zznc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.f;
        this.f = zzne.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzc() {
        this.f = zzne.zza;
        this.g = false;
        this.a = this.c;
        this.b = this.d;
        b();
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzd() {
        this.g = true;
        c();
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzf() {
        zzc();
        this.e = zzne.zza;
        zznc zzncVar = zznc.zza;
        this.c = zzncVar;
        this.d = zzncVar;
        this.a = zzncVar;
        this.b = zzncVar;
        d();
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public boolean zzg() {
        return this.d != zznc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public boolean zzh() {
        return this.g && this.f == zzne.zza;
    }

    public zznc zzi(zznc zzncVar) {
        throw null;
    }
}
