package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class wf5 extends cx1 implements j81<Object, Object> {
    public final /* synthetic */ boolean w;
    public final /* synthetic */ Map<Object, Object> x;
    public final /* synthetic */ j81<Object, Object> y;
    public final /* synthetic */ x81<Object, Object, sd5> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf5(boolean z, LinkedHashMap linkedHashMap, t6 t6Var, x81 x81Var) {
        super(1);
        this.w = z;
        this.x = linkedHashMap;
        this.y = t6Var;
        this.z = x81Var;
    }

    @Override // defpackage.j81
    public final Object invoke(Object obj) {
        boolean z = this.w;
        j81<Object, Object> j81Var = this.y;
        Map<Object, Object> map = this.x;
        x81<Object, Object, sd5> x81Var = this.z;
        if (z) {
            Object objRemove = map.remove(obj);
            if (objRemove != null) {
                x81Var.invoke(obj, objRemove);
                return objRemove;
            }
            Object objInvoke = j81Var.invoke(obj);
            x81Var.invoke(obj, objInvoke);
            return objInvoke;
        }
        Object obj2 = map.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        Object objInvoke2 = j81Var.invoke(obj);
        x81Var.invoke(obj, objInvoke2);
        map.put(obj, objInvoke2);
        return objInvoke2;
    }
}
