package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class l37 {
    public static final void a(Object obj, Object obj2) {
        j37 j37Var = (j37) obj;
        if (j37Var.isEmpty()) {
            return;
        }
        Iterator it = j37Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static final j37 b(Object obj, Object obj2) {
        j37 j37VarC = (j37) obj;
        j37 j37Var = (j37) obj2;
        if (!j37Var.isEmpty()) {
            if (!j37VarC.w) {
                j37VarC = j37VarC.c();
            }
            j37VarC.i();
            if (!j37Var.isEmpty()) {
                j37VarC.putAll(j37Var);
            }
        }
        return j37VarC;
    }
}
