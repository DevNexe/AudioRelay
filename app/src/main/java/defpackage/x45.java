package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x45 {
    public static final f34 d;
    public final Z7jl a;
    public final long b;
    public final s55 c;

    public static final class CQf extends cx1 implements j81<Object, x45> {
        public static final CQf w = new CQf();

        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final x45 invoke(Object obj) {
            List list = (List) obj;
            Object obj2 = list.get(0);
            f34 f34Var = h34.a;
            Boolean bool = Boolean.FALSE;
            Z7jl z7jl = (ur1.a(obj2, bool) || obj2 == null) ? null : (Z7jl) f34Var.a(obj2);
            Object obj3 = list.get(1);
            int i = s55.c;
            return new x45(z7jl, ((ur1.a(obj3, bool) || obj3 == null) ? null : (s55) h34.l.a(obj3)).a, (s55) null);
        }
    }

    public static final class QnHx extends cx1 implements x81<g34, x45, Object> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(2);
        }

        @Override // defpackage.x81
        public final Object invoke(g34 g34Var, x45 x45Var) {
            g34 g34Var2 = g34Var;
            x45 x45Var2 = x45Var;
            return ps0.j(h34.a(x45Var2.a, h34.a, g34Var2), h34.a(new s55(x45Var2.b), h34.l, g34Var2));
        }
    }

    static {
        f34 f34Var = e34.a;
        d = new f34(QnHx.w, CQf.w);
    }

    public x45(String str, long j, int i) {
        this(new Z7jl((i & 1) != 0 ? "" : str, null, 6), (i & 2) != 0 ? s55.b : j, (s55) null);
    }

    public static x45 a(x45 x45Var, Z7jl z7jl, long j, int i) {
        if ((i & 1) != 0) {
            z7jl = x45Var.a;
        }
        if ((i & 2) != 0) {
            j = x45Var.b;
        }
        s55 s55Var = (i & 4) != 0 ? x45Var.c : null;
        x45Var.getClass();
        return new x45(z7jl, j, s55Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x45)) {
            return false;
        }
        x45 x45Var = (x45) obj;
        return s55.a(this.b, x45Var.b) && ur1.a(this.c, x45Var.c) && ur1.a(this.a, x45Var.a);
    }

    public final int hashCode() {
        int i;
        int iHashCode = this.a.hashCode() * 31;
        int i2 = s55.c;
        long j = this.b;
        int i3 = (((int) (j ^ (j >>> 32))) + iHashCode) * 31;
        s55 s55Var = this.c;
        if (s55Var != null) {
            long j2 = s55Var.a;
            i = (int) (j2 ^ (j2 >>> 32));
        } else {
            i = 0;
        }
        return i3 + i;
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) s55.g(this.b)) + ", composition=" + this.c + ')';
    }

    public x45(Z7jl z7jl, long j, s55 s55Var) {
        this.a = z7jl;
        this.b = Cz.h(z7jl.w.length(), j);
        this.c = s55Var != null ? new s55(Cz.h(z7jl.w.length(), s55Var.a)) : null;
    }
}
