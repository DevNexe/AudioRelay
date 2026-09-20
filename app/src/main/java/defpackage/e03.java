package defpackage;

import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class e03 extends cx1 implements h81<HashMap<Object, LinkedHashSet<aw1>>> {
    public final /* synthetic */ f03 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e03(f03 f03Var) {
        super(0);
        this.w = f03Var;
    }

    @Override // defpackage.h81
    public final HashMap<Object, LinkedHashSet<aw1>> invoke() {
        e40.CQf cQf = e40.a;
        HashMap<Object, LinkedHashSet<aw1>> map = new HashMap<>();
        f03 f03Var = this.w;
        int size = f03Var.a.size();
        for (int i = 0; i < size; i++) {
            aw1 aw1Var = f03Var.a.get(i);
            Object obj = aw1Var.b;
            int i2 = aw1Var.a;
            Object us1Var = obj != null ? new us1(Integer.valueOf(i2), aw1Var.b) : Integer.valueOf(i2);
            LinkedHashSet<aw1> linkedHashSet = map.get(us1Var);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>();
                map.put(us1Var, linkedHashSet);
            }
            linkedHashSet.add(aw1Var);
        }
        return map;
    }
}
