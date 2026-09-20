package defpackage;

import com.google.android.gms.internal.ads.zzfwd;
import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class lo6 extends zzfwd implements Serializable {
    public final Comparator w;

    public lo6(Comparator comparator) {
        comparator.getClass();
        this.w = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzfwd, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.w.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lo6) {
            return this.w.equals(((lo6) obj).w);
        }
        return false;
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public final String toString() {
        return this.w.toString();
    }
}
