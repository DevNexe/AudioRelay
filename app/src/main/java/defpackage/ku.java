package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ku<E, C extends Collection<? extends E>, B> extends hu<E, C, B> {
    public ku(rv1<E> rv1Var) {
        super(rv1Var);
    }

    @Override // defpackage.T23
    public final Iterator h(Object obj) {
        return ((Collection) obj).iterator();
    }

    @Override // defpackage.T23
    public final int i(Object obj) {
        return ((Collection) obj).size();
    }
}
