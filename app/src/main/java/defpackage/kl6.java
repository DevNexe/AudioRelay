package defpackage;

import com.google.android.gms.internal.measurement.FJCM;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class kl6 extends t62 {
    public final /* synthetic */ wl6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl6(wl6 wl6Var) {
        super(20);
        this.f = wl6Var;
    }

    @Override // defpackage.t62
    public final Object a(Object obj) throws Throwable {
        LinkedHashMap linkedHashMap;
        String str = (String) obj;
        oa3.e(str);
        wl6 wl6Var = this.f;
        wl6Var.f();
        oa3.e(str);
        if (!wl6Var.q(str)) {
            return null;
        }
        if (!wl6Var.h.containsKey(str) || wl6Var.h.getOrDefault(str, null) == null) {
            wl6Var.k(str);
        } else {
            wl6Var.l(str, (FJCM) wl6Var.h.getOrDefault(str, null));
        }
        kl6 kl6Var = wl6Var.j;
        synchronized (kl6Var) {
            linkedHashMap = new LinkedHashMap(kl6Var.a);
        }
        return (x66) linkedHashMap.get(str);
    }
}
