package defpackage;

import defpackage.fz1;
import defpackage.pg2;

/* JADX INFO: loaded from: classes.dex */
public class fz1<T extends fz1<T, M>, M extends pg2> {
    public final kz1 w;
    public final M x;
    public T y;
    public boolean z;

    public fz1(kz1 kz1Var, M m) {
        this.w = kz1Var;
        this.x = m;
    }

    public void a() {
        this.z = true;
    }

    public void b() {
        this.z = false;
    }
}
