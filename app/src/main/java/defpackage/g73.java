package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class g73 {
    public final boolean a;
    public final Boolean b;
    public final Boolean c;

    public g73() {
        this(0);
    }

    public g73(Boolean bool, Boolean bool2, boolean z) {
        this.a = z;
        this.b = bool;
        this.c = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g73)) {
            return false;
        }
        g73 g73Var = (g73) obj;
        return this.a == g73Var.a && ur1.a(this.b, g73Var.b) && ur1.a(this.c, g73Var.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Boolean bool = this.b;
        int iHashCode = (i + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.c;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "State(canShowAndroid11MediaStyleNotification=" + this.a + ", isAndroid11MediaStyleNotificationEnabled=" + this.b + ", shouldHandleNoisyEvents=" + this.c + ")";
    }

    public /* synthetic */ g73(int i) {
        this(null, null, Build.VERSION.SDK_INT >= 30);
    }
}
