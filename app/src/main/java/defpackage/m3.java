package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class m3 extends kc0 {
    public final Context a;
    public final at b;
    public final at c;
    public final String d;

    public m3(Context context, at atVar, at atVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.a = context;
        if (atVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.b = atVar;
        if (atVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.c = atVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.d = str;
    }

    @Override // defpackage.kc0
    public final Context a() {
        return this.a;
    }

    @Override // defpackage.kc0
    public final String b() {
        return this.d;
    }

    @Override // defpackage.kc0
    public final at c() {
        return this.c;
    }

    @Override // defpackage.kc0
    public final at d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kc0)) {
            return false;
        }
        kc0 kc0Var = (kc0) obj;
        return this.a.equals(kc0Var.a()) && this.b.equals(kc0Var.d()) && this.c.equals(kc0Var.c()) && this.d.equals(kc0Var.b());
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return i5.b(sb, this.d, "}");
    }
}
