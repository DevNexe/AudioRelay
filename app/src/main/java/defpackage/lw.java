package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class lw<T> implements Comparator {
    public final /* synthetic */ j81<T, Comparable<?>>[] w;

    /* JADX WARN: Multi-variable type inference failed */
    public lw(j81<? super T, ? extends Comparable<?>>[] j81VarArr) {
        this.w = j81VarArr;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        for (j81<T, Comparable<?>> j81Var : this.w) {
            int iM = OW8.m(j81Var.invoke(t), j81Var.invoke(t2));
            if (iM != 0) {
                return iM;
            }
        }
        return 0;
    }
}
