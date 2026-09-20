package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzbcc {
    public int b;
    public final Object a = new Object();
    public final LinkedList c = new LinkedList();

    public final zzbcb zza(boolean z) {
        synchronized (this.a) {
            zzbcb zzbcbVar = null;
            if (this.c.isEmpty()) {
                zzcgn.zze("Queue empty");
                return null;
            }
            int i = 0;
            if (this.c.size() < 2) {
                zzbcb zzbcbVar2 = (zzbcb) this.c.get(0);
                if (z) {
                    this.c.remove(0);
                } else {
                    zzbcbVar2.zzi();
                }
                return zzbcbVar2;
            }
            int i2 = Integer.MIN_VALUE;
            int i3 = 0;
            for (zzbcb zzbcbVar3 : this.c) {
                int iZzb = zzbcbVar3.zzb();
                if (iZzb > i2) {
                    i = i3;
                }
                int i4 = iZzb > i2 ? iZzb : i2;
                if (iZzb > i2) {
                    zzbcbVar = zzbcbVar3;
                }
                i3++;
                i2 = i4;
            }
            this.c.remove(i);
            return zzbcbVar;
        }
    }

    public final void zzb(zzbcb zzbcbVar) {
        synchronized (this.a) {
            if (this.c.size() >= 10) {
                zzcgn.zze("Queue is full, current size = " + this.c.size());
                this.c.remove(0);
            }
            int i = this.b;
            this.b = i + 1;
            zzbcbVar.zzj(i);
            zzbcbVar.zzn();
            this.c.add(zzbcbVar);
        }
    }

    public final boolean zzc(zzbcb zzbcbVar) {
        synchronized (this.a) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                zzbcb zzbcbVar2 = (zzbcb) it.next();
                if (com.google.android.gms.ads.internal.zzt.zzp().zzh().zzM()) {
                    if (!com.google.android.gms.ads.internal.zzt.zzp().zzh().zzN() && zzbcbVar != zzbcbVar2 && zzbcbVar2.zzf().equals(zzbcbVar.zzf())) {
                        it.remove();
                        return true;
                    }
                } else if (zzbcbVar != zzbcbVar2 && zzbcbVar2.zzd().equals(zzbcbVar.zzd())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean zzd(zzbcb zzbcbVar) {
        synchronized (this.a) {
            return this.c.contains(zzbcbVar);
        }
    }
}
