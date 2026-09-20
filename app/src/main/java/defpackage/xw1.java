package defpackage;

import io.ktor.serialization.JsonConvertException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class xw1 implements s70 {
    public final wa4 a;
    public final yw1 b;

    @if0(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter", f = "KotlinxSerializationConverter.kt", l = {67}, m = "deserialize")
    public static final class QnHx extends b90 {
        public Charset A;
        public rv1 B;
        public /* synthetic */ Object C;
        public int E;
        public xw1 z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.C = obj;
            this.E |= Integer.MIN_VALUE;
            return xw1.this.b(null, null, null, this);
        }
    }

    public xw1(ws1 ws1Var) {
        this.a = ws1Var;
        if ((ws1Var instanceof va) || (ws1Var instanceof ru4)) {
            this.b = new yw1(this, ws1Var);
            return;
        }
        throw new IllegalArgumentException(("Only binary and string formats are supported, " + ws1Var + " is not supported.").toString());
    }

    @Override // defpackage.s70
    public final Object a(n80 n80Var, rb5 rb5Var, Object obj, Charset charset, h80.F1 f1) {
        return this.b.a(new bb4(this.a, obj, rb5Var, charset, n80Var), f1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.s70
    public final Object b(Charset charset, rb5 rb5Var, fk fkVar, z80<Object> z80Var) throws Throwable {
        QnHx qnHx;
        rv1 rv1VarJ;
        xw1 xw1Var;
        oq oqVarN;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.E = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(z80Var);
            }
        } else {
            qnHx = new QnHx(z80Var);
        }
        Object objP = qnHx.C;
        Object obj = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.E;
        long j = Long.MAX_VALUE;
        if (i2 == 0) {
            C0239D.H(objP);
            rv1VarJ = ac.j(rb5Var, this.a.a());
            qnHx.z = this;
            qnHx.A = charset;
            qnHx.B = rv1VarJ;
            qnHx.E = 1;
            objP = fkVar.p(Long.MAX_VALUE, qnHx);
            if (objP == obj) {
                return obj;
            }
            xw1Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rv1 rv1Var = qnHx.B;
            Charset charset2 = qnHx.A;
            xw1Var = qnHx.z;
            C0239D.H(objP);
            rv1VarJ = rv1Var;
            charset = charset2;
        }
        hk hkVar = (hk) objP;
        try {
            wa4 wa4Var = xw1Var.a;
            if (wa4Var instanceof ru4) {
                return ((ru4) wa4Var).c(rv1VarJ, ps0.w(charset.newDecoder(), hkVar, Integer.MAX_VALUE));
            }
            if (wa4Var instanceof va) {
                ac.h(hkVar);
                return ((va) wa4Var).d();
            }
            while (j != 0 && (oqVarN = hkVar.n()) != null) {
                int iMin = (int) Math.min(oqVarN.c - oqVarN.b, j);
                oqVarN.c(iMin);
                hkVar.z += iMin;
                if (oqVarN.c - oqVarN.b == 0) {
                    hkVar.v(oqVarN);
                }
                j -= (long) iMin;
            }
            throw new IllegalStateException(("Unsupported format " + xw1Var.a).toString());
        } catch (Throwable th) {
            throw new JsonConvertException(th);
        }
    }
}
