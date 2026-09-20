package defpackage;

import com.google.android.gms.internal.ads.zzad;
import com.google.android.gms.internal.ads.zzaf;
import com.google.android.gms.internal.ads.zzgg;
import com.google.android.gms.internal.ads.zzje;
import com.google.android.gms.internal.ads.zzrl;
import com.google.android.gms.internal.ads.zztw;

/* JADX INFO: loaded from: classes3.dex */
public final class la7 implements zztw {
    public final zztw a;
    public boolean b;
    public final /* synthetic */ zzrl c;

    public la7(zzrl zzrlVar, zztw zztwVar) {
        this.c = zzrlVar;
        this.a = zztwVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0035  */
    @Override // com.google.android.gms.internal.ads.zztw
    public final int zza(zzje zzjeVar, zzgg zzggVar, int i) {
        zzrl zzrlVar = this.c;
        if (zzrlVar.a()) {
            return -3;
        }
        if (this.b) {
            zzggVar.zzc(4);
            return -4;
        }
        int iZza = this.a.zza(zzjeVar, zzggVar, i);
        if (iZza != -5) {
            long j = zzrlVar.z;
            if (j == Long.MIN_VALUE || ((iZza != -4 || zzggVar.zzd < j) && !(iZza == -3 && zzrlVar.zzb() == Long.MIN_VALUE && !zzggVar.zzc))) {
                return iZza;
            }
            zzggVar.zzb();
            zzggVar.zzc(4);
            this.b = true;
            return -4;
        }
        zzaf zzafVar = zzjeVar.zza;
        zzafVar.getClass();
        int i2 = zzafVar.zzC;
        if (i2 != 0) {
            int i3 = zzrlVar.z == Long.MIN_VALUE ? zzafVar.zzD : 0;
            zzad zzadVarZzb = zzafVar.zzb();
            zzadVarZzb.zzC(i2);
            zzadVarZzb.zzD(i3);
            zzjeVar.zza = zzadVarZzb.zzY();
        } else if (zzafVar.zzD != 0) {
            i2 = 0;
            if (zzrlVar.z == Long.MIN_VALUE) {
            }
            zzad zzadVarZzb2 = zzafVar.zzb();
            zzadVarZzb2.zzC(i2);
            zzadVarZzb2.zzD(i3);
            zzjeVar.zza = zzadVarZzb2.zzY();
        }
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final int zzb(long j) {
        if (this.c.a()) {
            return -3;
        }
        return this.a.zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final void zzd() {
        this.a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final boolean zze() {
        return !this.c.a() && this.a.zze();
    }
}
