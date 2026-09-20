package defpackage;

import com.google.android.gms.internal.ads.zzfwd;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class kp6 extends zzfwd implements Serializable {
    public static final kp6 w = new kp6();

    @Override // com.google.android.gms.internal.ads.zzfwd, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    @Override // com.google.android.gms.internal.ads.zzfwd
    public final zzfwd zza() {
        return ip6.w;
    }
}
