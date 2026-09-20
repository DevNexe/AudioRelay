package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q92 extends cx1 implements j81<List<? extends Object>, Object> {
    public final /* synthetic */ j81<Map<String, ? extends Object>, Object> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q92(j81<? super Map<String, ? extends Object>, Object> j81Var) {
        super(1);
        this.w = j81Var;
    }

    @Override // defpackage.j81
    public final Object invoke(List<? extends Object> list) {
        List<? extends Object> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!(list2.size() % 2 == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        for (int i = 0; i < list2.size(); i += 2) {
            Object obj = list2.get(i);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            linkedHashMap.put((String) obj, list2.get(i + 1));
        }
        return this.w.invoke(linkedHashMap);
    }
}
