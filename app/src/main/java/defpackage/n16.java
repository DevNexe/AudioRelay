package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n16 {
    public final ArrayList a = new ArrayList();

    public abstract ez5 a(String str, ma5 ma5Var, ArrayList arrayList);

    public final void b(String str) {
        if (!this.a.contains(nw6.e(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}
