package defpackage;

import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.client.plugins.HttpPlainText$Plugin$install$1", f = "HttpPlainText.kt", l = {127}, m = "invokeSuspend")
public final class wf1 extends px4 implements y81<k33<Object, ig1>, Object, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ k33 B;
    public /* synthetic */ Object C;
    public final /* synthetic */ vf1 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf1(vf1 vf1Var, z80<? super wf1> z80Var) {
        super(3, z80Var);
        this.D = vf1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        Charset charsetE;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            k33 k33Var = this.B;
            Object obj2 = this.C;
            ig1 ig1Var = (ig1) k33Var.w;
            vf1 vf1Var = this.D;
            vf1Var.getClass();
            List<String> list = rf1.a;
            oc1 oc1Var = ig1Var.c;
            if (oc1Var.g("Accept-Charset") == null) {
                oc1Var.b("Accept-Charset", vf1Var.c);
            }
            if (!(obj2 instanceof String)) {
                return sd5.a;
            }
            n80 n80VarB = ac.b((tf1) k33Var.w);
            if (n80VarB != null) {
                if (!ur1.a(n80VarB.c, n80.F1.a.c)) {
                    return sd5.a;
                }
            }
            String str = (String) obj2;
            n80 n80Var = n80VarB == null ? n80.F1.a : n80VarB;
            if (n80VarB == null || (charsetE = XTd3.e(n80VarB)) == null) {
                charsetE = vf1Var.b;
            }
            CharBuffer charBuffer = sp.a;
            v15 v15Var = new v15(str, n80Var.c(charsetE.name()));
            this.B = null;
            this.A = 1;
            if (k33Var.e(v15Var, this) == va0Var) {
                return va0Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        return sd5.a;
    }

    @Override // defpackage.y81
    public final Object invoke(k33<Object, ig1> k33Var, Object obj, z80<? super sd5> z80Var) {
        wf1 wf1Var = new wf1(this.D, z80Var);
        wf1Var.B = k33Var;
        wf1Var.C = obj;
        return wf1Var.i(sd5.a);
    }
}
