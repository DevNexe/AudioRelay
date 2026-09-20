package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e15 extends u05 {
    public final Runnable y;

    public e15(Runnable runnable, long j, a15 a15Var) {
        super(j, a15Var);
        this.y = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.y.run();
        } finally {
            this.x.a();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.y;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(lf0.a(runnable));
        sb.append(", ");
        sb.append(this.w);
        sb.append(", ");
        sb.append(this.x);
        sb.append(']');
        return sb.toString();
    }
}
