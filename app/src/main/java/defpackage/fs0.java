package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class fs0 implements fz2 {
    public static final fs0 c = new fs0();

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

    public final boolean equals(Object obj) {
        return (obj instanceof fz2) && ((fz2) obj).isEmpty();
    }

    @Override // defpackage.xu4
    public final boolean isEmpty() {
        return true;
    }

    public final String toString() {
        return "Parameters " + hs0.w;
    }
}
