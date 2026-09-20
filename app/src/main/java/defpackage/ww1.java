package defpackage;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ww1<T> {
    public final wa4 a;

    public ww1(ws1 ws1Var) {
        this.a = ws1Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(bb4 bb4Var, z80 z80Var) throws Throwable {
        vw1 vw1Var;
        ww1<T> ww1Var;
        cb4 cb4Var;
        cb4 cb4Var2;
        if (z80Var instanceof vw1) {
            vw1Var = (vw1) z80Var;
            int i = vw1Var.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                vw1Var.D = i - Integer.MIN_VALUE;
            } else {
                vw1Var = new vw1(this, z80Var);
            }
        } else {
            vw1Var = new vw1(this, z80Var);
        }
        Object objB = vw1Var.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = vw1Var.D;
        if (i2 == 0) {
            C0239D.H(objB);
            try {
                bb4Var.c = ac.j(bb4Var.f, this.a.a());
                vw1Var.z = this;
                vw1Var.A = bb4Var;
                vw1Var.D = 1;
                objB = b(bb4Var);
                if (objB == va0Var) {
                    return va0Var;
                }
                ww1Var = this;
                if (objB != null) {
                    cb4Var2 = bb4Var;
                    return objB;
                }
                cb4Var2 = bb4Var;
                cb4Var2.c = ac.f(cb4Var2.c(), ww1Var.a.a());
                vw1Var.z = null;
                vw1Var.A = null;
                vw1Var.D = 2;
                objB = ww1Var.b(cb4Var2);
                if (objB == va0Var) {
                    return va0Var;
                }
            } catch (SerializationException unused) {
                ww1Var = this;
                cb4Var = bb4Var;
                objB = null;
                cb4Var2 = cb4Var;
            }
        } else if (i2 == 1) {
            cb4 cb4Var3 = vw1Var.A;
            ww1Var = vw1Var.z;
            try {
                C0239D.H(objB);
                cb4Var2 = cb4Var3;
            } catch (SerializationException unused2) {
                cb4Var = cb4Var3;
                objB = null;
                cb4Var2 = cb4Var;
            }
            if (objB != null) {
                cb4Var2 = bb4Var;
                return objB;
            }
            cb4Var2 = bb4Var;
            cb4Var2.c = ac.f(cb4Var2.c(), ww1Var.a.a());
            vw1Var.z = null;
            vw1Var.A = null;
            vw1Var.D = 2;
            objB = ww1Var.b(cb4Var2);
            if (objB == va0Var) {
                return va0Var;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(objB);
        }
        return objB;
    }

    public abstract dw2.QnHx b(cb4 cb4Var);
}
