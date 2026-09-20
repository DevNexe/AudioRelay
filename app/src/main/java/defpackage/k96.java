package defpackage;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzazg;
import com.google.android.gms.internal.ads.zzazi;
import com.google.android.gms.internal.ads.zzazk;

/* JADX INFO: loaded from: classes3.dex */
public final class k96 implements zzazi {
    public final zzazi a;
    public final long b;
    public final zzazi c;
    public long d;
    public Uri e;

    public k96(zzazg zzazgVar, int i, zzazi zzaziVar) {
        this.a = zzazgVar;
        this.b = i;
        this.c = zzaziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazi
    public final int zza(byte[] bArr, int i, int i2) {
        int i3;
        long j = this.d;
        long j2 = this.b;
        if (j < j2) {
            int iZza = this.a.zza(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.d + ((long) iZza);
            this.d = j3;
            i3 = iZza;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < j2) {
            return i3;
        }
        int iZza2 = this.c.zza(bArr, i + i3, i2 - i3);
        this.d += (long) iZza2;
        return i3 + iZza2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0085  */
    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    @Override // com.google.android.gms.internal.ads.zzazi
    public final long zzb(zzazk zzazkVar) {
        zzazk zzazkVar2;
        long j;
        long jZzb;
        long jZzb2;
        this.e = zzazkVar.zza;
        long j2 = zzazkVar.zzc;
        zzazk zzazkVar3 = null;
        long j3 = this.b;
        if (j2 >= j3) {
            zzazkVar2 = null;
        } else {
            long j4 = zzazkVar.zzd;
            zzazkVar2 = new zzazk(zzazkVar.zza, null, j2, j2, j4 != -1 ? Math.min(j4, j3 - j2) : j3 - j2, null, 0);
        }
        long j5 = zzazkVar.zzd;
        if (j5 != -1) {
            long j6 = zzazkVar.zzc + j5;
            j = j3;
            if (j6 > j) {
            }
            if (zzazkVar2 != null) {
                jZzb = this.a.zzb(zzazkVar2);
            } else {
                jZzb = 0;
            }
            jZzb2 = zzazkVar3 != null ? this.c.zzb(zzazkVar3) : 0L;
            this.d = zzazkVar.zzc;
            if (jZzb2 == -1) {
                return -1L;
            }
            return jZzb + jZzb2;
        }
        j = j3;
        long jMax = Math.max(j, zzazkVar.zzc);
        long j7 = zzazkVar.zzd;
        zzazkVar3 = new zzazk(zzazkVar.zza, null, jMax, jMax, j7 != -1 ? Math.min(j7, (zzazkVar.zzc + j7) - j) : -1L, null, 0);
        if (zzazkVar2 != null) {
            jZzb = this.a.zzb(zzazkVar2);
        } else {
            jZzb = 0;
        }
        if (zzazkVar3 != null) {
        }
        this.d = zzazkVar.zzc;
        if (jZzb2 == -1) {
            return -1L;
        }
        return jZzb + jZzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzazi
    public final Uri zzc() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzazi
    public final void zzd() {
        this.a.zzd();
        this.c.zzd();
    }
}
