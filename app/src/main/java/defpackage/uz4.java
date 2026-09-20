package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class uz4 {
    public final ConcurrentHashMap<fz4, vz4> a = new ConcurrentHashMap<>();
    public final dw4<rz4> b = new rg3().G();

    public final void a(String str, vz4 vz4Var) {
        a62 a62Var = a62.a;
        if (vz4Var instanceof vz4.QnHx) {
            a62Var.l("System error: " + ((vz4.QnHx) vz4Var).a.getId());
        }
        this.a.put(new fz4(str), vz4Var);
        this.b.g(new rz4(str, vz4Var));
    }
}
