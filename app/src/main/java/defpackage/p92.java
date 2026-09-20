package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p92 extends cx1 implements x81<g34, Object, List<? extends Object>> {
    public final /* synthetic */ x81<g34, Object, Map<String, Object>> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p92(x81<? super g34, Object, ? extends Map<String, ? extends Object>> x81Var) {
        super(2);
        this.w = x81Var;
    }

    @Override // defpackage.x81
    public final List<? extends Object> invoke(g34 g34Var, Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Object> entry : this.w.invoke(g34Var, obj).entrySet()) {
            arrayList.add(entry.getKey());
            arrayList.add(entry.getValue());
        }
        return arrayList;
    }
}
