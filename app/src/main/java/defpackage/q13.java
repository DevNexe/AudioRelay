package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class q13<E> extends vDR<E> implements s13<E> {
    public static final q13 z;
    public final Object w;
    public final Object x;
    public final y03<E, x32> y;

    static {
        fTO$ fto_ = fTO$.w;
        z = new q13(fto_, fto_, y03.y);
    }

    public q13(Object obj, Object obj2, y03<E, x32> y03Var) {
        this.w = obj;
        this.x = obj2;
        this.y = y03Var;
    }

    @Override // defpackage.auxFixed
    public final int a() {
        y03<E, x32> y03Var = this.y;
        y03Var.getClass();
        return y03Var.x;
    }

    @Override // defpackage.auxFixed, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.y.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new r13(this.w, this.y);
    }

    @Override // defpackage.s13
    public final q13 n(uk3.CQf cQf) {
        y03<E, x32> y03Var = this.y;
        if (y03Var.containsKey(cQf)) {
            return this;
        }
        if (isEmpty()) {
            return new q13(cQf, cQf, y03Var.a(cQf, new x32()));
        }
        Object obj = this.x;
        return new q13(this.w, cQf, y03Var.a(obj, new x32(y03Var.get(obj).a, cQf)).a(cQf, new x32(obj, fTO$.w)));
    }

    @Override // java.util.Collection, java.util.Set, defpackage.s13
    public final q13 remove(Object obj) {
        y03<E, x32> y03VarA = this.y;
        x32 x32Var = y03VarA.get(obj);
        if (x32Var == null) {
            return this;
        }
        int iHashCode = obj != null ? obj.hashCode() : 0;
        db5<E, x32> db5Var = y03VarA.w;
        db5<E, x32> db5VarV = db5Var.v(iHashCode, 0, obj);
        if (db5Var != db5VarV) {
            y03VarA = db5VarV == null ? y03.y : new y03<>(db5VarV, y03VarA.x - 1);
        }
        fTO$ fto_ = fTO$.w;
        Object obj2 = x32Var.a;
        boolean z2 = obj2 != fto_;
        Object obj3 = x32Var.b;
        if (z2) {
            y03VarA = y03VarA.a(obj2, new x32(y03VarA.get(obj2).a, obj3));
        }
        if (obj3 != fto_) {
            y03VarA = y03VarA.a(obj3, new x32(obj2, y03VarA.get(obj3).b));
        }
        Object obj4 = !(obj2 != fto_) ? obj3 : this.w;
        if (obj3 != fto_) {
            obj2 = this.x;
        }
        return new q13(obj4, obj2, y03VarA);
    }
}
