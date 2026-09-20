package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class y97 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public y97(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == y97.class) {
            y97 y97Var = (y97) obj;
            if (TextUtils.equals(this.a, y97Var.a) && this.b == y97Var.b && this.c == y97Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((bl2.a(this.a, 31, 31) + (true != this.b ? 1237 : 1231)) * 31) + (true == this.c ? 1231 : 1237);
    }
}
