package defpackage;

import com.google.android.gms.internal.ads.zzfsg;
import java.io.Serializable;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class xm6 implements Serializable, zzfsg {
    public final List w;

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof xm6) {
            return this.w.equals(((xm6) obj).w);
        }
        return false;
    }

    public final int hashCode() {
        return this.w.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.w) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfsg
    public final boolean zza(Object obj) {
        int i = 0;
        while (true) {
            List list = this.w;
            if (i >= list.size()) {
                return true;
            }
            if (!((zzfsg) list.get(i)).zza(obj)) {
                return false;
            }
            i++;
        }
    }
}
