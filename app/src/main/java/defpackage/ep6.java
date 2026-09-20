package defpackage;

import com.google.android.gms.internal.ads.zzfvx;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ep6 extends zzfvx {
    public final /* synthetic */ Comparator a;

    public ep6(Comparator comparator) {
        this.a = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzfvx
    public final Map a() {
        return new TreeMap(this.a);
    }
}
