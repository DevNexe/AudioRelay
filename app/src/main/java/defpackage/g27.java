package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g27 extends e27 {
    public boolean c;

    public g27(r27 r27Var) {
        super(r27Var);
        this.b.q++;
    }

    public final void f() {
        if (!this.c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void g() {
        if (this.c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        h();
        this.b.r++;
        this.c = true;
    }

    public abstract void h();
}
