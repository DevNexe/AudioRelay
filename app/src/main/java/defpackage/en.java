package defpackage;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class en implements ro0 {
    public final QnHx w = new QnHx();
    public final CQf x = new CQf();
    public jtf y;
    public jtf z;

    public static final class CQf implements ko0 {
        public final fn a = new fn(this);

        public CQf() {
        }

        @Override // defpackage.ko0
        public final void a(long j) {
            en.this.w.d = j;
        }

        @Override // defpackage.ko0
        public final dn b() {
            return en.this.w.c;
        }

        @Override // defpackage.ko0
        public final long d() {
            return en.this.w.d;
        }
    }

    public static final class QnHx {
        public ij0 a;
        public jy1 b;
        public dn c;
        public long d;

        public QnHx() {
            jj0 jj0Var = FNO9.y;
            jy1 jy1Var = jy1.Ltr;
            ur0 ur0Var = new ur0();
            long j = cm4.b;
            this.a = jj0Var;
            this.b = jy1Var;
            this.c = ur0Var;
            this.d = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QnHx)) {
                return false;
            }
            QnHx qnHx = (QnHx) obj;
            return ur1.a(this.a, qnHx.a) && this.b == qnHx.b && ur1.a(this.c, qnHx.c) && cm4.b(this.d, qnHx.d);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
            long j = this.d;
            int i = cm4.d;
            return ((int) (j ^ (j >>> 32))) + iHashCode;
        }

        public final String toString() {
            return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) cm4.f(this.d)) + ')';
        }
    }

    public static py2 c(en enVar, long j, B8C b8c, float f, av avVar, int i) {
        py2 py2VarY = enVar.y(b8c);
        long jX = x(j, f);
        jtf jtfVar = (jtf) py2VarY;
        if (!yu.c(jtfVar.a(), jX)) {
            jtfVar.k(jX);
        }
        if (jtfVar.c != null) {
            jtfVar.f(null);
        }
        if (!ur1.a(jtfVar.d, avVar)) {
            jtfVar.i(avVar);
        }
        if (!(jtfVar.b == i)) {
            jtfVar.c(i);
        }
        if (!(jtfVar.j() == 1)) {
            jtfVar.h(1);
        }
        return py2VarY;
    }

    public static /* synthetic */ py2 q(en enVar, cg cgVar, B8C b8c, float f, av avVar, int i) {
        return enVar.l(cgVar, b8c, f, avVar, i, 1);
    }

    public static py2 u(en enVar, long j, float f, int i, fXUx fxux, float f2, av avVar, int i2) {
        jtf jtfVar = enVar.z;
        if (jtfVar == null) {
            jtfVar = new jtf();
            jtfVar.w(1);
            enVar.z = jtfVar;
        }
        long jX = x(j, f2);
        if (!yu.c(jtfVar.a(), jX)) {
            jtfVar.k(jX);
        }
        if (jtfVar.c != null) {
            jtfVar.f(null);
        }
        if (!ur1.a(jtfVar.d, avVar)) {
            jtfVar.i(avVar);
        }
        if (!(jtfVar.b == i2)) {
            jtfVar.c(i2);
        }
        if (!(jtfVar.q() == f)) {
            jtfVar.v(f);
        }
        if (!(jtfVar.p() == 4.0f)) {
            jtfVar.u(4.0f);
        }
        if (!(jtfVar.m() == i)) {
            jtfVar.s(i);
        }
        if (!(jtfVar.o() == 0)) {
            jtfVar.t(0);
        }
        jtfVar.getClass();
        if (!ur1.a(null, fxux)) {
            jtfVar.r(fxux);
        }
        if (!(jtfVar.j() == 1)) {
            jtfVar.h(1);
        }
        return jtfVar;
    }

    public static long x(long j, float f) {
        return !((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) == 0) ? yu.b(j, yu.d(j) * f) : j;
    }

    @Override // defpackage.ro0
    public final void C(bj1 bj1Var, long j, float f, B8C b8c, av avVar, int i) {
        this.w.c.t(bj1Var, j, q(this, null, b8c, f, avVar, i));
    }

    @Override // defpackage.ro0
    public final void D(bj1 bj1Var, long j, long j2, long j3, long j4, float f, B8C b8c, av avVar, int i, int i2) {
        this.w.c.j(bj1Var, j, j2, j3, j4, l(null, b8c, f, avVar, i, i2));
    }

    @Override // defpackage.ro0
    public final void E(long j, long j2, long j3, float f, int i, fXUx fxux, float f2, av avVar, int i2) {
        this.w.c.a(j2, j3, u(this, j, f, i, fxux, f2, avVar, i2));
    }

    @Override // defpackage.ro0
    public final void H(qz2 qz2Var, cg cgVar, float f, B8C b8c, av avVar, int i) {
        this.w.c.c(qz2Var, q(this, cgVar, b8c, f, avVar, i));
    }

    @Override // defpackage.ro0
    public final void M(cg cgVar, long j, long j2, float f, B8C b8c, av avVar, int i) {
        this.w.c.u(kt2.c(j), kt2.d(j), cm4.e(j2) + kt2.c(j), cm4.c(j2) + kt2.d(j), q(this, cgVar, b8c, f, avVar, i));
    }

    @Override // defpackage.ij0
    public final float Q(float f) {
        return f / getDensity();
    }

    @Override // defpackage.ro0
    public final void S(cg cgVar, long j, long j2, long j3, float f, B8C b8c, av avVar, int i) {
        this.w.c.b(kt2.c(j), kt2.d(j), kt2.c(j) + cm4.e(j2), kt2.d(j) + cm4.c(j2), ha0.b(j3), ha0.c(j3), q(this, cgVar, b8c, f, avVar, i));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ro0
    public final void T(cg cgVar, long j, long j2, float f, int i, fXUx fxux, float f2, av avVar, int i2) {
        dn dnVar = this.w.c;
        jtf jtfVar = this.z;
        if (jtfVar == null) {
            jtfVar = new jtf();
            jtfVar.w(1);
            this.z = jtfVar;
        }
        cgVar.a(f2, d(), jtfVar);
        if (!ur1.a(jtfVar.d, avVar)) {
            jtfVar.i(avVar);
        }
        if (!(jtfVar.b == i2)) {
            jtfVar.c(i2);
        }
        if (!(jtfVar.q() == f)) {
            jtfVar.v(f);
        }
        if (!(jtfVar.p() == 4.0f)) {
            jtfVar.u(4.0f);
        }
        if (!(jtfVar.m() == i)) {
            jtfVar.s(i);
        }
        if (!(jtfVar.o() == 0)) {
            jtfVar.t(0);
        }
        jtfVar.getClass();
        if (!ur1.a(null, fxux)) {
            jtfVar.r(fxux);
        }
        if (!(jtfVar.j() == 1)) {
            jtfVar.h(1);
        }
        dnVar.a(j, j2, jtfVar);
    }

    @Override // defpackage.ij0
    public final float U() {
        return this.w.a.U();
    }

    @Override // defpackage.ro0
    public final void V(long j, float f, long j2, float f2, B8C b8c, av avVar, int i) {
        this.w.c.s(f, j2, c(this, j, b8c, f2, avVar, i));
    }

    @Override // defpackage.ro0
    public final void a0(long j, long j2, long j3, long j4, B8C b8c, float f, av avVar, int i) {
        this.w.c.b(kt2.c(j2), kt2.d(j2), cm4.e(j3) + kt2.c(j2), cm4.c(j3) + kt2.d(j2), ha0.b(j4), ha0.c(j4), c(this, j, b8c, f, avVar, i));
    }

    @Override // defpackage.ij0
    public final float b0(float f) {
        return getDensity() * f;
    }

    @Override // defpackage.ro0
    public final void c0(long j, long j2, long j3, float f, B8C b8c, av avVar, int i) {
        this.w.c.u(kt2.c(j2), kt2.d(j2), cm4.e(j3) + kt2.c(j2), cm4.c(j3) + kt2.d(j2), c(this, j, b8c, f, avVar, i));
    }

    @Override // defpackage.ro0
    public final long d() {
        int i = qo0.a;
        return this.x.d();
    }

    @Override // defpackage.ro0
    public final CQf e0() {
        return this.x;
    }

    @Override // defpackage.ij0
    public final float getDensity() {
        return this.w.a.getDensity();
    }

    @Override // defpackage.ro0
    public final jy1 getLayoutDirection() {
        return this.w.b;
    }

    @Override // defpackage.ij0
    public final float j(int i) {
        return i / getDensity();
    }

    public final py2 l(cg cgVar, B8C b8c, float f, av avVar, int i, int i2) {
        py2 py2VarY = y(b8c);
        if (cgVar != null) {
            cgVar.a(f, d(), py2VarY);
        } else {
            if (!(py2VarY.n() == f)) {
                py2VarY.b(f);
            }
        }
        if (!ur1.a(py2VarY.d(), avVar)) {
            py2VarY.i(avVar);
        }
        if (!(py2VarY.l() == i)) {
            py2VarY.c(i);
        }
        if (!(py2VarY.j() == i2)) {
            py2VarY.h(i2);
        }
        return py2VarY;
    }

    @Override // defpackage.ro0
    public final void n(TQ2_ tq2_, long j, float f, B8C b8c, av avVar, int i) {
        this.w.c.c(tq2_, c(this, j, b8c, f, avVar, i));
    }

    @Override // defpackage.ij0
    public final /* synthetic */ int p0(float f) {
        return hj0.a(f, this);
    }

    @Override // defpackage.ro0
    public final long t0() {
        int i = qo0.a;
        return ps0.H(this.x.d());
    }

    @Override // defpackage.ij0
    public final /* synthetic */ long v(long j) {
        return hj0.c(j, this);
    }

    @Override // defpackage.ij0
    public final /* synthetic */ long v0(long j) {
        return hj0.e(j, this);
    }

    @Override // defpackage.ro0
    public final void w(long j, float f, float f2, long j2, long j3, float f3, B8C b8c, av avVar, int i) {
        this.w.c.f(kt2.c(j2), kt2.d(j2), cm4.e(j3) + kt2.c(j2), cm4.c(j3) + kt2.d(j2), f, f2, c(this, j, b8c, f3, avVar, i));
    }

    @Override // defpackage.ij0
    public final /* synthetic */ float x0(long j) {
        return hj0.d(j, this);
    }

    public final py2 y(B8C b8c) {
        if (ur1.a(b8c, gx0.w)) {
            jtf jtfVar = this.y;
            if (jtfVar != null) {
                return jtfVar;
            }
            jtf jtfVar2 = new jtf();
            jtfVar2.w(0);
            this.y = jtfVar2;
            return jtfVar2;
        }
        if (!(b8c instanceof qv4)) {
            throw new NoWhenBranchMatchedException();
        }
        jtf jtfVar3 = this.z;
        if (jtfVar3 == null) {
            jtfVar3 = new jtf();
            jtfVar3.w(1);
            this.z = jtfVar3;
        }
        float fQ = jtfVar3.q();
        qv4 qv4Var = (qv4) b8c;
        float f = qv4Var.w;
        if (!(fQ == f)) {
            jtfVar3.v(f);
        }
        int iM = jtfVar3.m();
        int i = qv4Var.y;
        if (!(iM == i)) {
            jtfVar3.s(i);
        }
        float fP = jtfVar3.p();
        float f2 = qv4Var.x;
        if (!(fP == f2)) {
            jtfVar3.u(f2);
        }
        int iO = jtfVar3.o();
        int i2 = qv4Var.z;
        if (!(iO == i2)) {
            jtfVar3.t(i2);
        }
        jtfVar3.getClass();
        qv4Var.getClass();
        if (!ur1.a(null, null)) {
            jtfVar3.r(null);
        }
        return jtfVar3;
    }

    @Override // defpackage.ro0
    public final void y0(ArrayList arrayList, long j, float f, int i, fXUx fxux, float f2, av avVar, int i2) {
        this.w.c.q(u(this, j, f, i, fxux, f2, avVar, i2), arrayList);
    }
}
