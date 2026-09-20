package defpackage;

import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class yw1 extends ww1<dw2.QnHx> {
    public final /* synthetic */ xw1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw1(xw1 xw1Var, ws1 ws1Var) {
        super(ws1Var);
        this.b = xw1Var;
    }

    @Override // defpackage.ww1
    public final dw2.QnHx b(cb4 cb4Var) {
        if (!(cb4Var instanceof bb4)) {
            throw new IllegalStateException(("parameters type is " + nl3.a(cb4Var.getClass()).a() + ", but expected " + nl3.a(bb4.class).a()).toString());
        }
        rv1<?> rv1Var = cb4Var.c;
        if (rv1Var == null) {
            ur1.e("serializer");
            throw null;
        }
        wa4 wa4VarB = cb4Var.b();
        Object objC = cb4Var.c();
        bb4 bb4Var = (bb4) cb4Var;
        Charset charsetA = cb4Var.a();
        this.b.getClass();
        boolean z = wa4VarB instanceof ru4;
        n80 n80VarC = bb4Var.h;
        if (!z) {
            if (wa4VarB instanceof va) {
                return new fj(((va) wa4VarB).e(), n80VarC);
            }
            throw new IllegalStateException(("Unsupported format " + wa4VarB).toString());
        }
        String strB = ((ru4) wa4VarB).b(rv1Var, objC);
        Locale locale = Locale.ROOT;
        if (!ur1.a(n80VarC.c.toLowerCase(locale), "application") || !ur1.a(n80VarC.d.toLowerCase(locale), "json")) {
            CharBuffer charBuffer = sp.a;
            n80VarC = n80VarC.c(charsetA.name());
        }
        return new v15(strB, n80VarC);
    }
}
