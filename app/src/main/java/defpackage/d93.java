package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d93 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final boolean g;
    public final int h;
    public final long i;
    public final List<bd1> j;
    public l70 k;

    public d93() {
        throw null;
    }

    public d93(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = z2;
        this.h = i;
        this.i = j6;
        this.k = new l70(z3, z3);
    }

    public final void a() {
        l70 l70Var = this.k;
        l70Var.b = true;
        l70Var.a = true;
    }

    public final boolean b() {
        l70 l70Var = this.k;
        return l70Var.b || l70Var.a;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) c93.b(this.a));
        sb.append(", uptimeMillis=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append((Object) kt2.i(this.c));
        sb.append(", pressed=");
        sb.append(this.d);
        sb.append(", previousUptimeMillis=");
        sb.append(this.e);
        sb.append(", previousPosition=");
        sb.append((Object) kt2.i(this.f));
        sb.append(", previousPressed=");
        sb.append(this.g);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        int i = this.h;
        if (i == 1) {
            str = "Touch";
        } else if (i == 2) {
            str = "Mouse";
        } else if (i != 3) {
            str = i != 4 ? "Unknown" : "Eraser";
        } else {
            str = "Stylus";
        }
        sb.append((Object) str);
        sb.append(", historical=");
        Object obj = this.j;
        if (obj == null) {
            obj = cs0.w;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) kt2.i(this.i));
        sb.append(')');
        return sb.toString();
    }

    public d93(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, List list, long j6) {
        this(j, j2, j3, z, j4, j5, z2, false, i, j6);
        this.j = list;
    }
}
