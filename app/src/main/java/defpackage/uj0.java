package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class uj0<T> implements ws4, vj0<T> {
    public final h81<T> w;
    public QnHx<T> x = new QnHx<>();

    public static final class CQf extends cx1 implements j81<Object, sd5> {
        public final /* synthetic */ uj0<T> w;
        public final /* synthetic */ HashSet<ws4> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(uj0<T> uj0Var, HashSet<ws4> hashSet) {
            super(1);
            this.w = uj0Var;
            this.x = hashSet;
        }

        @Override // defpackage.j81
        public final sd5 invoke(Object obj) {
            if (obj == this.w) {
                throw new IllegalStateException("A derived state calculation cannot read itself".toString());
            }
            if (obj instanceof ws4) {
                this.x.add(obj);
            }
            return sd5.a;
        }
    }

    public static final class QnHx<T> extends xs4 {
        public static final Object f = new Object();
        public HashSet<ws4> c;
        public Object d = f;
        public int e;

        @Override // defpackage.xs4
        public final void a(xs4 xs4Var) {
            QnHx qnHx = (QnHx) xs4Var;
            this.c = qnHx.c;
            this.d = qnHx.d;
            this.e = qnHx.e;
        }

        @Override // defpackage.xs4
        public final xs4 b() {
            return new QnHx();
        }

        public final int c(vj0<?> vj0Var, cp4 cp4Var) {
            HashSet<ws4> hashSet;
            synchronized (ip4.c) {
                hashSet = this.c;
            }
            int iIdentityHashCode = 7;
            if (hashSet != null) {
                List list = (o13) sp4.a.h();
                if (list == null) {
                    list = on4.x;
                }
                int size = list.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    ((j81) ((uy2) list.get(i2)).w).invoke(vj0Var);
                }
                try {
                    for (ws4 ws4Var : hashSet) {
                        xs4 xs4VarN = ip4.n(ws4Var.a(), ws4Var, cp4Var);
                        iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(xs4VarN)) * 31) + xs4VarN.a;
                    }
                    sd5 sd5Var = sd5.a;
                } finally {
                    int size2 = list.size();
                    while (i < size2) {
                        ((j81) ((uy2) list.get(i)).x).invoke(vj0Var);
                        i++;
                    }
                }
            }
            return iIdentityHashCode;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public uj0(h81<? extends T> h81Var) {
        this.w = h81Var;
    }

    @Override // defpackage.ws4
    public final xs4 a() {
        return this.x;
    }

    @Override // defpackage.ws4
    public final /* synthetic */ xs4 b(xs4 xs4Var, xs4 xs4Var2, xs4 xs4Var3) {
        return null;
    }

    public final QnHx<T> c(QnHx<T> qnHx, cp4 cp4Var, h81<? extends T> h81Var) {
        QnHx<T> qnHx2;
        int i = 0;
        if (qnHx.d != QnHx.f && qnHx.e == qnHx.c(this, cp4Var)) {
            return qnHx;
        }
        Boolean bool = (Boolean) sp4.b.h();
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        HashSet<ws4> hashSet = new HashSet<>();
        List list = (o13) sp4.a.h();
        if (list == null) {
            list = on4.x;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((j81) ((uy2) list.get(i2)).w).invoke(this);
        }
        if (!zBooleanValue) {
            try {
                sp4.b.j(Boolean.TRUE);
            } catch (Throwable th) {
                int size2 = list.size();
                while (i < size2) {
                    ((j81) ((uy2) list.get(i)).x).invoke(this);
                    i++;
                }
                throw th;
            }
        }
        Object objA = cp4.QnHx.a(new CQf(this, hashSet), h81Var);
        if (!zBooleanValue) {
            sp4.b.j(Boolean.FALSE);
        }
        int size3 = list.size();
        while (i < size3) {
            ((j81) ((uy2) list.get(i)).x).invoke(this);
            i++;
        }
        synchronized (ip4.c) {
            cp4 cp4VarH = ip4.h();
            QnHx<T> qnHx3 = this.x;
            xs4 xs4VarJ = ip4.j(qnHx3, this);
            xs4VarJ.a(qnHx3);
            xs4VarJ.a = cp4VarH.d();
            qnHx2 = (QnHx) xs4VarJ;
            qnHx2.c = hashSet;
            qnHx2.e = qnHx2.c(this, cp4VarH);
            qnHx2.d = objA;
        }
        if (!zBooleanValue) {
            ip4.h().l();
        }
        return qnHx2;
    }

    @Override // defpackage.ws4
    public final void f(xs4 xs4Var) {
        this.x = (QnHx) xs4Var;
    }

    @Override // defpackage.is4
    public final T getValue() {
        j81<Object, sd5> j81VarF = ip4.h().f();
        if (j81VarF != null) {
            j81VarF.invoke(this);
        }
        return i();
    }

    @Override // defpackage.vj0
    public final T i() {
        return (T) c((QnHx) ip4.g(this.x, ip4.h()), ip4.h(), this.w).d;
    }

    @Override // defpackage.vj0
    public final Set<ws4> k() {
        HashSet<ws4> hashSet = c((QnHx) ip4.g(this.x, ip4.h()), ip4.h(), this.w).c;
        return hashSet != null ? hashSet : hs0.w;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        QnHx qnHx = (QnHx) ip4.g(this.x, ip4.h());
        sb.append(qnHx.d != QnHx.f && qnHx.e == qnHx.c(this, ip4.h()) ? String.valueOf(qnHx.d) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
