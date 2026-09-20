package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sv6 extends dv6 {
    public boolean b;

    public sv6(dq6 dq6Var) {
        super(dq6Var);
        this.a.E++;
    }

    public abstract boolean f();

    public final void g() {
        if (!this.b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void h() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (f()) {
            return;
        }
        this.a.a();
        this.b = true;
    }
}
