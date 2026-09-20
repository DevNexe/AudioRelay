package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tg1 {

    @if0(c = "io.ktor.client.statement.HttpResponseKt", f = "HttpResponse.kt", l = {95}, m = "bodyAsText")
    public static final class QnHx extends b90 {
        public /* synthetic */ Object A;
        public int B;
        public CharsetDecoder z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.A = obj;
            this.B |= Integer.MIN_VALUE;
            return tg1.a(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(qg1 qg1Var, Charset charset, z80<? super String> z80Var) throws Throwable {
        QnHx qnHx;
        n80 n80VarA;
        CharsetDecoder charsetDecoder;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.B = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(z80Var);
            }
        } else {
            qnHx = new QnHx(z80Var);
        }
        Object objA = qnHx.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.B;
        if (i2 == 0) {
            C0239D.H(objA);
            mc1 mc1VarA = qg1Var.a();
            List<String> list = rf1.a;
            String str = mc1VarA.get("Content-Type");
            if (str != null) {
                n80 n80Var = n80.e;
                n80VarA = n80.CQf.a(str);
            } else {
                n80VarA = null;
            }
            Charset charsetE = n80VarA != null ? XTd3.e(n80VarA) : null;
            if (charsetE != null) {
                charset = charsetE;
            }
            CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
            ve1 ve1VarC = qg1Var.c();
            xb5 xb5VarC = nl3.c(qn1.class);
            rb5 rb5Var = new rb5(pc5.e(xb5VarC), nl3.a(qn1.class), xb5VarC);
            qnHx.z = charsetDecoderNewDecoder;
            qnHx.B = 1;
            objA = ve1VarC.a(rb5Var, qnHx);
            if (objA == va0Var) {
                return va0Var;
            }
            charsetDecoder = charsetDecoderNewDecoder;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            charsetDecoder = qnHx.z;
            C0239D.H(objA);
        }
        if (objA != null) {
            return ps0.w(charsetDecoder, (qn1) objA, Integer.MAX_VALUE);
        }
        throw new NullPointerException("null cannot be cast to non-null type io.ktor.utils.io.core.Input");
    }

    public static final void b(qg1 qg1Var) {
        la0 la0VarG = qg1Var.g();
        int i = ms1.j;
        ((jx) la0VarG.j(ms1.CQf.w)).h();
    }
}
