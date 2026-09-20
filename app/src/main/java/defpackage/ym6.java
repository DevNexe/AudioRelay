package defpackage;

import com.google.android.gms.internal.ads.zzfru;
import com.google.android.gms.internal.ads.zzfsb;
import com.google.android.gms.internal.ads.zzfsf;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ym6 extends zzfsb {
    public final Object w;

    public ym6(Object obj) {
        this.w = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof ym6) {
            return this.w.equals(((ym6) obj).w);
        }
        return false;
    }

    public final int hashCode() {
        return this.w.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.w + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzfsb
    public final zzfsb zza(zzfru zzfruVar) {
        Object objApply = zzfruVar.apply(this.w);
        zzfsf.zzc(objApply, "the Function passed to Optional.transform() must not return null.");
        return new ym6(objApply);
    }

    @Override // com.google.android.gms.internal.ads.zzfsb
    public final Object zzb(Object obj) {
        return this.w;
    }
}
