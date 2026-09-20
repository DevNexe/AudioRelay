package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class w17 extends kj6 {
    public w66 c;
    public final u17 d;
    public final t17 e;
    public final cq4 f;

    public w17(dq6 dq6Var) {
        super(dq6Var);
        this.d = new u17(this);
        this.e = new t17(this);
        this.f = new cq4(this);
    }

    @Override // defpackage.kj6
    public final boolean h() {
        return false;
    }

    public final void i() {
        e();
        if (this.c == null) {
            this.c = new w66(Looper.getMainLooper());
        }
    }
}
