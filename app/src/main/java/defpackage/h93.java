package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h93 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final List<bd1> h;
    public final long i;

    public h93() {
        throw null;
    }

    public h93(long j, long j2, long j3, long j4, boolean z, int i, boolean z2, ArrayList arrayList, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = i;
        this.g = z2;
        this.h = arrayList;
        this.i = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h93)) {
            return false;
        }
        h93 h93Var = (h93) obj;
        if (c93.a(this.a, h93Var.a) && this.b == h93Var.b && kt2.a(this.c, h93Var.c) && kt2.a(this.d, h93Var.d) && this.e == h93Var.e) {
            return (this.f == h93Var.f) && this.g == h93Var.g && ur1.a(this.h, h93Var.h) && kt2.a(this.i, h93Var.i);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int iE = (kt2.e(this.d) + ((kt2.e(this.c) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31)) * 31;
        boolean z = this.e;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (((iE + r2) * 31) + this.f) * 31;
        boolean z2 = this.g;
        return kt2.e(this.i) + qg5.a(this.h, (i + (z2 ? 1 : z2)) * 31, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) c93.b(this.a));
        sb.append(", uptime=");
        sb.append(this.b);
        sb.append(", positionOnScreen=");
        sb.append((Object) kt2.i(this.c));
        sb.append(", position=");
        sb.append((Object) kt2.i(this.d));
        sb.append(", down=");
        sb.append(this.e);
        sb.append(", type=");
        int i = this.f;
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
        sb.append(", issuesEnterExit=");
        sb.append(this.g);
        sb.append(", historical=");
        sb.append(this.h);
        sb.append(", scrollDelta=");
        sb.append((Object) kt2.i(this.i));
        sb.append(')');
        return sb.toString();
    }
}
