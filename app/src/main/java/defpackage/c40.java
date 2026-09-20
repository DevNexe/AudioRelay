package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c40 extends cx1 implements y81<jE<?>, mn4, xl3, sd5> {
    public final /* synthetic */ ln4 w;
    public final /* synthetic */ Z1 x;
    public final /* synthetic */ List<y81<jE<?>, mn4, xl3, sd5>> y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c40(ln4 ln4Var, Z1 z1, ArrayList arrayList) {
        super(3);
        this.w = ln4Var;
        this.x = z1;
        this.y = arrayList;
    }

    @Override // defpackage.y81
    public final sd5 invoke(jE<?> jEVar, mn4 mn4Var, xl3 xl3Var) {
        jE<?> jEVar2 = jEVar;
        mn4 mn4Var2 = mn4Var;
        xl3 xl3Var2 = xl3Var;
        List<y81<jE<?>, mn4, xl3, sd5>> list = this.y;
        ln4 ln4Var = this.w;
        mn4 mn4VarC = ln4Var.c();
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).invoke(jEVar2, mn4VarC, xl3Var2);
            }
            sd5 sd5Var = sd5.a;
            mn4VarC.f();
            mn4Var2.e();
            Z1 z1 = this.x;
            z1.getClass();
            mn4Var2.t(ln4Var, ln4Var.a(z1));
            mn4Var2.j();
            return sd5.a;
        } catch (Throwable th) {
            mn4VarC.f();
            throw th;
        }
    }
}
