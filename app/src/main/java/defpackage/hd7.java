package defpackage;

import com.google.android.gms.internal.measurement.NUlFixed;
import com.google.android.gms.internal.measurement.T23;
import com.google.android.gms.internal.measurement.YKK;
import com.google.android.gms.internal.measurement.auxFixed;
import com.google.android.gms.internal.measurement.qc;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes3.dex */
public final class hd7 extends fd7 {
    public final auxFixed g;
    public final /* synthetic */ fs5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd7(fs5 fs5Var, String str, int i, auxFixed auxVar) {
        super(str, i);
        this.h = fs5Var;
        this.g = auxVar;
    }

    @Override // defpackage.fd7
    public final int a() {
        return this.g.r();
    }

    @Override // defpackage.fd7
    public final boolean b() {
        return false;
    }

    @Override // defpackage.fd7
    public final boolean c() {
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean g(Long l, Long l2, qc qcVar, boolean z) {
        o67.a();
        fs5 fs5Var = this.h;
        boolean zN = fs5Var.a.g.n(this.a, lg6.V);
        auxFixed auxVar = this.g;
        boolean zX = auxVar.x();
        boolean zY = auxVar.y();
        boolean z2 = auxVar.z();
        boolean z3 = zX || zY || z2;
        Boolean boolF = null;
        boolD = null;
        Boolean boolD = null;
        Boolean boolD2 = null;
        boolF = null;
        boolF = null;
        boolF = null;
        Boolean boolD3 = null;
        boolF = null;
        dq6 dq6Var = fs5Var.a;
        if (z && !z3) {
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.n.d(Integer.valueOf(this.b), "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", auxVar.A() ? Integer.valueOf(auxVar.r()) : null);
            return true;
        }
        NUlFixed nUlS = auxVar.s();
        boolean zX2 = nUlS.x();
        if (qcVar.H()) {
            if (nUlS.z()) {
                try {
                    boolD2 = fd7.d(new BigDecimal(qcVar.s()), nUlS.t(), 0.0d);
                } catch (NumberFormatException unused) {
                }
                boolF = fd7.f(boolD2, zX2);
            } else {
                bi6 bi6Var2 = dq6Var.i;
                dq6.h(bi6Var2);
                bi6Var2.i.c(dq6Var.m.f(qcVar.w()), "No number filter for long property. property");
            }
        } else if (qcVar.G()) {
            if (nUlS.z()) {
                double dR = qcVar.r();
                try {
                    boolD = fd7.d(new BigDecimal(dR), nUlS.t(), Math.ulp(dR));
                } catch (NumberFormatException unused2) {
                }
                boolF = fd7.f(boolD, zX2);
            } else {
                bi6 bi6Var3 = dq6Var.i;
                dq6.h(bi6Var3);
                bi6Var3.i.c(dq6Var.m.f(qcVar.w()), "No number filter for double property. property");
            }
        } else if (!qcVar.J()) {
            bi6 bi6Var4 = dq6Var.i;
            dq6.h(bi6Var4);
            bi6Var4.i.c(dq6Var.m.f(qcVar.w()), "User property has no value, property");
        } else if (nUlS.B()) {
            String strX = qcVar.x();
            T23 t23U = nUlS.u();
            bi6 bi6Var5 = dq6Var.i;
            dq6.h(bi6Var5);
            boolF = fd7.f(fd7.e(strX, t23U, bi6Var5), zX2);
        } else if (!nUlS.z()) {
            bi6 bi6Var6 = dq6Var.i;
            dq6.h(bi6Var6);
            bi6Var6.i.c(dq6Var.m.f(qcVar.w()), "No string or number filter defined. property");
        } else if (b37.F(qcVar.x())) {
            String strX2 = qcVar.x();
            YKK ykkT = nUlS.t();
            if (b37.F(strX2)) {
                try {
                    boolD3 = fd7.d(new BigDecimal(strX2), ykkT, 0.0d);
                } catch (NumberFormatException unused3) {
                }
            }
            boolF = fd7.f(boolD3, zX2);
        } else {
            bi6 bi6Var7 = dq6Var.i;
            dq6.h(bi6Var7);
            bi6Var7.i.d(dq6Var.m.f(qcVar.w()), "Invalid user property value for Numeric number filter. property, value", qcVar.x());
        }
        bi6 bi6Var8 = dq6Var.i;
        dq6.h(bi6Var8);
        bi6Var8.n.c(boolF == null ? "null" : boolF, "Property filter result");
        if (boolF == null) {
            return false;
        }
        this.c = Boolean.TRUE;
        if (z2 && !boolF.booleanValue()) {
            return true;
        }
        if (!z || auxVar.x()) {
            this.d = boolF;
        }
        if (boolF.booleanValue() && z3 && qcVar.I()) {
            long jT = qcVar.t();
            if (l != null) {
                jT = l.longValue();
            }
            if (zN && auxVar.x() && !auxVar.y() && l2 != null) {
                jT = l2.longValue();
            }
            if (auxVar.y()) {
                this.f = Long.valueOf(jT);
            } else {
                this.e = Long.valueOf(jT);
            }
        }
        return true;
    }
}
