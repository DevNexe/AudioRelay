package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gu6 implements lu6 {
    public final lu6[] a;

    public gu6(lu6... lu6VarArr) {
        this.a = lu6VarArr;
    }

    @Override // defpackage.lu6
    public final ku6 a(Class cls) {
        for (int i = 0; i < 2; i++) {
            lu6 lu6Var = this.a[i];
            if (lu6Var.b(cls)) {
                return lu6Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // defpackage.lu6
    public final boolean b(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
