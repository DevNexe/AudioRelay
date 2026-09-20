package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class qp4<T> implements ws4, pp4<T> {
    public final rp4<T> w;
    public QnHx<T> x;

    public static final class QnHx<T> extends xs4 {
        public T c;

        public QnHx(T t) {
            this.c = t;
        }

        @Override // defpackage.xs4
        public final void a(xs4 xs4Var) {
            this.c = ((QnHx) xs4Var).c;
        }

        @Override // defpackage.xs4
        public final xs4 b() {
            return new QnHx(this.c);
        }
    }

    public qp4(T t, rp4<T> rp4Var) {
        this.w = rp4Var;
        this.x = new QnHx<>(t);
    }

    @Override // defpackage.ws4
    public final xs4 a() {
        return this.x;
    }

    @Override // defpackage.ws4
    public final xs4 b(xs4 xs4Var, xs4 xs4Var2, xs4 xs4Var3) {
        T t = ((QnHx) xs4Var2).c;
        T t2 = ((QnHx) xs4Var3).c;
        rp4<T> rp4Var = this.w;
        if (rp4Var.b(t, t2)) {
            return xs4Var2;
        }
        rp4Var.a();
        return null;
    }

    @Override // defpackage.ws4
    public final void f(xs4 xs4Var) {
        this.x = (QnHx) xs4Var;
    }

    @Override // defpackage.ri2, defpackage.is4
    public final T getValue() {
        return ((QnHx) ip4.n(this.x, this, ip4.h())).c;
    }

    @Override // defpackage.pp4
    public final rp4<T> j() {
        return this.w;
    }

    @Override // defpackage.ri2
    public final void setValue(T t) {
        cp4 cp4VarH;
        xs4 xs4Var;
        QnHx qnHx = (QnHx) ip4.g(this.x, ip4.h());
        if (this.w.b(qnHx.c, t)) {
            return;
        }
        QnHx<T> qnHx2 = this.x;
        synchronized (ip4.c) {
            cp4VarH = ip4.h();
            if (cp4VarH.g()) {
                cp4VarH.m(this);
            }
            int iD = cp4VarH.d();
            if (qnHx.a == iD) {
                xs4Var = qnHx;
            } else {
                xs4 xs4VarJ = ip4.j(qnHx2, this);
                xs4VarJ.a = iD;
                cp4VarH.m(this);
                xs4Var = xs4VarJ;
            }
            ((QnHx) xs4Var).c = t;
            sd5 sd5Var = sd5.a;
        }
        ip4.k(cp4VarH, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((QnHx) ip4.g(this.x, ip4.h())).c + ")@" + hashCode();
    }
}
