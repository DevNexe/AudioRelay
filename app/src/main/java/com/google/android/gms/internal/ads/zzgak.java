package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgak {
    public final zzgjl a;

    public zzgak(zzgjl zzgjlVar) {
        this.a = zzgjlVar;
    }

    public static zzgak zze(String str, byte[] bArr, int i) {
        int i2;
        zzgjk zzgjkVarZza = zzgjl.zza();
        zzgjkVarZza.zza(str);
        zzgjkVarZza.zzb(zzgnf.zzv(bArr));
        int i3 = i - 1;
        if (i3 != 0) {
            i2 = i3 != 1 ? 5 : 4;
        } else {
            i2 = 3;
        }
        zzgjkVarZza.zzc(i2);
        return new zzgak((zzgjl) zzgjkVarZza.zzal());
    }

    public final String zzb() {
        return this.a.zzf();
    }

    public final byte[] zzc() {
        return this.a.zze().zzE();
    }

    public final int zzd() {
        int iZzi = this.a.zzi() - 2;
        int i = 1;
        if (iZzi != 1) {
            i = 2;
            if (iZzi != 2) {
                i = 3;
                if (iZzi != 3) {
                    if (iZzi == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i;
    }
}
