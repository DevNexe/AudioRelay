package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m05<Tag> implements pf0, g40 {
    public final ArrayList<Tag> w = new ArrayList<>();
    public boolean x;

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class QnHx<T> extends cx1 implements h81<T> {
        public final /* synthetic */ m05<Tag> w;
        public final /* synthetic */ zj0<T> x;
        public final /* synthetic */ T y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(m05<Tag> m05Var, zj0<T> zj0Var, T t) {
            super(0);
            this.w = m05Var;
            this.x = zj0Var;
            this.y = t;
        }

        @Override // defpackage.h81
        public final T invoke() {
            return (T) this.w.O(this.x);
        }
    }

    @Override // defpackage.g40
    public final String A(pa4 pa4Var, int i) {
        return o(q(pa4Var, i));
    }

    @Override // defpackage.pf0
    public final int C() {
        return l(r());
    }

    @Override // defpackage.g40
    public final short D(ce3 ce3Var, int i) {
        return n(q(ce3Var, i));
    }

    @Override // defpackage.g40
    public final <T> T J(pa4 pa4Var, int i, zj0<T> zj0Var, T t) {
        String strQ = q(pa4Var, i);
        QnHx qnHx = new QnHx(this, zj0Var, t);
        this.w.add(strQ);
        T t2 = (T) qnHx.invoke();
        if (!this.x) {
            r();
        }
        this.x = false;
        return t2;
    }

    @Override // defpackage.pf0
    public final void L() {
    }

    @Override // defpackage.pf0
    public abstract <T> T O(zj0<T> zj0Var);

    @Override // defpackage.pf0
    public final String Q() {
        return o(r());
    }

    @Override // defpackage.pf0
    public final int S(pa4 pa4Var) {
        return g(r(), pa4Var);
    }

    @Override // defpackage.pf0
    public final long V() {
        return m(r());
    }

    @Override // defpackage.g40
    public final int W(ce3 ce3Var, int i) {
        return l(q(ce3Var, i));
    }

    @Override // defpackage.pf0
    public abstract boolean X();

    @Override // defpackage.g40
    public final void b0() {
    }

    public abstract boolean c(Tag tag);

    public abstract byte d(Tag tag);

    public abstract char e(Tag tag);

    public abstract double f(Tag tag);

    public abstract int g(Tag tag, pa4 pa4Var);

    @Override // defpackage.pf0
    public final pf0 g0(mn1 mn1Var) {
        return k(r(), mn1Var);
    }

    public abstract float h(Tag tag);

    @Override // defpackage.pf0
    public final boolean i() {
        return c(r());
    }

    @Override // defpackage.g40
    public final boolean i0(ce3 ce3Var, int i) {
        return c(q(ce3Var, i));
    }

    @Override // defpackage.pf0
    public final char j() {
        return e(r());
    }

    @Override // defpackage.pf0
    public final byte j0() {
        return d(r());
    }

    public abstract pf0 k(Object obj, mn1 mn1Var);

    public abstract int l(Tag tag);

    @Override // defpackage.pf0
    public final short l0() {
        return n(r());
    }

    public abstract long m(Tag tag);

    public abstract short n(Tag tag);

    @Override // defpackage.pf0
    public final float n0() {
        return h(r());
    }

    public abstract String o(Tag tag);

    @Override // defpackage.g40
    public final Object o0(u83 u83Var, int i, rv1 rv1Var, Object obj) {
        String strQ = q(u83Var, i);
        l05 l05Var = new l05(this, rv1Var, obj);
        this.w.add(strQ);
        Object objInvoke = l05Var.invoke();
        if (!this.x) {
            r();
        }
        this.x = false;
        return objInvoke;
    }

    @Override // defpackage.g40
    public final long p0(pa4 pa4Var, int i) {
        return m(q(pa4Var, i));
    }

    public abstract String q(pa4 pa4Var, int i);

    public final Tag r() {
        ArrayList<Tag> arrayList = this.w;
        Tag tagRemove = arrayList.remove(ps0.J(arrayList));
        this.x = true;
        return tagRemove;
    }

    @Override // defpackage.g40
    public final double s(ce3 ce3Var, int i) {
        return f(q(ce3Var, i));
    }

    @Override // defpackage.pf0
    public final double s0() {
        return f(r());
    }

    @Override // defpackage.g40
    public final char t(ce3 ce3Var, int i) {
        return e(q(ce3Var, i));
    }

    @Override // defpackage.g40
    public final float v(ce3 ce3Var, int i) {
        return h(q(ce3Var, i));
    }

    @Override // defpackage.g40
    public final byte z(ce3 ce3Var, int i) {
        return d(q(ce3Var, i));
    }
}
