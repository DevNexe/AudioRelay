package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class n72 {
    public static final j72 a;

    static {
        String property;
        Object next;
        int i = qz4.a;
        j72 j72VarB = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        List<? extends m72> listL0 = na4.L0(ba4.F0(O.e()));
        Iterator it = listL0.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int iC = ((m72) next).c();
                do {
                    Object next2 = it.next();
                    int iC2 = ((m72) next2).c();
                    if (iC < iC2) {
                        next = next2;
                        iC = iC2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        m72 m72Var = (m72) next;
        if (m72Var == null) {
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        }
        try {
            j72VarB = m72Var.b(listL0);
        } catch (Throwable unused2) {
            m72Var.a();
        }
        if (j72VarB != null) {
            a = j72VarB;
            return;
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        throw th;
    }
}
