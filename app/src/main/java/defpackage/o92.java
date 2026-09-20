package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o92<Key, Value, Collection, Builder extends Map<Key, Value>> extends T23<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {
    public final rv1<Key> a;
    public final rv1<Value> b;

    public o92(rv1 rv1Var, rv1 rv1Var2) {
        this.a = rv1Var;
        this.b = rv1Var2;
    }

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public abstract pa4 a();

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, Collection collection) {
        i(collection);
        eu1 eu1VarW = ls0Var.w(a());
        Iterator<Map.Entry<? extends Key, ? extends Value>> itH = h(collection);
        int i = 0;
        while (itH.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = itH.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i2 = i + 1;
            eu1VarW.k0(a(), i, this.a, key);
            eu1VarW.k0(a(), i2, this.b, value);
            i = i2 + 1;
        }
        eu1VarW.k();
    }

    @Override // defpackage.T23
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void k(g40 g40Var, int i, Builder builder, boolean z) {
        int iP;
        Object objJ = g40Var.J(a(), i, this.a, null);
        if (z) {
            iP = g40Var.p(a());
            if (!(iP == i + 1)) {
                throw new IllegalArgumentException(Md5A.e("Value must follow key in a map, index for key: ", i, ", returned index for value: ", iP).toString());
            }
        } else {
            iP = i + 1;
        }
        boolean zContainsKey = builder.containsKey(objJ);
        rv1<Value> rv1Var = this.b;
        builder.put(objJ, (!zContainsKey || (rv1Var.a().e() instanceof ee3)) ? g40Var.J(a(), iP, rv1Var, null) : g40Var.J(a(), iP, rv1Var, t92.P(objJ, builder)));
    }
}
