package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ta4 implements Iterable<String>, jv1 {
    public final /* synthetic */ pa4 w;

    public ta4(pa4 pa4Var) {
        this.w = pa4Var;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new sa4(this.w);
    }
}
