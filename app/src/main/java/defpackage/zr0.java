package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zr0 implements mc1 {
    public static final zr0 c = new zr0();

    @Override // defpackage.xu4
    public final Set<Map.Entry<String, List<String>>> a() {
        return hs0.w;
    }

    @Override // defpackage.xu4
    public final void b(x81<? super String, ? super List<String>, sd5> x81Var) {
        xu4.QnHx.a(this, x81Var);
    }

    @Override // defpackage.xu4
    public final boolean c() {
        return true;
    }

    @Override // defpackage.xu4
    public final String get(String str) {
        return null;
    }

    public final String toString() {
        return "Headers " + hs0.w;
    }
}
