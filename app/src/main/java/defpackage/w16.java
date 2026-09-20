package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class w16 {
    public final String a;
    public final boolean b;

    public w16(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == w16.class) {
            w16 w16Var = (w16) obj;
            if (TextUtils.equals(this.a, w16Var.a) && this.b == w16Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (true != this.b ? 1237 : 1231);
    }
}
