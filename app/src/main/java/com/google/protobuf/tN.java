package com.google.protobuf;

import defpackage.n54;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class tN<T> implements n54<T> {
    public final DzVS a;
    public final lpT2Fixed<?, ?> b;
    public final boolean c;
    public final y<?> d;

    public tN(lpT2Fixed<?, ?> lpt2, y<?> yVar, DzVS dzVS) {
        this.b = lpt2;
        this.c = yVar.c(dzVS);
        this.d = yVar;
        this.a = dzVS;
    }

    @Override // defpackage.n54
    public final void a(Object obj, YKK ykk) {
        Iterator itQ = this.d.b(obj).q();
        while (itQ.hasNext()) {
            Map.Entry entry = (Map.Entry) itQ.next();
            Xn1.CQf cQf = (Xn1.CQf) entry.getKey();
            if (cQf.j() != LF.CQf.F || cQf.f() || cQf.k()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof Aa.QnHx) {
                ykk.o(cQf.b(), ((Aa.QnHx) entry).w.getValue().b());
            } else {
                ykk.o(cQf.b(), entry.getValue());
            }
        }
        lpT2Fixed<?, ?> lpt2 = this.b;
        lpt2.e(lpt2.a(obj), ykk);
    }

    @Override // defpackage.n54
    public final void b(T t) {
        this.b.d(t);
        this.d.d(t);
    }

    @Override // defpackage.n54
    public final boolean c(T t) {
        return this.d.b(t).n();
    }

    @Override // defpackage.n54
    public final boolean d(T t, T t2) {
        lpT2Fixed<?, ?> lpt2 = this.b;
        if (!lpt2.a(t).equals(lpt2.a(t2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        y<?> yVar = this.d;
        return yVar.b(t).equals(yVar.b(t2));
    }

    @Override // defpackage.n54
    public final int e(T t) {
        lpT2Fixed<?, ?> lpt2 = this.b;
        int iC = lpt2.c(lpt2.a(t)) + 0;
        return this.c ? iC + this.d.b(t).i() : iC;
    }

    @Override // defpackage.n54
    public final int f(T t) {
        int iHashCode = this.b.a(t).hashCode();
        return this.c ? (iHashCode * 53) + this.d.b(t).hashCode() : iHashCode;
    }
}
