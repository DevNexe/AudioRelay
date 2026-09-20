package androidx.lifecycle;

import defpackage.d32;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements auxFixed {
    public final Object w;
    public final CQf.QnHx x;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.w = obj;
        this.x = CQf.c.b(obj.getClass());
    }

    @Override // androidx.lifecycle.auxFixed
    public final void h(d32 d32Var, YKK.CQf cQf) {
        HashMap map = this.x.a;
        List list = (List) map.get(cQf);
        Object obj = this.w;
        CQf.QnHx.a(list, d32Var, cQf, obj);
        CQf.QnHx.a((List) map.get(YKK.CQf.ON_ANY), d32Var, cQf, obj);
    }
}
