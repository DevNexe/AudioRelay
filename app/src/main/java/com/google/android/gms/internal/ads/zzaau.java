package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaau implements zzzf {
    public static final int[] l;
    public static final int o;
    public final byte[] a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public zzzi h;
    public zzaam i;
    public boolean j;
    public static final zzzm zza = new zzzm() { // from class: com.google.android.gms.internal.ads.zzaat
        @Override // com.google.android.gms.internal.ads.zzzm
        public final zzzf[] zza() {
            return new zzzf[]{new zzaau(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzzm
        public final /* synthetic */ zzzf[] zzb(Uri uri, Map map) {
            return zzzl.zza(this, uri, map);
        }
    };
    public static final int[] k = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final byte[] m = zzel.zzaa("#!AMR\n");
    public static final byte[] n = zzel.zzaa("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        l = iArr;
        o = iArr[8];
    }

    public zzaau() {
        this(0);
    }

    public zzaau(int i) {
        this.a = new byte[1];
        this.g = -1;
    }

    public final boolean a(zzzg zzzgVar) throws EOFException, InterruptedIOException {
        zzzgVar.zzj();
        byte[] bArr = m;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((zzyv) zzzgVar).zzm(bArr2, 0, length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.b = false;
            ((zzyv) zzzgVar).zzo(bArr.length, false);
            return true;
        }
        zzzgVar.zzj();
        byte[] bArr3 = n;
        int length2 = bArr3.length;
        byte[] bArr4 = new byte[length2];
        zzyv zzyvVar = (zzyv) zzzgVar;
        zzyvVar.zzm(bArr4, 0, length2, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.b = true;
        zzyvVar.zzo(bArr3.length, false);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0083  */
    /* JADX WARN: Code duplicated, block: B:31:0x0085  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:52:0x00de  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e8  */
    @Override // com.google.android.gms.internal.ads.zzzf
    public final int zza(zzzg zzzgVar, zzaaf zzaafVar) throws zzbu {
        int iZza;
        int i;
        zzdd.zzb(this.i);
        int i2 = zzel.zza;
        if (zzzgVar.zzf() == 0 && !a(zzzgVar)) {
            throw zzbu.zza("Could not find AMR header.", null);
        }
        if (!this.j) {
            this.j = true;
            boolean z = this.b;
            String str = true != z ? "audio/3gpp" : "audio/amr-wb";
            int i3 = true != z ? 8000 : 16000;
            zzaam zzaamVar = this.i;
            zzad zzadVar = new zzad();
            zzadVar.zzS(str);
            zzadVar.zzL(o);
            zzadVar.zzw(1);
            zzadVar.zzT(i3);
            zzaamVar.zzk(zzadVar.zzY());
        }
        byte[] bArr = this.a;
        int i4 = this.e;
        int i5 = 0;
        if (i4 == 0) {
            try {
                zzzgVar.zzj();
                ((zzyv) zzzgVar).zzm(bArr, 0, 1, false);
                byte b = bArr[0];
                if ((b & 131) > 0) {
                    throw zzbu.zza("Invalid padding bits for frame header " + ((int) b), null);
                }
                int i6 = (b >> 3) & 15;
                boolean z2 = this.b;
                if (!z2) {
                    if (!z2) {
                        if (i6 >= 12 && i6 <= 14) {
                        }
                    }
                    throw zzbu.zza("Illegal AMR " + (true != z2 ? "NB" : "WB") + " frame type " + i6, null);
                }
                if (i6 >= 10 && i6 <= 13) {
                    if (!z2) {
                        if (i6 >= 12) {
                        }
                    }
                    if (true != z2) {
                    }
                    throw zzbu.zza("Illegal AMR " + (true != z2 ? "NB" : "WB") + " frame type " + i6, null);
                }
                i4 = z2 ? l[i6] : k[i6];
                this.d = i4;
                this.e = i4;
                if (this.g == -1) {
                    this.g = i4;
                }
                iZza = zzaak.zza(this.i, zzzgVar, i4, true);
                if (iZza == -1) {
                    i5 = -1;
                } else {
                    i = this.e - iZza;
                    this.e = i;
                    if (i <= 0) {
                        this.i.zzs(this.c, 1, this.d, 0, null);
                        this.c += 20000;
                    }
                }
            } catch (EOFException unused) {
            }
        } else {
            iZza = zzaak.zza(this.i, zzzgVar, i4, true);
            if (iZza == -1) {
                i5 = -1;
            } else {
                i = this.e - iZza;
                this.e = i;
                if (i <= 0) {
                    this.i.zzs(this.c, 1, this.d, 0, null);
                    this.c += 20000;
                }
            }
        }
        if (this.f) {
            return i5;
        }
        this.h.zzL(new zzaah(-9223372036854775807L, 0L));
        this.f = true;
        return i5;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzb(zzzi zzziVar) {
        this.h = zzziVar;
        this.i = zzziVar.zzv(0, 1);
        zzziVar.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzc(long j, long j2) {
        this.c = 0L;
        this.d = 0;
        this.e = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final boolean zzd(zzzg zzzgVar) {
        return a(zzzgVar);
    }
}
