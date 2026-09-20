package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g42 extends cx1 implements x81<g34, Object, Object> {
    public final /* synthetic */ x81<g34, Object, List<Object>> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g42(x81<? super g34, Object, ? extends List<Object>> x81Var) {
        super(2);
        this.w = x81Var;
    }

    @Override // defpackage.x81
    public final Object invoke(g34 g34Var, Object obj) {
        g34 g34Var2 = g34Var;
        List<Object> listInvoke = this.w.invoke(g34Var2, obj);
        int size = listInvoke.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = listInvoke.get(i);
            if (obj2 != null && !g34Var2.a(obj2)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        List<Object> list = listInvoke;
        if (!list.isEmpty()) {
            return new ArrayList(list);
        }
        return null;
    }
}
