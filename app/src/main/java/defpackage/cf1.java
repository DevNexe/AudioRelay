package defpackage;

import io.ktor.http.UnsafeHeaderException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.client.engine.HttpClientEngine$install$1", f = "HttpClientEngine.kt", l = {70, 82}, m = "invokeSuspend")
public final class cf1 extends px4 implements y81<k33<Object, ig1>, Object, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ k33 B;
    public /* synthetic */ Object C;
    public final /* synthetic */ ue1 D;
    public final /* synthetic */ ze1 E;

    public static final class QnHx extends cx1 implements j81<Throwable, sd5> {
        public final /* synthetic */ ue1 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(ue1 ue1Var, qg1 qg1Var) {
            super(1);
            this.w = ue1Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(Throwable th) throws Throwable {
            if (th != null) {
                this.w.F.a(m57.A);
            }
            return sd5.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf1(ue1 ue1Var, ze1 ze1Var, z80<? super cf1> z80Var) {
        super(3, z80Var);
        this.D = ue1Var;
        this.E = ze1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        Object objA;
        k33 k33Var;
        jg1 jg1Var;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        ue1 ue1Var = this.D;
        if (i != 0) {
            if (i == 1) {
                jg1Var = (jg1) this.C;
                k33 k33Var2 = this.B;
                C0239D.H(obj);
                k33Var = k33Var2;
                objA = obj;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }
        C0239D.H(obj);
        k33 k33Var3 = this.B;
        Object obj2 = this.C;
        ig1 ig1Var = new ig1();
        ig1Var.c((ig1) k33Var3.w);
        if (obj2 == null) {
            ig1Var.d = kd.A;
            xb5 xb5VarC = nl3.c(Object.class);
            ig1Var.b(new rb5(pc5.e(xb5VarC), nl3.a(Object.class), xb5VarC));
        } else if (obj2 instanceof dw2) {
            ig1Var.d = obj2;
            ig1Var.b(null);
        } else {
            ig1Var.d = obj2;
            xb5 xb5VarC2 = nl3.c(Object.class);
            ig1Var.b(new rb5(pc5.e(xb5VarC2), nl3.a(Object.class), xb5VarC2));
        }
        ue1Var.F.a(m57.x);
        xe5 xe5VarB = ig1Var.a.b();
        uf1 uf1Var = ig1Var.b;
        pc1 pc1Var = new pc1(ig1Var.c.b);
        Object obj3 = ig1Var.d;
        dw2 dw2Var = obj3 instanceof dw2 ? (dw2) obj3 : null;
        if (dw2Var == null) {
            throw new IllegalStateException(("No request transformation found: " + ig1Var.d).toString());
        }
        ms1 ms1Var = ig1Var.e;
        GPUw gPUw = ig1Var.f;
        jg1 jg1Var2 = new jg1(xe5VarB, uf1Var, pc1Var, dw2Var, ms1Var, gPUw);
        gPUw.a(if1.b, ue1Var.G);
        Set<String> setD = pc1Var.d();
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : setD) {
            if (rf1.a.contains((String) obj4)) {
                arrayList.add(obj4);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new UnsafeHeaderException(arrayList.toString());
        }
        Iterator<ff1<?>> it = jg1Var2.g.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ze1 ze1Var = this.E;
            if (!zHasNext) {
                this.B = k33Var3;
                this.C = jg1Var2;
                this.A = 1;
                objA = ze1.QnHx.a(ze1Var, jg1Var2, this);
                if (objA != va0Var) {
                    k33Var = k33Var3;
                    jg1Var = jg1Var2;
                    break;
                }
                return va0Var;
            }
            ff1<?> next = it.next();
            if (!ze1Var.G().contains(next)) {
                throw new IllegalArgumentException(("Engine doesn't support " + next).toString());
            }
        }
        sg1 sg1Var = (sg1) objA;
        ve1 ve1Var = new ve1(ue1Var);
        ve1Var.x = new bh0(ve1Var, jg1Var);
        ve1Var.y = new ch0(ve1Var, sg1Var);
        Object obj5 = sg1Var.e;
        if (!(obj5 instanceof fk)) {
            ve1Var.getAttributes().a(ve1.A, obj5);
        }
        qg1 qg1VarE = ve1Var.e();
        ue1Var.F.a(m57.y);
        AY.B(qg1VarE.g()).r0(new QnHx(ue1Var, qg1VarE));
        this.B = null;
        this.C = null;
        this.A = 2;
        if (k33Var.e(ve1Var, this) == va0Var) {
            return va0Var;
        }
        return sd5.a;
    }

    @Override // defpackage.y81
    public final Object invoke(k33<Object, ig1> k33Var, Object obj, z80<? super sd5> z80Var) {
        cf1 cf1Var = new cf1(this.D, this.E, z80Var);
        cf1Var.B = k33Var;
        cf1Var.C = obj;
        return cf1Var.i(sd5.a);
    }
}
