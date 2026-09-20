package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xe5 {
    public final cd5 a;
    public final String b;
    public final int c;
    public final List<String> d;
    public final fz2 e;
    public final String f;
    public final String g;
    public final String h;
    public final ry4 i;
    public final ry4 j;

    public xe5(cd5 cd5Var, String str, int i, ArrayList arrayList, fz2 fz2Var, String str2, String str3, String str4) {
        this.a = cd5Var;
        this.b = str;
        this.c = i;
        this.d = arrayList;
        this.e = fz2Var;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        if (!((i >= 0 && i < 65536) || i == 0)) {
            throw new IllegalArgumentException("port must be between 0 and 65535, or 0 if not set".toString());
        }
        new ry4(new te5(this));
        new ry4(new ve5(this));
        new ry4(new ue5(this));
        this.i = new ry4(new we5(this));
        this.j = new ry4(new se5(this));
        new ry4(new re5(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ur1.a(nl3.a(xe5.class), nl3.a(obj.getClass())) && ur1.a(this.h, ((xe5) obj).h);
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return this.h;
    }
}
