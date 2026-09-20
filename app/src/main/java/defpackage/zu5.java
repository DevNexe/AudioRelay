package defpackage;

import android.util.Log;
import com.google.android.gms.internal.ads.zzaf;
import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzel;

/* JADX INFO: loaded from: classes3.dex */
public final class zu5 implements xu5 {
    public final int a;
    public final int b;
    public final zzed c;

    public zu5(tu5 tu5Var, zzaf zzafVar) {
        zzed zzedVar = tu5Var.b;
        this.c = zzedVar;
        zzedVar.zzF(12);
        int iZzn = zzedVar.zzn();
        if ("audio/raw".equals(zzafVar.zzm)) {
            int iZzo = zzel.zzo(zzafVar.zzB, zzafVar.zzz);
            if (iZzn == 0 || iZzn % iZzo != 0) {
                Log.w("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iZzo + ", stsz sample size: " + iZzn);
                iZzn = iZzo;
            }
        }
        this.a = iZzn == 0 ? -1 : iZzn;
        this.b = zzedVar.zzn();
    }

    @Override // defpackage.xu5, defpackage.j16
    public final int zza() {
        return this.a;
    }

    @Override // defpackage.xu5, defpackage.j16
    public final int zzb() {
        return this.b;
    }

    @Override // defpackage.xu5
    public final int zzc() {
        int i = this.a;
        return i == -1 ? this.c.zzn() : i;
    }
}
