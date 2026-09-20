package defpackage;

import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.client.plugins.HttpPlainText$Plugin$install$2", f = "HttpPlainText.kt", l = {133, 135}, m = "invokeSuspend")
public final class xf1 extends px4 implements y81<k33<rg1, ve1>, rg1, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ k33 B;
    public /* synthetic */ Object C;
    public final /* synthetic */ vf1 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf1(vf1 vf1Var, z80<? super xf1> z80Var) {
        super(3, z80Var);
        this.D = vf1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        k33 k33Var;
        rb5 rb5Var;
        n80 n80VarA;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i != 0) {
            if (i == 1) {
                rb5Var = (rb5) this.C;
                k33Var = this.B;
                C0239D.H(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }
        C0239D.H(obj);
        k33 k33Var2 = this.B;
        rg1 rg1Var = (rg1) this.C;
        rb5 rb5Var2 = rg1Var.a;
        if (ur1.a(rb5Var2.a, nl3.a(String.class))) {
            Object obj2 = rg1Var.b;
            if (obj2 instanceof fk) {
                this.B = k33Var2;
                this.C = rb5Var2;
                this.A = 1;
                Object objP = ((fk) obj2).p(Long.MAX_VALUE, this);
                if (objP == va0Var) {
                    return va0Var;
                }
                k33Var = k33Var2;
                obj = objP;
                rb5Var = rb5Var2;
            }
        }
        return sd5.a;
        hk hkVar = (hk) obj;
        ve1 ve1Var = (ve1) k33Var.w;
        vf1 vf1Var = this.D;
        vf1Var.getClass();
        mc1 mc1VarA = ve1Var.e().a();
        List<String> list = rf1.a;
        String str = mc1VarA.get("Content-Type");
        if (str != null) {
            n80 n80Var = n80.e;
            n80VarA = n80.CQf.a(str);
        } else {
            n80VarA = null;
        }
        Charset charsetE = n80VarA != null ? XTd3.e(n80VarA) : null;
        if (charsetE == null) {
            charsetE = vf1Var.a;
        }
        rg1 rg1Var2 = new rg1(rb5Var, ps0.w(charsetE.newDecoder(), hkVar, Integer.MAX_VALUE));
        this.B = null;
        this.C = null;
        this.A = 2;
        if (k33Var.e(rg1Var2, this) == va0Var) {
            return va0Var;
        }
        return sd5.a;
    }

    @Override // defpackage.y81
    public final Object invoke(k33<rg1, ve1> k33Var, rg1 rg1Var, z80<? super sd5> z80Var) {
        xf1 xf1Var = new xf1(this.D, z80Var);
        xf1Var.B = k33Var;
        xf1Var.C = rg1Var;
        return xf1Var.i(sd5.a);
    }
}
