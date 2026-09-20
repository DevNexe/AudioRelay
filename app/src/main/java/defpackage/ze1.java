package defpackage;

import java.io.Closeable;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public interface ze1 extends ua0, Closeable {

    public static final class QnHx {
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public static final Object a(ze1 ze1Var, jg1 jg1Var, z80 z80Var) throws Throwable {
            af1 af1Var;
            if (z80Var instanceof af1) {
                af1Var = (af1) z80Var;
                int i = af1Var.C;
                if ((i & Integer.MIN_VALUE) != 0) {
                    af1Var.C = i - Integer.MIN_VALUE;
                } else {
                    af1Var = new af1(z80Var);
                }
            } else {
                af1Var = new af1(z80Var);
            }
            Object objG0 = af1Var.B;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = af1Var.C;
            if (i2 != 0) {
                if (i2 == 1) {
                    jg1Var = af1Var.A;
                    ze1Var = af1Var.z;
                    C0239D.H(objG0);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0239D.H(objG0);
                }
                return objG0;
            }
            C0239D.H(objG0);
            ms1 ms1Var = jg1Var.e;
            af1Var.z = ze1Var;
            af1Var.A = jg1Var;
            af1Var.C = 1;
            ta0 ta0Var = if1.a;
            os1 os1Var = new os1(ms1Var);
            objG0 = ze1Var.g().g0(os1Var).g0(if1.a);
            ms1 ms1Var2 = (ms1) af1Var.x.j(ms1.CQf.w);
            if (ms1Var2 != null) {
                os1Var.r0(new xf5(ms1.QnHx.a(ms1Var2, true, new yf5(os1Var), 2)));
            }
            if (objG0 == va0Var) {
                return va0Var;
            }
            la0 la0Var = (la0) objG0;
            oi0 oi0VarD = fp1.D(ze1Var, la0Var.g0(new zw1(la0Var)), new bf1(ze1Var, jg1Var, null), 2);
            af1Var.z = null;
            af1Var.A = null;
            af1Var.C = 2;
            objG0 = oi0VarD.U(af1Var);
            if (objG0 == va0Var) {
                return va0Var;
            }
            return objG0;
        }
    }

    st2 D();

    Set<ff1<?>> G();

    void k0(ue1 ue1Var);

    Object y0(jg1 jg1Var, z80<? super sg1> z80Var);
}
