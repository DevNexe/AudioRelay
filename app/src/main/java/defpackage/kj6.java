package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kj6 extends eg6 {
    public boolean b;

    public kj6(dq6 dq6Var) {
        super(dq6Var);
        this.a.E++;
    }

    public final void f() {
        if (!this.b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void g() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (h()) {
            return;
        }
        this.a.a();
        this.b = true;
    }

    public abstract boolean h();
}
