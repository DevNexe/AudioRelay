package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yg0 implements po1.QnHx {
    public boolean a;
    public boolean b;
    public boolean c;

    @Override // po1.QnHx
    public final void a() {
        g();
        f();
        this.b = true;
    }

    @Override // po1.QnHx
    public final void b() {
        g();
        f();
        this.b = true;
    }

    @Override // po1.QnHx
    public final void c() {
        g();
        this.a = true;
        this.b = true;
    }

    @Override // po1.QnHx
    public final void close() {
        g();
        if (!this.b) {
            throw new IllegalStateException("Input was not handled properly. To ensure you're following the MVI model properly, make sure any side-jobs are executed in a `sideJob { }` block.".toString());
        }
        this.c = true;
    }

    @Override // po1.QnHx
    public final void d() {
        g();
        f();
        this.b = true;
    }

    @Override // po1.QnHx
    public final void e() {
        g();
        f();
        this.b = true;
    }

    public final void f() {
        if (!(!this.a)) {
            throw new IllegalStateException("Side-Jobs must be the last statements of the InputHandler".toString());
        }
    }

    public final void g() {
        if (!(!this.c)) {
            throw new IllegalStateException("This InputHandlerScope has already been closed".toString());
        }
    }
}
