package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public class su extends ru {
    public static final void A0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        arrayList.remove(ps0.J(arrayList));
    }

    public static final void x0(Iterable iterable, Collection collection) {
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static final boolean y0(Iterable iterable, j81 j81Var) {
        Iterator it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (((Boolean) j81Var.invoke(it.next())).booleanValue()) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static final void z0(j81 j81Var, List list) {
        int iJ;
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof jv1) && !(list instanceof kv1)) {
                sb5.f(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                y0(list, j81Var);
                return;
            } catch (ClassCastException e) {
                ur1.c(sb5.class.getName(), e);
                throw e;
            }
        }
        int i = 0;
        op1 it = new pp1(0, ps0.J(list)).iterator();
        while (it.y) {
            int iNextInt = it.nextInt();
            Object obj = list.get(iNextInt);
            if (!((Boolean) j81Var.invoke(obj)).booleanValue()) {
                if (i != iNextInt) {
                    list.set(i, obj);
                }
                i++;
            }
        }
        if (i >= list.size() || i > (iJ = ps0.J(list))) {
            return;
        }
        while (true) {
            list.remove(iJ);
            if (iJ == i) {
                return;
            } else {
                iJ--;
            }
        }
    }
}
