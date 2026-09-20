package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class zzbka {
    public final String a;
    public final Object b;
    public final int c;

    public zzbka(int i, Object obj, String str) {
        this.a = str;
        this.b = obj;
        this.c = i;
    }

    public static zzbka zza(String str, double d) {
        return new zzbka(3, Double.valueOf(d), str);
    }

    public static zzbka zzb(String str, long j) {
        return new zzbka(2, Long.valueOf(j), str);
    }

    public static zzbka zzc(String str, String str2) {
        return new zzbka(4, str2, str);
    }

    public static zzbka zzd(String str, boolean z) {
        return new zzbka(1, Boolean.valueOf(z), str);
    }

    public final Object zze() {
        zzbld zzbldVar = (zzbld) zzblf.a.get();
        Object obj = this.b;
        if (zzbldVar == null) {
            AtomicReference atomicReference = zzblf.b;
            if (((zzble) atomicReference.get()) != null) {
                ((zzble) atomicReference.get()).zza();
            }
            return obj;
        }
        int i = this.c - 1;
        String str = this.a;
        if (i == 0) {
            return zzbldVar.zza(str, ((Boolean) obj).booleanValue());
        }
        if (i != 1) {
            return i != 2 ? zzbldVar.zzd(str, (String) obj) : zzbldVar.zzb(str, ((Double) obj).doubleValue());
        }
        return zzbldVar.zzc(str, ((Long) obj).longValue());
    }
}
