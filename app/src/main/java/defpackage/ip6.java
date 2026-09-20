package defpackage;

import com.google.android.gms.internal.ads.zzfwd;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ip6 extends zzfwd implements Serializable {
    public static final ip6 w = new ip6();

    @Override // com.google.android.gms.internal.ads.zzfwd, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.android.gms.internal.ads.zzfwd
    public final zzfwd zza() {
        return kp6.w;
    }
}
