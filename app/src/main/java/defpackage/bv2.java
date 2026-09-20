package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class bv2<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        yy1 yy1Var;
        yy1 yy1Var2;
        kz1 kz1Var = ((r21) t).H;
        Integer numValueOf = null;
        Integer numValueOf2 = (kz1Var == null || (yy1Var2 = kz1Var.A) == null) ? null : Integer.valueOf(yy1Var2.R);
        kz1 kz1Var2 = ((r21) t2).H;
        if (kz1Var2 != null && (yy1Var = kz1Var2.A) != null) {
            numValueOf = Integer.valueOf(yy1Var.R);
        }
        return OW8.m(numValueOf2, numValueOf);
    }
}
