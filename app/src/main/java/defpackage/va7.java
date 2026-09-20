package defpackage;

import com.google.android.gms.internal.ads.zzaf;
import com.google.android.gms.internal.ads.zzcp;
import com.google.android.gms.internal.ads.zzvq;

/* JADX INFO: loaded from: classes3.dex */
public final class va7 implements zzvq {
    public final zzvq a;
    public final zzcp b;

    public va7(zzvq zzvqVar, zzcp zzcpVar) {
        this.a = zzvqVar;
        this.b = zzcpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va7)) {
            return false;
        }
        va7 va7Var = (va7) obj;
        return this.a.equals(va7Var.a) && this.b.equals(va7Var.b);
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + 527) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final int zza(int i) {
        return this.a.zza(0);
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final int zzb(int i) {
        return this.a.zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final int zzc() {
        return this.a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final zzaf zzd(int i) {
        return this.a.zzd(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final zzcp zze() {
        return this.b;
    }
}
