package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.client.plugins.HttpSend$Plugin$install$1", f = "HttpSend.kt", l = {104, 105}, m = "invokeSuspend")
public final class wg1 extends px4 implements y81<k33<Object, ig1>, Object, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ k33 B;
    public /* synthetic */ Object C;
    public final /* synthetic */ vg1 D;
    public final /* synthetic */ ue1 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg1(vg1 vg1Var, ue1 ue1Var, z80<? super wg1> z80Var) {
        super(3, z80Var);
        this.D = vg1Var;
        this.E = ue1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v13, types: [T, vg1$CQf] */
    /* JADX WARN: Type inference failed for: r7v5, types: [T, vg1$F1] */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        k33 k33Var;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i != 0) {
            if (i == 1) {
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
        k33Var = this.B;
        Object obj2 = this.C;
        if (!(obj2 instanceof dw2)) {
            throw new IllegalStateException(ev4.m("\n|Fail to prepare request body for sending. \n|The body type is: " + nl3.a(obj2.getClass()) + ", with Content-Type: " + ac.b((tf1) k33Var.w) + ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header.").toString());
        }
        ig1 ig1Var = (ig1) k33Var.w;
        if (obj2 == null) {
            ig1Var.d = kd.A;
            xb5 xb5VarC = nl3.c(dw2.class);
            ig1Var.b(new rb5(pc5.e(xb5VarC), nl3.a(dw2.class), xb5VarC));
        } else if (obj2 instanceof dw2) {
            ig1Var.d = obj2;
            ig1Var.b(null);
        } else {
            ig1Var.d = obj2;
            xb5 xb5VarC2 = nl3.c(dw2.class);
            ig1Var.b(new rb5(pc5.e(xb5VarC2), nl3.a(dw2.class), xb5VarC2));
        }
        vg1 vg1Var = this.D;
        ?? cQf = new vg1.CQf(vg1Var.a, this.E);
        jl3 jl3Var = new jl3();
        jl3Var.w = cQf;
        ArrayList arrayList = vg1Var.b;
        int iJ = ps0.J(arrayList);
        op1 op1Var = new op1(iJ, ddf.i(iJ, 0, -1), -1);
        while (op1Var.y) {
            jl3Var.w = new vg1.F1((y81) arrayList.get(op1Var.nextInt()), (u94) jl3Var.w);
        }
        u94 u94Var = (u94) jl3Var.w;
        ig1 ig1Var2 = (ig1) k33Var.w;
        this.B = k33Var;
        this.A = 1;
        obj = u94Var.a(ig1Var2, this);
        if (obj == va0Var) {
            return va0Var;
        }
        this.B = null;
        this.A = 2;
        if (k33Var.e((ve1) obj, this) == va0Var) {
            return va0Var;
        }
        return sd5.a;
    }

    @Override // defpackage.y81
    public final Object invoke(k33<Object, ig1> k33Var, Object obj, z80<? super sd5> z80Var) {
        wg1 wg1Var = new wg1(this.D, this.E, z80Var);
        wg1Var.B = k33Var;
        wg1Var.C = obj;
        return wg1Var.i(sd5.a);
    }
}
