package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzwf {
    public int a;
    public int b;
    public int c = 0;
    public zzvy[] d = new zzvy[100];

    public zzwf(boolean z, int i) {
    }

    public final synchronized int zza() {
        return this.b * 65536;
    }

    public final synchronized zzvy zzb() {
        zzvy zzvyVar;
        this.b++;
        int i = this.c;
        if (i > 0) {
            zzvy[] zzvyVarArr = this.d;
            int i2 = i - 1;
            this.c = i2;
            zzvyVar = zzvyVarArr[i2];
            zzvyVar.getClass();
            zzvyVarArr[i2] = null;
        } else {
            zzvyVar = new zzvy(new byte[65536], 0);
            int i3 = this.b;
            zzvy[] zzvyVarArr2 = this.d;
            int length = zzvyVarArr2.length;
            if (i3 > length) {
                this.d = (zzvy[]) Arrays.copyOf(zzvyVarArr2, length + length);
                return zzvyVar;
            }
        }
        return zzvyVar;
    }

    public final synchronized void zzc(zzvy zzvyVar) {
        zzvy[] zzvyVarArr = this.d;
        int i = this.c;
        this.c = i + 1;
        zzvyVarArr[i] = zzvyVar;
        this.b--;
        notifyAll();
    }

    public final synchronized void zzd(zzvz zzvzVar) {
        while (zzvzVar != null) {
            zzvy[] zzvyVarArr = this.d;
            int i = this.c;
            this.c = i + 1;
            zzvyVarArr[i] = zzvzVar.zzc();
            this.b--;
            zzvzVar = zzvzVar.zzd();
        }
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i) {
        int i2 = this.a;
        this.a = i;
        if (i < i2) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int iMax = Math.max(0, zzel.zze(this.a, 65536) - this.b);
        int i = this.c;
        if (iMax >= i) {
            return;
        }
        Arrays.fill(this.d, iMax, i, (Object) null);
        this.c = iMax;
    }
}
