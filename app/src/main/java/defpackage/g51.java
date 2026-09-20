package defpackage;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class g51 {
    public final int a;
    public final int b;
    public final Notification c;

    public g51(int i, int i2, Notification notification) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g51.class != obj.getClass()) {
            return false;
        }
        g51 g51Var = (g51) obj;
        if (this.a == g51Var.a && this.b == g51Var.b) {
            return this.c.equals(g51Var.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
