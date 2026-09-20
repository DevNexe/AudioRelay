package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class za1 implements Iterable<Object>, jv1 {
    public final /* synthetic */ ab1 w;
    public final /* synthetic */ int x;

    public za1(ab1 ab1Var, int i) {
        this.w = ab1Var;
        this.x = i;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        ab1 ab1Var = this.w;
        ln4 ln4Var = ab1Var.w;
        if (ln4Var.C != ab1Var.z) {
            throw new ConcurrentModificationException();
        }
        int i = this.x;
        return new ab1(i + 1, fp1.s(ln4Var.w, i) + i, ln4Var);
    }
}
