package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class id7 {
    public final TreeMap a = new TreeMap();
    public final TreeMap b = new TreeMap();

    public final void a(ma5 ma5Var, xi5 xi5Var) {
        w27 w27Var = new w27(xi5Var);
        TreeMap treeMap = this.a;
        for (Integer num : treeMap.keySet()) {
            ds5 ds5VarClone = ((ds5) xi5Var.y).clone();
            ez5 ez5VarD = ((az5) treeMap.get(num)).d(ma5Var, Collections.singletonList(w27Var));
            int iB = ez5VarD instanceof gw5 ? nw6.b(ez5VarD.zzh().doubleValue()) : -1;
            if (iB == 2 || iB == -1) {
                xi5Var.y = ds5VarClone;
            }
        }
        TreeMap treeMap2 = this.b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            ez5 ez5VarD2 = ((az5) treeMap2.get((Integer) it.next())).d(ma5Var, Collections.singletonList(w27Var));
            if (ez5VarD2 instanceof gw5) {
                nw6.b(ez5VarD2.zzh().doubleValue());
            }
        }
    }
}
