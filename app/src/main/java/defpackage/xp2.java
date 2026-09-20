package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xp2 {
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public int h;
    public zp2 j;
    public boolean l;
    public boolean m;
    public Bundle n;
    public String q;
    public final boolean r;
    public final Notification s;

    @Deprecated
    public final ArrayList<String> t;
    public final ArrayList<up2> b = new ArrayList<>();
    public final ArrayList<d23> c = new ArrayList<>();
    public final ArrayList<up2> d = new ArrayList<>();
    public final boolean i = true;
    public boolean k = false;
    public int o = 0;
    public int p = 0;

    public xp2(Context context, String str) {
        Notification notification = new Notification();
        this.s = notification;
        this.a = context;
        this.q = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.h = 0;
        this.t = new ArrayList<>();
        this.r = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Notification notificationBuild;
        Bundle bundle;
        eq2 eq2Var = new eq2(this);
        xp2 xp2Var = eq2Var.b;
        zp2 zp2Var = xp2Var.j;
        if (zp2Var != null) {
            zp2Var.b(eq2Var);
        }
        if (zp2Var != null) {
            zp2Var.e();
        }
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = eq2Var.a;
        if (i < 26 && i < 24) {
            builder.setExtras(eq2Var.c);
            notificationBuild = builder.build();
        } else {
            notificationBuild = builder.build();
        }
        if (zp2Var != null) {
            zp2Var.d();
        }
        if (zp2Var != null) {
            xp2Var.j.getClass();
        }
        if (zp2Var != null && (bundle = notificationBuild.extras) != null) {
            zp2Var.a(bundle);
        }
        return notificationBuild;
    }

    public final void c(int i, boolean z) {
        Notification notification = this.s;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void d(zp2 zp2Var) {
        if (this.j != zp2Var) {
            this.j = zp2Var;
            if (zp2Var != null) {
                zp2Var.f(this);
            }
        }
    }
}
