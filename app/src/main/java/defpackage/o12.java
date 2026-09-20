package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o12 extends zo4 {
    public final q12 a;
    public final x81<zo4, ap4, Integer> b;
    public final kz2 c;
    public final uj0 d;

    public o12() {
        throw null;
    }

    public o12(q12 q12Var, x81 x81Var) {
        this.a = q12Var;
        this.b = x81Var;
        this.c = ps0.R(0);
        this.d = ps0.x(new m12(this));
    }

    @Override // defpackage.zo4
    public final boolean a() {
        q12 q12Var = this.a;
        k02 k02Var = (k02) wu.O0(q12Var.g().e());
        if (k02Var != null) {
            if (k02Var.getIndex() < q12Var.g().d() - 1) {
                return true;
            }
            if (k02Var.a() + k02Var.getOffset() > f()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.zo4
    public final boolean b() {
        k02 k02Var = (k02) wu.J0(this.a.g().e());
        if (k02Var == null) {
            return false;
        }
        return k02Var.getIndex() > 0 || k02Var.getOffset() < 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0087 A[PHI: r12
  0x0087: PHI (r12v5 float) = (r12v2 float), (r12v6 float) binds: [B:23:0x0084, B:20:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.zo4
    public final int c(float f, float f2, nf0 nf0Var) {
        float f3;
        ap4 ap4VarE = e();
        if (ap4VarE == null) {
            return -1;
        }
        float fI = i();
        float f4 = 0.0f;
        if (fI <= 0.0f) {
            return ap4VarE.a();
        }
        int iD = d(ap4VarE.a());
        int iD2 = d(ap4VarE.a() + 1);
        float fAbs = Math.abs(f);
        q12 q12Var = this.a;
        if (fAbs < 0.5f) {
            return AY.o(Math.abs(iD) < Math.abs(iD2) ? ap4VarE.a() : ap4VarE.a() + 1, 0, q12Var.g().d() - 1);
        }
        qb5 qb5Var = mg5.a;
        float fN = AY.n(((JW) nf0Var.a().e(new JW(0.0f), new JW(f))).a, -f2, f2);
        if (f < 0.0f) {
            f3 = fN + iD2;
            if (f3 <= 0.0f) {
                f4 = f3;
            }
        } else {
            f3 = fN + iD;
            if (f3 >= 0.0f) {
                f4 = f3;
            }
        }
        double d = fI;
        return AY.o(ap4VarE.a() + sy4.a((((double) f4) / d) - (((double) iD) / d)), 0, q12Var.g().d() - 1);
    }

    @Override // defpackage.zo4
    public final int d(int i) {
        p12 p12VarInvoke;
        List<k02> listE = this.a.g().e();
        n12 n12Var = n12.F;
        Iterator<T> it = listE.iterator();
        do {
            if (!it.hasNext()) {
                p12VarInvoke = null;
                break;
            }
            p12VarInvoke = n12Var.invoke(it.next());
        } while (!(p12VarInvoke.a() == i));
        p12 p12Var = p12VarInvoke;
        x81<zo4, ap4, Integer> x81Var = this.b;
        if (p12Var != null) {
            return p12Var.b() - x81Var.invoke(this, p12Var).intValue();
        }
        ap4 ap4VarE = e();
        if (ap4VarE == null) {
            return 0;
        }
        return (ap4VarE.b() + sy4.c(i() * (i - ap4VarE.a()))) - x81Var.invoke(this, ap4VarE).intValue();
    }

    @Override // defpackage.zo4
    public final ap4 e() {
        return (ap4) this.d.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zo4
    public final int f() {
        return this.a.g().b() - ((Number) this.c.getValue()).intValue();
    }

    @Override // defpackage.zo4
    public final void g() {
    }

    @Override // defpackage.zo4
    public final int h() {
        return this.a.g().d();
    }

    public final float i() {
        Object next;
        q12 q12Var = this.a;
        y02 y02VarG = q12Var.g();
        if (y02VarG.e().isEmpty()) {
            return -1.0f;
        }
        Iterator<T> it = y02VarG.e().iterator();
        Object next2 = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int offset = ((k02) next).getOffset();
                do {
                    Object next3 = it.next();
                    int offset2 = ((k02) next3).getOffset();
                    if (offset > offset2) {
                        next = next3;
                        offset = offset2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        k02 k02Var = (k02) next;
        if (k02Var == null) {
            return -1.0f;
        }
        Iterator<T> it2 = y02VarG.e().iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                k02 k02Var2 = (k02) next2;
                int iA = k02Var2.a() + k02Var2.getOffset();
                do {
                    Object next4 = it2.next();
                    k02 k02Var3 = (k02) next4;
                    int iA2 = k02Var3.a() + k02Var3.getOffset();
                    if (iA < iA2) {
                        next2 = next4;
                        iA = iA2;
                    }
                } while (it2.hasNext());
            }
        }
        k02 k02Var4 = (k02) next2;
        if (k02Var4 == null) {
            return -1.0f;
        }
        int iMax = Math.max(k02Var.a() + k02Var.getOffset(), k02Var4.a() + k02Var4.getOffset()) - Math.min(k02Var.getOffset(), k02Var4.getOffset());
        if (iMax == 0) {
            return -1.0f;
        }
        y02 y02VarG2 = q12Var.g();
        int offset3 = 0;
        if (y02VarG2.e().size() >= 2) {
            k02 k02Var5 = y02VarG2.e().get(0);
            offset3 = y02VarG2.e().get(1).getOffset() - (k02Var5.getOffset() + k02Var5.a());
        }
        return (iMax + offset3) / y02VarG.e().size();
    }
}
