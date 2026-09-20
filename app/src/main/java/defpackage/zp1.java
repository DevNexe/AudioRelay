package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zp1 {
    public final Map<c93, d93> a;
    public final g93 b;
    public boolean c;

    public zp1(LinkedHashMap linkedHashMap, g93 g93Var) {
        this.a = linkedHashMap;
        this.b = g93Var;
    }

    public final boolean a(long j) {
        h93 h93Var;
        List<h93> list = this.b.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                h93Var = null;
                break;
            }
            h93Var = list.get(i);
            if (c93.a(h93Var.a, j)) {
                break;
            }
            i++;
        }
        h93 h93Var2 = h93Var;
        if (h93Var2 != null) {
            return h93Var2.g;
        }
        return false;
    }
}
