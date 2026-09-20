package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiation$Plugin$install$2", f = "ContentNegotiation.kt", l = {210, 212}, m = "invokeSuspend")
public final class k80 extends px4 implements y81<k33<rg1, ve1>, rg1, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ k33 B;
    public /* synthetic */ Object C;
    public final /* synthetic */ h80 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k80(h80 h80Var, z80<? super k80> z80Var) {
        super(3, z80Var);
        this.D = h80Var;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0111  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        n80 n80VarA;
        Charset charsetForName;
        Object objQ;
        k33 k33Var;
        rb5 rb5Var;
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
        mc1 mc1VarA = ((ve1) k33Var2.w).e().a();
        List<String> list = rf1.a;
        String str = mc1VarA.get("Content-Type");
        if (str != null) {
            n80 n80Var = n80.e;
            n80VarA = n80.CQf.a(str);
        } else {
            n80VarA = null;
        }
        if (n80VarA == null) {
            return sd5.a;
        }
        mc1 mc1VarA2 = ((ve1) k33Var2.w).d().a();
        Charset charset = up.a;
        Iterator it = wu.Z0(o70.f(mc1VarA2.get("Accept-Charset")), new nf1()).iterator();
        while (true) {
            if (!it.hasNext()) {
                charsetForName = null;
                break;
            }
            String str2 = ((ic1) it.next()).a;
            if (ur1.a(str2, "*")) {
                charsetForName = charset;
                break;
            }
            if (Charset.isSupported(str2)) {
                charsetForName = Charset.forName(str2);
                break;
            }
        }
        if (charsetForName != null) {
            charset = charsetForName;
        }
        this.B = k33Var2;
        this.C = rb5Var2;
        this.A = 1;
        h80 h80Var = this.D;
        h80Var.getClass();
        Object obj2 = rg1Var.b;
        if (obj2 instanceof fk) {
            if (h80Var.b.contains(rb5Var2.a)) {
                objQ = null;
            } else {
                List<h80.QnHx.C0136QnHx> list2 = h80Var.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list2) {
                    if (((h80.QnHx.C0136QnHx) obj3).c.a(n80VarA)) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(mu.w0(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((h80.QnHx.C0136QnHx) it2.next()).a);
                }
                if (!(true ^ arrayList2.isEmpty())) {
                    arrayList2 = null;
                }
                if (arrayList2 == null) {
                    objQ = null;
                } else {
                    objQ = X.q(arrayList2, (fk) obj2, rb5Var2, charset, this);
                }
            }
        } else {
            objQ = null;
        }
        if (objQ == va0Var) {
            return va0Var;
        }
        k33Var = k33Var2;
        obj = objQ;
        rb5Var = rb5Var2;
        if (obj == null) {
            return sd5.a;
        }
        rg1 rg1Var2 = new rg1(rb5Var, obj);
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
        k80 k80Var = new k80(this.D, z80Var);
        k80Var.B = k33Var;
        k80Var.C = rg1Var;
        return k80Var.i(sd5.a);
    }
}
