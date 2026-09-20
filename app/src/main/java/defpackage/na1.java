package defpackage;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.QnHx;

/* JADX INFO: loaded from: classes.dex */
public final class na1 extends oa1 {
    public static final Object c = new Object();
    public static final na1 d = new na1();

    public static AlertDialog f(Context context, int i, rq5 rq5Var, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(aq5.b(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = context.getResources();
        if (i == 1) {
            string = resources.getString(com.azefsw.audioconnect.R.string.common_google_play_services_install_button);
        } else if (i != 2) {
            string = i != 3 ? resources.getString(R.string.ok) : resources.getString(com.azefsw.audioconnect.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(com.azefsw.audioconnect.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, rq5Var);
        }
        String strC = aq5.c(context, i);
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i)), new IllegalArgumentException());
        return builder.create();
    }

    public static void g(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof u51) {
                a61 a61Var = ((u51) activity).K.a.z;
                yw4 yw4Var = new yw4();
                if (alertDialog == null) {
                    throw new NullPointerException("Cannot display null dialog");
                }
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                yw4Var.E0 = alertDialog;
                if (onCancelListener != null) {
                    yw4Var.F0 = onCancelListener;
                }
                yw4Var.B0 = false;
                yw4Var.C0 = true;
                a61Var.getClass();
                QnHx qnHx = new QnHx(a61Var);
                qnHx.e(0, yw4Var, str, 1);
                qnHx.d(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        st0 st0Var = new st0();
        if (alertDialog == null) {
            throw new NullPointerException("Cannot display null dialog");
        }
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        st0Var.w = alertDialog;
        if (onCancelListener != null) {
            st0Var.x = onCancelListener;
        }
        st0Var.show(fragmentManager, str);
    }

    @Override // defpackage.oa1
    public final Intent b(Context context, String str, int i) {
        return super.b(context, str, i);
    }

    @Override // defpackage.oa1
    public final int c(Context context, int i) {
        return super.c(context, i);
    }

    public final int d(Context context) {
        return c(context, oa1.a);
    }

    public final void e(Activity activity, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogF = f(activity, i, new lq5(activity, super.b(activity, "d", i)), onCancelListener);
        if (alertDialogF == null) {
            return;
        }
        g(activity, alertDialogF, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    @TargetApi(20)
    public final void h(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null), new IllegalArgumentException());
        if (i == 18) {
            new dq5(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i == 6 ? aq5.e(context, "common_google_play_services_resolution_required_title") : aq5.c(context, i);
        if (strE == null) {
            strE = context.getResources().getString(com.azefsw.audioconnect.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i == 6 || i == 19) ? aq5.d(context, "common_google_play_services_resolution_required_text", aq5.a(context)) : aq5.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        oa3.h(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        xp2 xp2Var = new xp2(context, null);
        xp2Var.k = true;
        xp2Var.c(16, true);
        xp2Var.e = xp2.b(strE);
        wp2 wp2Var = new wp2();
        wp2Var.b = xp2.b(strD);
        if (xp2Var.j != wp2Var) {
            xp2Var.j = wp2Var;
            wp2Var.f(xp2Var);
        }
        PackageManager packageManager = context.getPackageManager();
        if (ik0.a == null) {
            ik0.a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (ik0.a.booleanValue()) {
            xp2Var.s.icon = context.getApplicationInfo().icon;
            xp2Var.h = 2;
            if (ik0.c(context)) {
                xp2Var.b.add(new up2(com.azefsw.audioconnect.R.drawable.common_full_open_on_phone, resources.getString(com.azefsw.audioconnect.R.string.common_open_on_phone), pendingIntent));
            } else {
                xp2Var.g = pendingIntent;
            }
        } else {
            xp2Var.s.icon = R.drawable.stat_sys_warning;
            xp2Var.s.tickerText = xp2.b(resources.getString(com.azefsw.audioconnect.R.string.common_google_play_services_notification_ticker));
            xp2Var.s.when = System.currentTimeMillis();
            xp2Var.g = pendingIntent;
            xp2Var.f = xp2.b(strD);
        }
        if (x53.a()) {
            oa3.k(x53.a());
            synchronized (c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.azefsw.audioconnect.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            xp2Var.q = "com.google.android.gms.availability";
        }
        Notification notificationA = xp2Var.a();
        if (i == 1 || i == 2 || i == 3) {
            ra1.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationA);
    }

    public final void i(Activity activity, b32 b32Var, int i, lr5 lr5Var) {
        AlertDialog alertDialogF = f(activity, i, new qq5(super.b(activity, "d", i), b32Var), lr5Var);
        if (alertDialogF == null) {
            return;
        }
        g(activity, alertDialogF, "GooglePlayServicesErrorDialog", lr5Var);
    }
}
