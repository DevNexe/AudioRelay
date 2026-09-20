package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vf5 extends cx1 implements j81<Object, Object> {
    public final /* synthetic */ Map<Object, Object> w;
    public final /* synthetic */ j81<Object, Object> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf5(LinkedHashMap linkedHashMap, t6 t6Var) {
        super(1);
        this.w = linkedHashMap;
        this.x = t6Var;
    }

    @Override // defpackage.j81
    public final Object invoke(Object obj) {
        Map<Object, Object> map = this.w;
        Object obj2 = map.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        Object objInvoke = this.x.invoke(obj);
        map.put(obj, objInvoke);
        return objInvoke;
    }
}
