package defpackage;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzev;
import com.google.android.gms.internal.ads.zzfa;
import com.google.android.gms.internal.ads.zzfuy;
import com.google.android.gms.internal.ads.zzfx;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ca6 implements zzev {
    public final zzev a;
    public final long b;
    public final zzev c;
    public long d;
    public Uri e;

    public ca6(zzeq zzeqVar, int i, zzev zzevVar) {
        this.a = zzeqVar;
        this.b = i;
        this.c = zzevVar;
    }

    @Override // com.google.android.gms.internal.ads.zzr
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
    @Override // com.google.android.gms.internal.ads.zzev
    public final long zzb(zzfa zzfaVar) {
        zzfa zzfaVar2;
        long j;
        long jZzb;
        this.e = zzfaVar.zza;
        long j2 = zzfaVar.zzf;
        zzfa zzfaVar3 = null;
        long j3 = this.b;
        if (j2 >= j3) {
            zzfaVar2 = null;
        } else {
            long j4 = zzfaVar.zzg;
            zzfaVar2 = new zzfa(zzfaVar.zza, null, j2, j2, j4 != -1 ? Math.min(j4, j3 - j2) : j3 - j2, null, 0);
        }
        long j5 = zzfaVar.zzg;
        if (j5 != -1) {
            long j6 = zzfaVar.zzf + j5;
            j = j3;
            if (j6 > j) {
            }
            if (zzfaVar2 != null) {
                jZzb = this.a.zzb(zzfaVar2);
            } else {
                jZzb = 0;
            }
            long jZzb2 = zzfaVar3 != null ? this.c.zzb(zzfaVar3) : 0L;
            this.d = zzfaVar.zzf;
            if (jZzb != -1 || jZzb2 == -1) {
                return -1L;
            }
            return jZzb + jZzb2;
        }
        j = j3;
        long jMax = Math.max(j, zzfaVar.zzf);
        long j7 = zzfaVar.zzg;
        zzfaVar3 = new zzfa(zzfaVar.zza, null, jMax, jMax, j7 != -1 ? Math.min(j7, (zzfaVar.zzf + j7) - j) : -1L, null, 0);
        if (zzfaVar2 != null) {
            jZzb = this.a.zzb(zzfaVar2);
        } else {
            jZzb = 0;
        }
        if (zzfaVar3 != null) {
        }
        this.d = zzfaVar.zzf;
        if (jZzb != -1) {
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final Uri zzc() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final void zzd() {
        this.a.zzd();
        this.c.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzev, com.google.android.gms.internal.ads.zzfs
    public final Map zze() {
        return zzfuy.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final void zzf(zzfx zzfxVar) {
    }
}
