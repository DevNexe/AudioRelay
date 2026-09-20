package defpackage;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public final class up2 {
    public final Bundle a;
    public IconCompat b;
    public final ko3[] c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final boolean g;

    @Deprecated
    public final int h;
    public final CharSequence i;
    public final PendingIntent j;
    public final boolean k;

    public up2(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        IconCompat iconCompatB = i == 0 ? null : IconCompat.b(null, "", i);
        Bundle bundle = new Bundle();
        this.e = true;
        this.b = iconCompatB;
        if (iconCompatB != null) {
            int iC = iconCompatB.a;
            if (iC == -1 && Build.VERSION.SDK_INT >= 23) {
                iC = IconCompat.QnHx.c(iconCompatB.b);
            }
            if (iC == 2) {
                this.h = iconCompatB.c();
            }
        }
        this.i = xp2.b(charSequence);
        this.j = pendingIntent;
        this.a = bundle;
        this.c = null;
        this.d = true;
        this.f = 0;
        this.e = true;
        this.g = false;
        this.k = false;
    }
}
