package defpackage;

import com.google.android.gms.internal.ads.zzaf;
import com.google.android.gms.internal.ads.zzfuk;
import com.google.android.gms.internal.ads.zzvo;

/* JADX INFO: loaded from: classes3.dex */
public final class wb7 implements Comparable {
    public final boolean w;
    public final boolean x;

    public wb7(zzaf zzafVar, int i) {
        this.w = 1 == (zzafVar.zze & 1);
        this.x = zzvo.d(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        wb7 wb7Var = (wb7) obj;
        return zzfuk.zzj().zzd(this.x, wb7Var.x).zzd(this.w, wb7Var.w).zza();
    }
}
