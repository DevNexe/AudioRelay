package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m12 extends cx1 implements h81<ap4> {
    public final /* synthetic */ o12 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m12(o12 o12Var) {
        super(0);
        this.w = o12Var;
    }

    @Override // defpackage.h81
    public final ap4 invoke() {
        o12 o12Var = this.w;
        List<k02> listE = o12Var.a.g().e();
        n12 n12Var = n12.F;
        Iterator<T> it = listE.iterator();
        p12 p12Var = null;
        while (it.hasNext()) {
            p12 p12VarInvoke = n12Var.invoke(it.next());
            p12 p12Var2 = p12VarInvoke;
            if (p12Var2.b() <= o12Var.b.invoke(o12Var, p12Var2).intValue()) {
                p12Var = p12VarInvoke;
            }
        }
        return p12Var;
    }
}
