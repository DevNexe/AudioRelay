package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public class na4 extends ea4 {
    public static final jx0 I0(x94 x94Var, j81 j81Var) {
        return new jx0(x94Var, true, j81Var);
    }

    public static final <T> T J0(x94<? extends T> x94Var) {
        Iterator<? extends T> it = x94Var.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static final void K0(x94 x94Var, AbstractCollection abstractCollection) {
        Iterator it = x94Var.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static final <T> List<T> L0(x94<? extends T> x94Var) {
        return ps0.S(M0(x94Var));
    }

    public static final <T> List<T> M0(x94<? extends T> x94Var) {
        ArrayList arrayList = new ArrayList();
        K0(x94Var, arrayList);
        return arrayList;
    }
}
