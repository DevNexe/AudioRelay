package defpackage;

import com.google.android.gms.internal.ads.zzfwd;
import java.io.Serializable;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class lp6 extends zzfwd implements Serializable {
    public final zzfwd w;

    public lp6(zzfwd zzfwdVar) {
        this.w = zzfwdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwd, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.w.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lp6) {
            return this.w.equals(((lp6) obj).w);
        }
        return false;
    }

    public final int hashCode() {
        return -this.w.hashCode();
    }

    public final String toString() {
        zzfwd zzfwdVar = this.w;
        Objects.toString(zzfwdVar);
        return zzfwdVar.toString().concat(".reverse()");
    }

    @Override // com.google.android.gms.internal.ads.zzfwd
    public final zzfwd zza() {
        return this.w;
    }
}
