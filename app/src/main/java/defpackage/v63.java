package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import com.azefsw.audioconnect.R;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class v63 {
    public final Context a;
    public final g03 b;

    public /* synthetic */ class QnHx {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[O.j(2).length];
            iArr[0] = 1;
            iArr[1] = 2;
            a = iArr;
        }
    }

    public v63(Context context, g03 g03Var) {
        this.a = context;
        this.b = g03Var;
    }

    public final void a(xp2 xp2Var, String str, int i, String str2) {
        xp2Var.b.add(new up2(i, str, PendingIntent.getBroadcast(this.a, 0, new Intent("AUDIOCONNECT_PLAYER").putExtra("PLAY_PAUSE", str2), Build.VERSION.SDK_INT >= 23 ? 335544320 : 268435456)));
    }

    public final Notification b(w63 w63Var, MediaSessionCompat.Token token) {
        Context context = this.a;
        xp2 xp2Var = new xp2(context, "PLAYER_CHANNEL");
        xp2Var.c(2, w63Var.c);
        xp2Var.p = 1;
        xp2Var.g = this.b.b();
        xp2Var.h = 1;
        xp2Var.s.icon = R.drawable.ic_notification_inverse;
        xp2Var.o = r80.b(context, R.color.blue_icon_background);
        xp2Var.e = xp2.b(w63Var.a);
        xp2Var.f = xp2.b(w63Var.b);
        int i = w63Var.d;
        int i2 = i == 0 ? -1 : QnHx.a[O.h(i)];
        if (i2 != -1) {
            if (i2 == 1) {
                a(xp2Var, context.getString(R.string.notification_pause_button), R.drawable.ic_pause, "STOP");
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                a(xp2Var, context.getString(R.string.notification_play_button), R.drawable.ic_play, "START");
            }
        }
        xp2Var.l = false;
        xp2Var.m = true;
        if (!(Build.VERSION.SDK_INT <= 22 && mv4.y(Build.MANUFACTURER.toLowerCase(Locale.ROOT), "huawei", false))) {
            yp2 yp2Var = new yp2();
            if (w63Var.f) {
                yp2Var.b = new int[]{0};
            }
            if (token != null) {
                yp2Var.c = token;
            }
            if (xp2Var.j != yp2Var) {
                xp2Var.j = yp2Var;
                yp2Var.f(xp2Var);
            }
        }
        return xp2Var.a();
    }
}
