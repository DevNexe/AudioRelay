package defpackage;

import defpackage.t81;

/* JADX INFO: loaded from: classes.dex */
public final class FA4<T extends t81<? extends Boolean>> {
    public final String a;
    public final T b;

    public FA4(String str, T t) {
        this.a = str;
        this.b = t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FA4)) {
            return false;
        }
        FA4 fa4 = (FA4) obj;
        return ur1.a(this.a, fa4.a) && ur1.a(this.b, fa4.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        T t = this.b;
        return iHashCode + (t != null ? t.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
