package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j12 {
    public final kz2 a;
    public final kz2 b;
    public boolean c;
    public Object d;

    public j12(int i, int i2) {
        this.a = ps0.R(new re0(i));
        this.b = ps0.R(Integer.valueOf(i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i, int i2) {
        if (!(((float) i) >= 0.0f)) {
            throw new IllegalArgumentException(("Index should be non-negative (" + i + ')').toString());
        }
        kz2 kz2Var = this.a;
        if (!(i == ((re0) kz2Var.getValue()).a)) {
            kz2Var.setValue(new re0(i));
        }
        kz2 kz2Var2 = this.b;
        if (i2 != ((Number) kz2Var2.getValue()).intValue()) {
            kz2Var2.setValue(Integer.valueOf(i2));
        }
    }
}
