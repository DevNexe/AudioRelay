package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gl2 {
    public final zl2<fl2> a;
    public final int b;
    public final String c;
    public final LinkedHashMap d;
    public final ArrayList e;
    public final LinkedHashMap f;
    public final cm2 g;
    public final String h;
    public final ArrayList i;

    public gl2(cm2 cm2Var, String str, String str2) {
        cm2Var.getClass();
        this.a = cm2Var.b(cm2.QnHx.a(hl2.class));
        this.b = -1;
        this.c = str2;
        this.d = new LinkedHashMap();
        this.e = new ArrayList();
        this.f = new LinkedHashMap();
        this.i = new ArrayList();
        this.g = cm2Var;
        this.h = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [dl2, fl2, java.lang.Object] */
    public final fl2 a() {
        ?? A = this.a.a();
        String str = this.c;
        if (str != null) {
            A.f(str);
        }
        int i = this.b;
        if (i != -1) {
            A.C = i;
        }
        A.y = null;
        for (Map.Entry entry : this.d.entrySet()) {
            A.B.put((String) entry.getKey(), (ik2) entry.getValue());
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            A.a((yk2) it.next());
        }
        for (Map.Entry entry2 : this.f.entrySet()) {
            int iIntValue = ((Number) entry2.getKey()).intValue();
            hk2 hk2Var = (hk2) entry2.getValue();
            if (!(!(A instanceof cOm4Fixed.QnHx))) {
                throw new UnsupportedOperationException("Cannot add action " + iIntValue + " to " + ((Object) A) + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
            }
            if (!(iIntValue != 0)) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
            }
            A.A.j(iIntValue, hk2Var);
        }
        return A;
    }
}
