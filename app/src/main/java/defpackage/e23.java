package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e23<TSubject, Call> {
    public static final ArrayList e = new ArrayList();
    public final ta2 a;
    public final a43 b;
    public List<y81<k33<TSubject, Call>, TSubject, z80<? super sd5>, Object>> c;
    public boolean d;

    public e23() {
        throw null;
    }

    public e23(ta2 ta2Var, a43 a43Var) {
        ArrayList arrayList = e;
        List<y81<k33<TSubject, Call>, TSubject, z80<? super sd5>, Object>> listB = sb5.b(arrayList);
        this.a = ta2Var;
        this.b = a43Var;
        this.c = listB;
        this.d = true;
        if (!arrayList.isEmpty()) {
            throw new IllegalStateException("The shared empty array list has been modified".toString());
        }
    }

    public final String toString() {
        return "Phase `" + ((String) this.a.x) + "`, " + this.c.size() + " handlers";
    }
}
