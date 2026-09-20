package defpackage;

import com.google.android.gms.internal.ads.zzgg;
import com.google.android.gms.internal.ads.zzje;
import com.google.android.gms.internal.ads.zztv;
import com.google.android.gms.internal.ads.zztw;
import com.google.android.gms.internal.ads.zzwj;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class fb7 implements zztw {
    public final int a;
    public final /* synthetic */ hb7 b;

    public fb7(hb7 hb7Var, int i) {
        this.b = hb7Var;
        this.a = i;
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final int zza(zzje zzjeVar, zzgg zzggVar, int i) {
        hb7 hb7Var = this.b;
        if (hb7Var.j()) {
            return -3;
        }
        int i2 = this.a;
        hb7Var.f(i2);
        int iZzd = hb7Var.K[i2].zzd(zzjeVar, zzggVar, i, hb7Var.c0);
        if (iZzd == -3) {
            hb7Var.g(i2);
        }
        return iZzd;
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final int zzb(long j) {
        hb7 hb7Var = this.b;
        if (hb7Var.j()) {
            return 0;
        }
        int i = this.a;
        hb7Var.f(i);
        zztv zztvVar = hb7Var.K[i];
        int iZzb = zztvVar.zzb(j, hb7Var.c0);
        zztvVar.zzv(iZzb);
        if (iZzb != 0) {
            return iZzb;
        }
        hb7Var.g(i);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final void zzd() throws IOException {
        hb7 hb7Var = this.b;
        hb7Var.K[this.a].zzm();
        hb7Var.C.zzi(zzwj.zza(hb7Var.T));
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final boolean zze() {
        hb7 hb7Var = this.b;
        return !hb7Var.j() && hb7Var.K[this.a].zzx(hb7Var.c0);
    }
}
