package defpackage;

import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzde;
import com.google.android.gms.internal.ads.zzgv;
import com.google.android.gms.internal.ads.zzjg;
import com.google.android.gms.internal.ads.zzjy;
import com.google.android.gms.internal.ads.zzke;

/* JADX INFO: loaded from: classes3.dex */
public final class iw6 implements zzjg {
    public boolean A = true;
    public boolean B;
    public final zzke w;
    public final zzgv x;
    public zzjy y;
    public zzjg z;

    public iw6(zzgv zzgvVar, zzde zzdeVar) {
        this.x = zzgvVar;
        this.w = new zzke(zzdeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjg
    public final long zza() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzjg
    public final zzby zzc() {
        zzjg zzjgVar = this.z;
        return zzjgVar != null ? zzjgVar.zzc() : this.w.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzjg
    public final void zzg(zzby zzbyVar) {
        zzjg zzjgVar = this.z;
        if (zzjgVar != null) {
            zzjgVar.zzg(zzbyVar);
            zzbyVar = this.z.zzc();
        }
        this.w.zzg(zzbyVar);
    }
}
