package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ga4 implements Iterable<Object>, jv1 {
    public final /* synthetic */ x94 w;

    public ga4(ej0 ej0Var) {
        this.w = ej0Var;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this.w.iterator();
    }
}
