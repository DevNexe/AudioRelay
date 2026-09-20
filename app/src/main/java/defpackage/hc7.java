package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class hc7 extends uw5 {
    public final rz6 y;
    public final HashMap z;

    public hc7(rz6 rz6Var) {
        super("require");
        this.z = new HashMap();
        this.y = rz6Var;
    }

    @Override // defpackage.uw5
    public final ez5 d(ma5 ma5Var, List list) {
        ez5 ez5Var;
        nw6.h("require", 1, list);
        String strZzi = ma5Var.b((ez5) list.get(0)).zzi();
        HashMap map = this.z;
        if (map.containsKey(strZzi)) {
            return (ez5) map.get(strZzi);
        }
        rz6 rz6Var = this.y;
        if (rz6Var.a.containsKey(strZzi)) {
            try {
                ez5Var = (ez5) ((Callable) rz6Var.a.get(strZzi)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strZzi)));
            }
        } else {
            ez5Var = ez5.o;
        }
        if (ez5Var instanceof uw5) {
            map.put(strZzi, (uw5) ez5Var);
        }
        return ez5Var;
    }
}
