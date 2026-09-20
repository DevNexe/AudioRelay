package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e37 implements p37 {
    public final p37[] a;

    public e37(p37... p37VarArr) {
        this.a = p37VarArr;
    }

    @Override // defpackage.p37
    public final o37 a(Class cls) {
        for (int i = 0; i < 2; i++) {
            p37 p37Var = this.a[i];
            if (p37Var.b(cls)) {
                return p37Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // defpackage.p37
    public final boolean b(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
