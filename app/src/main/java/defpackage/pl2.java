package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pl2 extends cx1 implements j81<zl0, yl0> {
    public final /* synthetic */ ri2<Boolean> w;
    public final /* synthetic */ is4<List<kk2>> x;
    public final /* synthetic */ z20 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pl2(ri2<Boolean> ri2Var, is4<? extends List<kk2>> is4Var, z20 z20Var) {
        super(1);
        this.w = ri2Var;
        this.x = is4Var;
        this.y = z20Var;
    }

    @Override // defpackage.j81
    public final yl0 invoke(zl0 zl0Var) {
        ri2<Boolean> ri2Var = this.w;
        boolean zBooleanValue = ri2Var.getValue().booleanValue();
        z20 z20Var = this.y;
        is4<List<kk2>> is4Var = this.x;
        if (zBooleanValue) {
            Iterator<T> it = is4Var.getValue().iterator();
            while (it.hasNext()) {
                z20Var.b().b((kk2) it.next());
            }
            ri2Var.setValue(Boolean.FALSE);
        }
        return new ol2(is4Var, z20Var);
    }
}
